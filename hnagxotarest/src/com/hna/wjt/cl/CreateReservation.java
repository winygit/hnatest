package com.hna.wjt.cl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hna.wjt.AirVerifyRS.domin.AirVerifyRSClass;
import com.hna.wjt.AirVerifyRS.domin.ParaseVerify;
import com.hna.wjt.CreateReservation.domin.CreateReservationClass;
import com.hna.wjt.CreateReservation.domin.ParaseReservation;
import com.hna.wjt.domin.InterfaceRequestParas;
import com.hna.wjt.error.ServiceErrorClass;
import com.hna.wjt.util.GetData;
import com.hna.wjt.util.ParaseJson;

public class CreateReservation extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset:utf-8");
		request.setCharacterEncoding("utf-8");
		String code = request.getParameter("code");
		String fName = request.getParameter("fName");
		String lName = request.getParameter("lName");
		String mobilePhonenumber = request.getParameter("mobilePhonenumber");
		String documenttype = request.getParameter("documenttype");
		String documentnumber = request.getParameter("documentnumber");
		String documentcountry = request.getParameter("documentcountry");
		String documentexpirationDate = request
				.getParameter("documentexpirationDate");

		String traveler = "code:" + code + ";fName:" + fName + ";lName:"
				+ lName + ";mobilePhone.number:" + mobilePhonenumber
				+ ";document.type:" + documenttype + ";document.number:"
				+ documentnumber + ";document.country:" + documentcountry
				+ ";document.expirationDate:" + documentexpirationDate;

		String ccode = request.getParameter("ccode");
		String cfName = request.getParameter("cfName");
		String clName = request.getParameter("clName");
		String cmobilePhonenumber = request.getParameter("cmobilePhonenumber");
		String cemail = request.getParameter("cemail");

		String customer = "code:" + ccode + ";fName:" + cfName + ";lName:"
				+ clName + ";mobilePhone.number:" + cmobilePhonenumber
				+ ";email:" + cemail;
		String tripOptionId = request.getParameter("uri");

		InterfaceRequestParas irp = InterfaceRequestParas.getInstance();
		String url = "http://114.251.242.135:8080/gxotarest/api/create-reservation.json";

		String requestUrl = "?" + "tripOptionId=" + tripOptionId + "&traveler="
				+ traveler + "&customer=" + customer + "&OTACode="
				+ irp.getOTAcode() + "&timestamp=" + irp.getTimestamp()
				+ "&token=" + irp.getToken();
		requestUrl = url + requestUrl;
		// String requestUrl2=java.net.URLEncoder.encode(requestUrl, "utf-8");
		// String requestUrl2=new
		// String(requestUrl.getBytes("utf-8"),"iso-8859-1");
		// 联网获取
		String jsonstr = GetData.getRS2(requestUrl);
		// System.out.println("cc:" + jsonstr);
		// System.out.println("requestUrl:" + requestUrl);
		// System.out.println("requestUrl2:" + requestUrl);
		try {
			CreateReservationClass rs = ParaseJson.Parse(jsonstr,
					ParaseReservation.class).getCreateReservation();

			// 不联网下test
			// String pathString="D:\\VerifyTrips.json";

			// CreateReservationClass
			// rs=ParaseJson.Parse(pathString,ParaseReservation.class,1).getCreateReservation();

			String uriStr = rs.getReservationCode();
			request.setAttribute("uri", uriStr);

			request.getRequestDispatcher("WEB-INF/DocumentReservation.jsp")
					.forward(request, response);

			/*
			 * PrintWriter out = response.getWriter(); out.println("<HTML>");
			 * out.println("url: "+requestUrl); out.println("<hr>");
			 * out.println("订票成功"); out.println("<hr>");
			 * out.println("jsonstr: "+jsonstr); out.println("</HTML>");
			 * out.close();
			 */

		} catch (Exception e) {
			System.out.println("createReservation: " + jsonstr);
			com.hna.wjt.error.Error err = ParaseJson.Parse(jsonstr,
					ServiceErrorClass.class).getServiceError();
			request.setAttribute("errCode", err.getCode());
			request.setAttribute("errInfo", err.getDescription());
			request.getRequestDispatcher("WEB-INF/error.jsp").forward(request,
					response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
