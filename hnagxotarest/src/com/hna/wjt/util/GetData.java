package com.hna.wjt.util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class GetData {

	public static String getRS(String requestUrl) {
		String rs = null;
		try {
			URL url = null;
			url = new URL(requestUrl);
			URLConnection conn = null;
			conn = url.openConnection();
			conn.setConnectTimeout(25 * 1000);
			conn.connect();

			InputStream is = null;
			is = conn.getInputStream();

			int len = 0;
			byte[] buff = new byte[100000];
			int lens = is.available();
			if (lens > 0) {
				Thread.sleep(300);
			}
			// System.out.println("lens="+lens);
			len += is.read(buff);

			is.close();

			rs = new String(buff, 0, len);

			// System.out.println("rs="+rs);
		} catch (Exception e) {

			System.out.println(e.toString());
			e.printStackTrace();

		}
		return rs;
	}

	public static String getRS2(String requestUrl) {
		String rs = null;
		try {
			URL url = null;
			url = new URL(requestUrl);
			HttpURLConnection conn = null;
			conn = (HttpURLConnection) url.openConnection();
			//conn.setRequestMethod("POST");
			conn.setConnectTimeout(15 * 1000);
			conn.connect();

			int connectionCode = conn.getResponseCode();
			if (connectionCode == 200) {
				InputStream is = null;
				is = conn.getInputStream();
				rs=stream2String(is);
				// int lens=is.available();

				/*
				byte[] buff = new byte[10200];
				int len = 0;

				while ((len = is.read(buff, buff.length, 512)) != -1) {

				}

				len=buff.length;
				is.close();
				rs = new String(buff, 0, len);
				*/

			}

		} catch (Exception e) {

			System.out.println(e.toString());
			e.printStackTrace();

		}
		return rs;
	}

	public static String stream2String(InputStream in) throws Exception {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			int len = 0;
			byte bytes[] = new byte[512];
			while ((len = in.read(bytes)) != -1) {
				out.write(bytes, 0, len);
			}
			String result=out.toString("utf-8");
//			String result = encodeStr(out.toString());	
			//System.out.println("rr:"+result);
			out.close();
			return result;
		}
	
	public static  String  encodeStr (String str)
	{
		String nstr=null;
		try {
			nstr=new String(str.getBytes("iso-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}		
		return nstr;
	}

	
}
