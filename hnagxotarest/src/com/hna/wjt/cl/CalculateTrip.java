package com.hna.wjt.cl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hna.wjt.CalculateTrip.domin.CalculateTripRS;
import com.hna.wjt.CalculateTrip.domin.ParaseCalTrip;
import com.hna.wjt.domin.InterfaceRequestParas;
import com.hna.wjt.search.domin.AirLowFareSearchRSClass;
import com.hna.wjt.search.domin.LowPriceSearchRS;
import com.hna.wjt.search.domin.FareFamilyContent.AttributeListClass;
import com.hna.wjt.search.domin.FareFamilyContent.EntryListClass;
import com.hna.wjt.search.domin.SelectedTrip.TravelerTripPricingListClass;
import com.hna.wjt.search.domin.TaxFeeContent.TaxFeeListClass;
import com.hna.wjt.util.GetData;
import com.hna.wjt.util.ParaseJson;

public class CalculateTrip extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");

		String index = request.getParameter("select");
		String uri = request.getParameter("uri");

		InterfaceRequestParas irp = InterfaceRequestParas.getInstance();
		String url = "http://114.251.242.135:8080/gxotarest/api/calculate-trip";
		String requestUrl = "?" + "searchId=" + uri + "&index=" + index
				+ "&OTACode=" + irp.getOTAcode() + "&timestamp="
				+ irp.getTimestamp() + "&token=" + irp.getToken();

		requestUrl = url + requestUrl;
		// System.out.println("uri="+requestUrl);

		// 联网获取
		String jsonstr = GetData.getRS2(requestUrl);
		// System.out.println("rs="+jsonstr);
		CalculateTripRS rs = ParaseJson.Parse(jsonstr, ParaseCalTrip.class)
				.getTripCalculationRS();

		// 不联网下test
		// String pathString="D:\\calTrip.json";
		// CalculateTripRS
		// rs=ParaseJson.Parse(pathString,ParaseCalTrip.class,1).getTripCalculationRS();

		String uriStr = rs.getTrip().getUri();
		request.setAttribute("uri", uriStr);

		saveTosession(request, rs);

		request.getRequestDispatcher("WEB-INF/calTrip.jsp").forward(request,
				response);
	}

	private void saveTosession(HttpServletRequest request, CalculateTripRS rs) {
		// 保存所有费用
		String totalFare = rs.getTrip().getTripPricing().getTotalFareAmount()
				+ "";
		// 基本费用
		TravelerTripPricingListClass ttpls = rs.getTrip().getTripPricing()
				.getTravelerTripPricing()[0];
		String BaseFareAmount = ttpls.getFare().getBaseFareAmount() + "";
		// 货币单位
		String Currency = ttpls.getFare().getBaseFareCurrency() + "";
		// fee
		String feeAmount = ttpls.getFare().getFees().getFee()[0].getAmount()
				+ "";
		String TaxFeeRef = ttpls.getFare().getFees().getFee()[0].getTaxFeeRef();
		String feeInfo = "";
		// tax
		String TaxAmount = ttpls.getFare().getTaxes().getTax()[0].getAmount()
				+ "";
		String TaxFeeRef2 = ttpls.getFare().getTaxes().getTax()[0]
				.getTaxFeeRef();
		String TaxInfo = "";
		// 税费明细
		TaxFeeListClass[] tflc = rs.getTrip().getTaxFeeContent().getTaxFee();
		for (TaxFeeListClass tf : tflc) {
			if (tf.getID().equals(TaxFeeRef)) {
				feeInfo += tf.getEntry()[0].getName() + " ";
			}
			if (tf.getID().equals(TaxFeeRef2)) {
				TaxInfo += tf.getEntry()[0].getName() + " ";
			}
		}
		// FareFamilyContent 属性明细
		ArrayList<String> fareFamilyContentAttributeVal = new ArrayList<String>();
		AttributeListClass[] alcClass = rs.getTrip().getFareFamilyContent()
				.getFareFamily()[0].getAttribute();
		for (AttributeListClass entry : alcClass) {

			fareFamilyContentAttributeVal.add(entry.getEntry()[1].getValue());
		}
		// 航班类型
		String fareFamilyContentNameVal = rs.getTrip().getFareFamilyContent()
				.getFareFamily()[0].getName().getEntry()[1].getValue();

		HttpSession session = request.getSession();
		session.setAttribute("totalFare", totalFare);
		session.setAttribute("BaseFareAmount", BaseFareAmount);
		session.setAttribute("Currency", Currency);
		session.setAttribute("feeAmount", feeAmount);
		session.setAttribute("feeInfo", feeInfo);
		session.setAttribute("TaxAmount", TaxAmount);
		session.setAttribute("TaxInfo", TaxInfo);
		session.setAttribute("FCNVal", fareFamilyContentNameVal);
		session.setAttribute("FCAVal", fareFamilyContentAttributeVal);
		// session.setMaxInactiveInterval(25*60);//25分钟
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
