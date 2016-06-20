package com.hna.wjt.cl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hna.wjt.domin.InterfaceRequestParas;
import com.hna.wjt.error.ServiceErrorClass;
import com.hna.wjt.search.domin.AirLowFareSearchRSClass;
import com.hna.wjt.search.domin.FlightPriceInfo;
import com.hna.wjt.search.domin.LowPriceSearchRS;
import com.hna.wjt.search.util.SearchTrip;
import com.hna.wjt.util.GetData;
import com.hna.wjt.util.ParaseJson;

public class SearchLowFareTripCL extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String OTACode = "GXAIRLINES_120";
		String key = "69CDDG7D0042E4C672F46F0BACGAE3H2";
		String hostIP = "220.249.72.237";

		InterfaceRequestParas irp = new InterfaceRequestParas(OTACode, key,
				hostIP);

		String origin = request.getParameter("origin");
		String destination = request.getParameter("destination");
		String time = request.getParameter("time");
		String flexible = request.getParameter("flexible");

		// String leg =
		// "index:0;origin:NNG;originType:A;destination:HAK;destinationType:A;date:2016-06-30";
		String leg = "index:0;origin:" + origin + ";originType:A;destination:"
				+ destination + ";destinationType:A;date:" + time;
		String traveler = "code:ADT";
		String cabin = "Economy";
		// Boolean flexible = true;
	
		String url = "http://114.251.242.135:8080/gxotarest/api/search-low-fare-trips";

		String requestUrl = "?" + "leg=" + leg + "&traveler=" + traveler
				+ "&cabin=" + cabin + "&flexible=" + flexible.toString()
				+ "&OTACode=" + irp.getOTAcode() + "&timestamp="
				+ irp.getTimestamp() + "&token=" + irp.getToken();

		requestUrl = url + requestUrl;	
		// 联网获取
		String jsonstr = GetData.getRS2(requestUrl);
		System.out.println(" AirLowFareSearchRS： "+jsonstr);

		// 不联网下test
		// String pathString="D:\\jsonrs.json";
		// AirLowFareSearchRSClass
		// rs=ParaseJson.Parse(pathString,LowPriceSearchRS.class,1).getAirLowFareSearchRS();

		AirLowFareSearchRSClass rs = null;
		SearchTrip searchTrip = null;
		FlightPriceInfo selectedTrip = null;
		List<FlightPriceInfo> allTrip = null;
		try {
			rs = ParaseJson.Parse(jsonstr, LowPriceSearchRS.class)
					.getAirLowFareSearchRS();
			searchTrip = new SearchTrip(rs);
			selectedTrip = searchTrip.getSelectedTrip();
			allTrip = searchTrip.getAllTrip();
			int CanSelectedNum = searchTrip.getCanSelectedNum();

			request.setAttribute("CanSelectedNum", CanSelectedNum);
			request.setAttribute("selectedTrip", selectedTrip);
			request.setAttribute("allTrip", allTrip);
			request.setAttribute("uri", rs.getUri());

			request.getRequestDispatcher("WEB-INF/SearchLowFareTrips.jsp")
					.forward(request, response);
		} catch (Exception e) {
			//System.out.println("low: "+jsonstr);
			com.hna.wjt.error.Error err=ParaseJson.Parse(jsonstr,ServiceErrorClass.class).getServiceError();
			request.setAttribute("errCode", err.getCode());
			request.setAttribute("errInfo", err.getDescription());
			request.getRequestDispatcher("WEB-INF/error.jsp").forward(request,
					response);
//			PrintWriter out = response.getWriter();
//			out.println("<html>");
//			out.println("没有找到相关的航班！");
//			out.println("</html>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
