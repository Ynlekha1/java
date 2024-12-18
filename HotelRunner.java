package com.java.encapsulation.movieRun;

import com.java.encapsulation.Hotel;

public class HotelRunner {

	 public static void main(String[] args) {
	        Hotel hotel = new Hotel();

	        hotel.setName("The ocean pearl");
	        System.out.println("Name: " + hotel.getName());

	        hotel.setLocation("manglore");
	        System.out.println("Location: " + hotel.getLocation());

	        hotel.setRating(5);
	        System.out.println("Rating: " + hotel.getRating() + " stars");

	        hotel.setTotalRooms(200);
	        System.out.println("Total Rooms: " + hotel.getTotalRooms());

	        hotel.setPricePerNight(1580.00);
	        System.out.println("Price" + hotel.getPricePerNight());

	        System.out.println(hotel);
	    }
	}

