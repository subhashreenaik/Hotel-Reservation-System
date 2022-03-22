package com.workshop.HotelReservation;

import java.time.DayOfWeek;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.Comparator;

public class MainResult {

	/*
	 * Variable declaration
	 */
	private static String hotelName;
	private static double ratesWeekdaysRegularType, ratesWeekdaysRewardsType;
	private static double ratesWeekendRegularType, ratesWeekendRewardType;
	private static int rating;
	private String customerType;
	
	/*
	 * creating ArrayList to store all hotel information
	 */
	static List<Hotel> hotelinfo = new ArrayList<Hotel>();
	

	/*
	 * This method is used to enter all information about hotel like name,customer
	 * type,rates,rating for different hotel
	 */
	public void enterInform() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hotel name :");
		hotelName = sc.nextLine();	
		System.out.println("Enter ratesWeekdaysRegularType :");
		ratesWeekdaysRegularType = sc.nextDouble();
		System.out.println("Enter ratesWeekdaysRegularType :");
		ratesWeekdaysRewardsType = sc.nextDouble();
		System.out.println("Enter ratesWeekdaysRewardsType :");
		ratesWeekendRegularType = sc.nextDouble();
		System.out.println("Enter ratesWeekendRewardType:");
		ratesWeekendRewardType = sc.nextDouble();
		System.out.println("Enter hotel's rating :");
		rating = sc.nextInt();

	}
	/*
	 * This method is used to add object to the List
	 */
	public void addInfor_HotelReservationSystem() {
		MainResult result = new MainResult();
		for (int i = 0; i < 3; i++) {
			result.enterInform();
			Hotel hotel = new Hotel(hotelName, ratesWeekdaysRegularType, ratesWeekdaysRewardsType,
					ratesWeekendRegularType, ratesWeekendRewardType, rating);
			hotelinfo.add(hotel);
			//price.add(hotel.getTotalValue("Regular","10-Sep-2020","20-Sep-2020"));
		}
		
	}
	/*
	 * This method is used to find the cheapest Hotel of given date
	 */
	public  static List<Hotel> findCheapestHotel(String customertype,String startDate,String endDate) {
	 List<Hotel> priceOfcheapestHotel=hotelinfo.stream().map(s->{
		 Hotel result=new Hotel();
		 result.setHotelName(s.getHotelName());
		 result.setRatesWeekdaysRegularType(s.getRatesWeekdaysRegularType());
		 result.setRatesWeekdaysRewardsType(s.getRatesWeekdaysRewardsType());
		 result.setRatesWeekendRegularType(s.getRatesWeekendRegularType());
		 result.setRatesWeekendRewardType(s.getRatesWeekendRewardType());
		 result.setTotalRate(s.getTotalValue(customertype,startDate,endDate));
		 result.setRating(s.getRating());
		 return result;
	 }).sorted(Comparator.comparing(Hotel::getTotalRate)).collect(Collectors.toList());
	return priceOfcheapestHotel.stream().filter(results -> results.getTotalRate() == priceOfcheapestHotel.get(0).getTotalRate()).collect(Collectors.toList());

	}
	

	

	public static void main(String[] args) {
		System.out.println("Enter information about Hotel and their fares ");
		MainResult result = new MainResult();
		
		
		/*
		 * Calling the method to give Hotel information
		 */
		result.addInfor_HotelReservationSystem(); 
		hotelinfo.stream().forEach(s -> System.out.println(s));
		/*
		 * Calling the method to find cheapest Hotel of given date
		 */
		System.out.println(findCheapestHotel("Regular","10-Sep-2020","20-Sep-2020").get(0).getHotelName()+" is the cheapest hotel on given date "+
		 findCheapestHotel("Regular","10-Sep-2020","20-Sep-2020").get(0).getTotalRate());

	}

}
