package com.hna.wjt.test;

import com.hna.wjt.util.GetData;

public class connectTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String requestUrl = "http://localhost:8090/hnagxotarest/qq.txt";

		String rString = GetData.getRS2(requestUrl);
		System.out.println(rString);

	}

	

}
