package com.zensar.beans;

import org.springframework.stereotype.Component;

public class Food {
	
	private String foodName;
	private int quantity;
	private double price;
	
	private Review review;

	public Food() {
		super();
		System.out.println("Inside food constructor");
	}
	
	

	public Food(String foodName, int quantity, double price) {
		super();
		this.foodName = foodName;
		this.quantity = quantity;
		this.price = price;
	}



	public Food(String foodName, int quantity, double price, Review review) {
		super();
		this.foodName = foodName;
		this.quantity = quantity;
		this.price = price;
		this.review = review;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", quantity=" + quantity + ", price=" + price + ", review=" + review
				+ "]";
	}
	

}
