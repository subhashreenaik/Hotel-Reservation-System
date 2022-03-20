package com.workshop.HotelReservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class MainResult {

	/*
	 * Variable declaration
	 */
	private static String hotelName;
	private static String customerType;
	private static double ratesWeekdaysRegularType, ratesWeekdaysRewardsType;
	private static double ratesWeekendRegularType, ratesWeekendRewardType;
	private static int rating;

	/*
	 * This method is used to enter all information about hotel like name,customer
	 * type,rates,rating
	 */
	public void enterInform() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hotel name :");
		hotelName = sc.nextLine();
		System.out.println("Enter customer type : ");
		customerType = sc.nextLine();
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

	public static void main(String[] args) {
		System.out.println("Enter information about Hotel and their fares ");
		MainResult result = new MainResult();
		/*
		 * creating ArrayList to store all information
		 */
		List<Hotel> hotelinfo = new ArrayList<Hotel>();
		/*
		 * Calling the method to give Hotel information
		 */

		for (int i = 0; i < 3; i++) {
			result.enterInform();
			Hotel hotel = new Hotel(hotelName, customerType, ratesWeekdaysRegularType, ratesWeekdaysRewardsType,
					ratesWeekendRegularType, ratesWeekendRewardType, rating);
			hotelinfo.add(hotel);
		}
        
		hotelinfo.stream().forEach(s -> System.out.println(s));

	}

}
