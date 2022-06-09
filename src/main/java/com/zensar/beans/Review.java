package com.zensar.beans;

public class Review {
	
	private int ratings;

	public Review() {
		super();
	}

	public Review(int ratings) {
		super();
		this.ratings = ratings;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return " Rating of this dish is " + ratings + " out of five";
	}
	
	

}
