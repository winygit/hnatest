package com.hna.wjt.cl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hna.wjt.ReservationRetrieveRS.ParaseReservationRetrieve;
import com.hna.wjt.ReservationRetrieveRS.ReservationClass;
import com.hna.wjt.ReservationRetrieveRS.ReservationRetrieveRSClass;
import com.hna.wjt.domin.InterfaceRequestParas;
import com.hna.wjt.util.GetData;
import com.hna.wjt.util.ParaseJson;

public class Getreservation extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset:utf-8");
		String reservationCode = (String) request.getSession().getAttribute(
				"reservationCodeS");

		InterfaceRequestParas irp = InterfaceRequestParas.getInstance();
		String url = "http://114.251.242.135:8080/gxotarest/api/get-reservation.json";
		String requestUrl = "?" + "reservationCode=" + reservationCode
				+ "&OTACode=" + irp.getOTAcode() + "&timestamp="
				+ irp.getTimestamp() + "&token=" + irp.getToken();
		requestUrl = url + requestUrl;
		// ÁªÍø»ñÈ¡

		String jsonstr = GetData.getRS2(requestUrl);
		ReservationRetrieveRSClass rrs = ParaseJson.Parse(jsonstr,
				ParaseReservationRetrieve.class).getReservationRetrieveRS();
		ReservationClass rs = rrs.getReservation();

		saveTosession(request, rs);

		request.getRequestDispatcher("WEB-INF/ReservationInfo.jsp").forward(
				request, response);
		/*
		 * System.out.println("url: "+requestUrl);
		 * System.out.println("jsonstr: " + jsonstr); PrintWriter out =
		 * response.getWriter(); out.println("<HTML>"); out.println("bingo!!!");
		 * out.println("<hr>"); out.println("url: " + requestUrl);
		 * out.println("<hr>"); out.println("jsonstr: " + jsonstr);
		 * out.println("</HTML>"); out.close();
		 */

	}

	private void saveTosession(HttpServletRequest request, ReservationClass rs) {
		String Status = rs.getStatus();
		String cFirstName = rs.getCustomer().getFirstName();
		String cLastName = rs.getCustomer().getLastName();
		String cEmail = rs.getCustomer().getEmail().getEmailAddress();
		String cPhone = rs.getCustomer().getPhone().getPhoneNumber();

		String FirstName = rs.getTraveler().getFirstName();
		String LastName = rs.getTraveler().getLastName();
		String IDNO = rs.getTraveler().getFormOfIdentification()
				.getFormOfIdentificationNumber();
		String IDType = rs.getTraveler().getFormOfIdentification()
				.getFormOfIdentificationType();
		String Phone = rs.getTraveler().getPhone().getPhoneNumber();
		String PurchaseAmount = rs.getPurchase().getPurchaseAmount();

		HttpSession session = request.getSession();
		session.setAttribute("Status", Status);
		session.setAttribute("cFirstName", cFirstName);
		session.setAttribute("cLastName", cLastName);
		session.setAttribute("cEmail", cEmail);
		session.setAttribute("cPhone", cPhone);
		session.setAttribute("FirstName", FirstName);
		session.setAttribute("LastName", LastName);
		session.setAttribute("IDNO", IDNO);
		session.setAttribute("IDType", IDType);
		session.setAttribute("Phone", Phone);
		session.setAttribute("PurchaseAmount", PurchaseAmount);
		// String
		// documentNo=rs.getReservationElement().getAir().getAirTrip().getFlightInformation().get
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
