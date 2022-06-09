package com.zensar.beans;

public class Product {
	
	private int productID;
	private String productName;
	private int productCost;
	
	public Product() {
		super();
		System.out.println("Spring core");
	}
	
	public Product(String productID, String productName, String productCost) {
		System.out.println("This is the String constructor");
		
	}
	
	public Product(int productID, String productName, int productCost) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productCost = productCost;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		System.out.println("setProductID");
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		System.out.println("setProductName");
		this.productName = productName;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int productCost) {
		System.out.println("setProductCost");
		this.productCost = productCost;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productCost=" + productCost
				+ "]";
	}
	

}
