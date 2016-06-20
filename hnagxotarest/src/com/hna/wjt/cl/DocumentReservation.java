package com.hna.wjt.cl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hna.wjt.DocumentReservation.domin.DocumentReservationClass;
import com.hna.wjt.DocumentReservation.domin.ParaseDocumentReservation;
import com.hna.wjt.domin.InterfaceRequestParas;
import com.hna.wjt.util.GetData;
import com.hna.wjt.util.ParaseJson;

public class DocumentReservation extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset:utf-8");
		String reservationCode = request.getParameter("reservationCode");
		String alipaySeq = "2016061200001000310038018115";
		String paymentSeq = "20160612163122102345671";
		String amount = (String) request.getSession().getAttribute("totalFare");
		String currencyCode = "CNY";
		String payDate = "2016-06-14";
		String payTime = "16:31:22";
		String bankGroupCode = "APAY";
		String bankGroupID = "800";
		String bankCode = "yue";
		String bankID = "801";
		String creditCardCompanyCode = "F1";

		InterfaceRequestParas irp = InterfaceRequestParas.getInstance();
		String url = "http://114.251.242.135:8080/gxotarest/api/document-reservation.json";
		String requestUrl = "?" + "reservationCode=" + reservationCode
				+ "&alipaySeq=" + alipaySeq + "&paymentSeq=" + paymentSeq
				+ "&amount=" + amount + "&currencyCode=" + currencyCode
				+ "&payDate=" + payDate + "&payTime=" + payTime
				+ "&bankGroupCode=" + bankGroupCode + "&bankGroupID="
				+ bankGroupID + "&bankCode=" + bankCode + "&bankID=" + bankID
				+ "&creditCardCompanyCode=" + creditCardCompanyCode
				+ "&OTACode=" + irp.getOTAcode() + "&timestamp="
				+ irp.getTimestamp() + "&token=" + irp.getToken();
		requestUrl = url + requestUrl;
		// 联网获取
		String jsonstr = GetData.getRS2(requestUrl);

		DocumentReservationClass rs = ParaseJson.Parse(jsonstr, 
				ParaseDocumentReservation.class).getDocumentReservation();
		// 不联网下test
		// String pathString="D:\\DocumentReservation.json";

		// DocumentReservationClass
		// rs=ParaseJson.Parse(pathString,ParaseDocumentReservation.class,1).getDocumentReservationClass();

		String TicketNo = rs.getTicketNo().getTicketNo();
		String reservationCodeS=rs.getReservationCode();
		HttpSession session = request.getSession();
		session.setAttribute("TicketNo", TicketNo);
		session.setAttribute("reservationCodeS",reservationCodeS);
		request.getRequestDispatcher("WEB-INF/DocumentReservationOK.jsp").forward(
				request, response);

		// System.out.println("url: "+requestUrl);
		// System.out.println("jsonstr: "+jsonstr);
		// PrintWriter out = response.getWriter();
		// out.println("<HTML>");
		// out.println("url: "+requestUrl);
		// out.println("<hr>");
		// out.println("jsonstr: "+jsonstr);
		// out.println("</HTML>");
		// out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
