package com.workshop.HotelReservation;

public class Hotel {
	
	private String hotelName;
	private String customerType;
	private double ratesWeekdaysRegularType,ratesWeekdaysRewardsType;
	private double ratesWeekendRegularType,ratesWeekendRewardType;
	private int rating;
	
	/*
	 * Declaring parameterised constructor of class
	 */
	public Hotel(String hotelName,String customerType,double ratesWeekdaysRegularType,double ratesWeekdaysRewardsType,double ratesWeekendRegularType,double ratesWeekendRewardType,int rating) {
		this.hotelName=hotelName;
		this.customerType=customerType;
		this.ratesWeekdaysRegularType=ratesWeekdaysRegularType;
		this.ratesWeekdaysRewardsType=ratesWeekdaysRewardsType;
		this.ratesWeekendRegularType=ratesWeekendRegularType;
		this.ratesWeekendRewardType=ratesWeekendRewardType;
		this.rating=rating;
	}
	
	/*
	 * these are the getter and setter method to access the private variable
	 */
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
	
	
}
