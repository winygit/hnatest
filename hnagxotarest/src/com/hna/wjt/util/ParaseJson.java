package com.hna.wjt.util;

import java.io.File;
import java.io.FileInputStream;

import com.google.gson.Gson;
import com.hna.wjt.search.domin.AirLowFareSearchRSClass;
import com.hna.wjt.search.domin.LowPriceSearchRS;


public class ParaseJson {
	
	static public <T> T Parse(String pathString,Class<T> t,int type )
	{
		T rs=null;
		try{
		File file = new File(pathString);
		FileInputStream in = new FileInputStream(file);
		byte[] bytes=new byte[20000];
		int len=in.read(bytes);
		String strjson=new String(bytes,0,len);//获取json字符串
		String str=strjson.replace("@","");
		System.out.println("str="+str);
		
		Gson gson=new Gson();
		rs=gson.fromJson(str,t);		
		}
		catch (Exception e) {
			System.out.println("Json 解析出现问题！");
			System.out.println(e);
		}
		return rs;
	}

	static public LowPriceSearchRS Parse(String pathString )
	{
		LowPriceSearchRS rs=null;
		try{
		File file = new File(pathString);
		FileInputStream in = new FileInputStream(file);
		byte[] bytes=new byte[20000];
		int len=in.read(bytes);
		String strjson=new String(bytes,0,len);//获取json字符串
		String str=strjson.replace("@","");
		System.out.println("str="+str);
		
		Gson gson=new Gson();
		rs=gson.fromJson(str,LowPriceSearchRS.class);		
		}
		catch (Exception e) {
			System.out.println("Json 解析出现问题！");
			System.out.println(e);
		}
		return rs;
	}
	
	static public <T> T Parse(String JsonStr,Class<T> t )
	{
		T rs=null;
		String str=JsonStr.replace("@","");
		try {
			Gson gson=new Gson();
			rs=gson.fromJson(str,t);
		} catch (Exception e) {
			System.out.println("Json 解析出现问题！");
		}
		if(rs==null)
		{
			System.out.println("JsonStr :"+JsonStr);
		}
		return rs;		
	}

	
}
