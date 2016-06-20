package com.hna.wjt.test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hna.wjt.domin.InterfaceRequestParas;
import com.sun.net.ssl.HttpsURLConnection;

public class gxtest extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset:utf-8");
		 PrintWriter out = response.getWriter();

		String OTACode = "GXAIRLINES_120";
		String key = "69CDDG7D0042E4C672F46F0BACGAE3H2";
		String hostIP = "220.249.72.237";

		InterfaceRequestParas irp = new InterfaceRequestParas(OTACode, key,
				hostIP);

		String leg = "index:0;origin:NNG;originType:A;destination:HAK;destinationType:A;date:2016-06-04";
		String traveler = "code:ADT";
		String cabin = "Economy";
		Boolean flexible = false;

		String url = "http://114.251.242.135:8080/gxotarest/api/search-low-fare-trips.xml";

		String requestUrl = "?" + "leg=" + leg + "&traveler=" + traveler
				+ "&cabin=" + cabin + "&flexible=" + flexible.toString()
				+ "&OTACode=" + irp.getOTAcode() + "&timestamp="
				+ irp.getTimestamp() + "&token=" + irp.getToken();

		// requestUrl=requestUrl.replaceAll(":", "%3A");
		// requestUrl=requestUrl.replaceAll(";", "%3B");

		requestUrl = url + requestUrl;

		// String requestUrl2=url+"?"
		// +"&OTACode="+irp.getOTAcode()+"&timestamp="+irp.getTimestamp()+"&token="+irp.getToken();

		System.out.println(requestUrl);
		response.sendRedirect(requestUrl);

		// ServletOutputStream servletOutputStream=response.getOutputStream();
		// byte bs [] =new
		out.println("xml:");

		//out.println(getXML(requestUrl));
		
		out.println("end");

	}

	/*
	private String getXML(String requestUrl) {
		// TODO Auto-generated method stub
		URL url = null;
		try {
			url = new URL(requestUrl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		URLConnection conn = null;
		try {
			conn = url.openConnection();
			conn.connect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		conn.setConnectTimeout(15 * 10000);
		InputStream is=null;
		
		//OutputStream os=null;
		try {
			conn.connect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 is= conn.getInputStream();
			//os=conn.getOutputStream();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		BufferedInputStream bisBufferedInputStream=new BufferedInputStream(is);
//		StringBuffer strbufferBuffer=new StringBuffer();
		byte [] buff=new byte[10000];
		String sb=null;
		
			int len=0;
			try {
				len = is.read(buff);
				System.out.println("buff len="+len);
				System.out.println(buff);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sb=new String(buff, 0, len);
				
			System.out.println("sb length:"+sb.length());
		
		return sb;
		  
	      


	
	}

*/
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
