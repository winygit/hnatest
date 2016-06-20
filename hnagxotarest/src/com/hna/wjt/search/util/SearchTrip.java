package com.hna.wjt.search.util;

import java.util.ArrayList;
import java.util.List;

import com.hna.wjt.search.domin.AirLowFareSearchRSClass;
import com.hna.wjt.search.domin.FlightPriceInfo;
import com.hna.wjt.search.domin.FlightInformationSummary.FlightInformationListClass;
import com.hna.wjt.search.domin.FlightItineraryPricePoints.FlightItineraryPricePointListClass;
import com.hna.wjt.search.domin.FlightItineraryPricePoints.FlightItineraryPricePointsClass;
import com.hna.wjt.search.domin.PricePointSummary.PricePointSummaryListClass;

public class SearchTrip {

	private AirLowFareSearchRSClass rs;
	private int CanSelectedNum;

	public SearchTrip(AirLowFareSearchRSClass rs) {
		super();
		this.rs = rs;
	}

	// 查询可选航班数量
	public int getCanSelectedNum() {
		CanSelectedNum = rs.getFlightItineraryPricePoints()
				.getFlightItineraryPricePoint().length;
		return CanSelectedNum;
	}

	//获取系统选择航班的信息
	public FlightPriceInfo getSelectedTrip() {
		FlightPriceInfo flightPriceInfo = new FlightPriceInfo();
		String fippRef = rs.getSelectedTrip().getFlightItineraryPricePoints()
				.getFlightItineraryPricePointRef()[0];
		
		FlightItineraryPricePointListClass[] fippList=rs.getFlightItineraryPricePoints().getFlightItineraryPricePoint();
		
		for(FlightItineraryPricePointListClass e:fippList)
		{
			String idStr=e.getID();
			if((idStr!=null)&&(idStr.equals(fippRef)))
			{
				flightPriceInfo=getFlightInfoById(e.getFlightInformationRef());
				flightPriceInfo.setIndex(e.getIndex());
			}
		}
		flightPriceInfo.setISSelected(true);
		flightPriceInfo.setBaseFareAmount(rs.getSelectedTrip().getTripPricing().getTravelerTripPricing()[0].getFare().getBaseFareAmount()
				);
		flightPriceInfo.setTotalFareAmount(rs.getSelectedTrip().getTripPricing().getTravelerTripPricing()[0].getFare().getTotalFareAmount()
				);
		flightPriceInfo.setCurrency(rs.getSelectedTrip().getTripPricing()
				.getTotalFareCurrency());
		//flightPriceInfo.setIndex(index);
		return flightPriceInfo;
	}
	
	//获取所有可选航班的信息
	/**
	 * @return
	 */
	public List<FlightPriceInfo> getAllTrip()
	{
		List<FlightPriceInfo> allTrip=new ArrayList<FlightPriceInfo>();
		
		FlightItineraryPricePointListClass[] fipplist= rs.getFlightItineraryPricePoints().getFlightItineraryPricePoint();
		
		for(int i=0;i<fipplist.length;i++)
		{
			//价格信息
			FlightPriceInfo fpinfo=new FlightPriceInfo();
			String ppid=fipplist[i].getPricePointRef();
			fpinfo=getPriceInfoById(ppid);
			//航班信息
			String fipid=fipplist[i].getFlightInformationRef();
			FlightPriceInfo temp=getFlightInfoById(fipid);
			fpinfo.setArrivalDate(temp.getArrivalDate());
			fpinfo.setDepartureDate(temp.getDepartureDate());
			fpinfo.setFlightNumber(temp.getFlightNumber());
			fpinfo.setDestinationLocationName(temp.getDestinationLocationName());
			fpinfo.setOriginLocationName(temp.getOriginLocationName());
			//index信息
			fpinfo.setIndex(fipplist[i].getIndex());
			allTrip.add(fpinfo);
			
		}				
		return allTrip;
	}
	
	public FlightPriceInfo getPriceInfoById(String id)
	{
		FlightPriceInfo info=new FlightPriceInfo();
		PricePointSummaryListClass[]  pps=this.rs.getPricePointSummary().getPricePoint();
		for(int i=0;i<pps.length;i++)
		{
			String pid=pps[i].getID();
			if((id!=null)&&(id.equals(pid)))
			{
				int basefare=pps[i].getBasedOnPTCPricing().getFare().getBaseFareAmount();
				int totalfare=pps[i].getBasedOnPTCPricing().getFare().getTotalFareAmount();
				String currency=pps[i].getBasedOnPTCPricing().getFare().getTotalFareCurrency();
				
				info.setBaseFareAmount(basefare);
				info.setTotalFareAmount(totalfare);
				info.setCurrency(currency);
				break;
			}
		}
		
		return info;
	}
	
	public FlightPriceInfo getFlightInfoById(String id)
	{
		FlightPriceInfo info=new FlightPriceInfo();
		FlightInformationListClass[] fil=this.rs.getFlightInformationSummary().getFlightInformation();
		for(int i=0;i<fil.length;i++)
		{
			String fid=fil[i].getID();
			if((id!=null)&&(id.equals(fid)))
			{
				int len=fil[i].getFlight()[0].getFlightSegment().length;
				String ArrivalDate=fil[i].getFlight()[0].getFlightSegment()[len-1].getArrivalDate();
				String DepartureDate=fil[i].getFlight()[0].getFlightSegment()[0].getDepartureDate();
				String FlightNumber=fil[i].getFlight()[0].getFlightSegment()[0].getFlightNumber();
				String DestinationLocationName=fil[i].getFlight()[0].getFlightSegment()[0].getDestinationLocationName();
				String OriginLocationName=fil[i].getFlight()[0].getFlightSegment()[0].getOriginLocationName();
				
				info.setArrivalDate(ArrivalDate);
				info.setDepartureDate(DepartureDate);
				info.setFlightNumber(FlightNumber);
				info.setDestinationLocationName(DestinationLocationName);
				info.setOriginLocationName(OriginLocationName);
			}
			
		}
		
		return info;
	}
	
}
