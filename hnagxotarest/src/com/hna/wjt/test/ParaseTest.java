package com.hna.wjt.test;

import com.hna.wjt.search.domin.AirLowFareSearchRSClass;
import com.hna.wjt.search.domin.LowPriceSearchRS;
import com.hna.wjt.util.ParaseJson;

public class ParaseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parase();
		
	}

	private static void parase() {
		String pathString="D:\\jsonrs.json";
		LowPriceSearchRS rs=ParaseJson.Parse(pathString,LowPriceSearchRS.class,1);
		
		System.out.println(rs.getAirLowFareSearchRS().getUri());
		System.out.println(rs.getAirLowFareSearchRS().getFlightItineraryPricePoints().getFlightItineraryPricePoint().length);

		AirLowFareSearchRSClass st=rs.getAirLowFareSearchRS();
		System.out.println(st.getSelectedTrip().getUri());
		System.out.println(st.getSelectedTrip().getTripPricing().getTotalFareAmount());
	}

}
