package com.java.encapsulation;

public class Hotel {
	private String name;
    private String location;
    private int rating;
    private int totalRooms;
    private double pricePerNight;

    public Hotel() {
        System.out.println("No argument ");
    }

    // Set
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    // Get
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getRating() {
        return rating;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    @Override
    public String toString() {
        System.out.println("toString() invoked");
        return this.name + this.location + this.rating + this.totalRooms + this.pricePerNight;
    }
}
	
	

