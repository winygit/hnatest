package com.hna.wjt.cl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hna.wjt.AirVerifyRS.domin.AirVerifyRSClass;
import com.hna.wjt.AirVerifyRS.domin.ParaseVerify;
import com.hna.wjt.domin.InterfaceRequestParas;
import com.hna.wjt.util.GetData;
import com.hna.wjt.util.ParaseJson;

public class VerifyTrips extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		String uri = request.getParameter("uri");
		// PrintWriter out = response.getWriter();
		// out.println("<html>");
		// out.println("uri"+uri);

		InterfaceRequestParas irp = InterfaceRequestParas.getInstance();
		String url = "http://114.251.242.135:8080/gxotarest/api/verify-trip.json";
		String requestUrl = "?" + "tripId=" + uri + "&OTACode="
				+ irp.getOTAcode() + "&timestamp=" + irp.getTimestamp()
				+ "&token=" + irp.getToken();

		requestUrl = url + requestUrl;
		// System.out.println("uri="+requestUrl);
		// 联网获取
		String jsonstr = GetData.getRS2(requestUrl);
		// System.out.println("uri="+jsonstr);
		AirVerifyRSClass rs = ParaseJson.Parse(jsonstr, ParaseVerify.class)
				.getAirVerifyRS();

		// 不联网下test
		// String pathString="D:\\VerifyTrips.json";
		// CalculateTripRS
		// rs=ParaseJson.Parse(pathString,ParaseCalTrip.class,1).getTripCalculationRS();

		String uriStr = rs.getTripOption().getUri();
		request.setAttribute("uri", uriStr);

		// request.getRequestDispatcher("WEB-INF/verfityTrip.jsp").forward(
		// request, response);
		request.getRequestDispatcher("WEB-INF/CreateReservation.jsp").forward(
				request, response);
		// out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
