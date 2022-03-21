package com.workshop.HotelReservation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Hotel {
	
	private String hotelName;
	private String customerType;
	private double ratesWeekdaysRegularType,ratesWeekdaysRewardsType;
	private double ratesWeekendRegularType,ratesWeekendRewardType;
	private int rating;
	private double totalRate;
	
	private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	
	public Hotel() {
		super();
	}
	
	/*
	 * Declaring parameterised constructor of class
	 */
	public Hotel(String hotelName,double ratesWeekdaysRegularType,double ratesWeekdaysRewardsType,double ratesWeekendRegularType,double ratesWeekendRewardType,int rating) {
		this.hotelName=hotelName;
		this.ratesWeekdaysRegularType=ratesWeekdaysRegularType;
		this.ratesWeekdaysRewardsType=ratesWeekdaysRewardsType;
		this.ratesWeekendRegularType=ratesWeekendRegularType;
		this.ratesWeekendRewardType=ratesWeekendRewardType;
		this.rating=rating;
	}
	
	/*
	 * these are the getter and setter method to access the private variable
	 */
	
	public void setTotalRate(double totalRate) {
		this.totalRate = totalRate;
	}
	public double getTotalRate() {
		return totalRate;
	}
	public double getRatesWeekdaysRegularType() {
		return ratesWeekdaysRegularType;
	}

	public void setRatesWeekdaysRegularType(double ratesWeekdaysRegularType) {
		this.ratesWeekdaysRegularType = ratesWeekdaysRegularType;
	}

	public double getRatesWeekdaysRewardsType() {
		return ratesWeekdaysRewardsType;
	}

	public void setRatesWeekdaysRewardsType(double ratesWeekdaysRewardsType) {
		this.ratesWeekdaysRewardsType = ratesWeekdaysRewardsType;
	}

	public double getRatesWeekendRegularType() {
		return ratesWeekendRegularType;
	}

	public void setRatesWeekendRegularType(double ratesWeekendRegularType) {
		this.ratesWeekendRegularType = ratesWeekendRegularType;
	}

	public double getRatesWeekendRewardType() {
		return ratesWeekendRewardType;
	}

	public void setRatesWeekendRewardType(double ratesWeekendRewardType) {
		this.ratesWeekendRewardType = ratesWeekendRewardType;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	
	public String getCustomerType() {
		return customerType;
	}
	
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	
	
	public String getHotelName() {
		return hotelName;
	}

	public int getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", customerType=" + customerType + ", ratesWeekdaysRegularType="
				+ ratesWeekdaysRegularType + ", ratesWeekdaysRewardsType=" + ratesWeekdaysRewardsType
				+ ", ratesWeekendRegularType=" + ratesWeekendRegularType + ", ratesWeekendRewardType="
				+ ratesWeekendRewardType + ", rating=" + rating + "]";
	}
	public  double getTotalValue(String  customertype,String date1,String date2) {
		double totalRate=0;
		final LocalDate startDate = LocalDate.parse(date1, DATE_FORMAT);
		final LocalDate endDate = LocalDate.parse(date2, DATE_FORMAT);
//		
		if(customertype.equals("Regular")) {
			for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1))
			{
				if(date.getDayOfWeek().equals(DayOfWeek.SATURDAY)|| date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
					totalRate += ratesWeekendRegularType;
		
	               }
				else {
					totalRate += ratesWeekdaysRegularType;
				}
		     }
			return totalRate;
		     }
		else {
			for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1))
			{
				if(date.getDayOfWeek().equals(DayOfWeek.SATURDAY)|| date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
					totalRate +=ratesWeekendRewardType;
		
	               }
				else {
					totalRate +=ratesWeekdaysRewardsType;
				}
		     }
			return totalRate;
		     }
		}
	
	
}
