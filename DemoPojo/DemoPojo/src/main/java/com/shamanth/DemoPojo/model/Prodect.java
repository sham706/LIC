package com.shamanth.DemoPojo.model;

import java.util.Arrays;

import org.apache.juneau.annotation.Beanc;

public class Prodect {
	
	private String name;
	private int price;
	private String colour;
	private String[] sellerNames;
	
	
	@Override
	public String toString() {
		return "Prodect [name=" + name + ", price=" + price + ", colour=" + colour + ", sellerNames="
				+ Arrays.toString(sellerNames) + "]";
	}
	public Prodect() {
		
	}
	@Beanc(properties = "name, price, colour, sellerNames")
	public Prodect(String name, int price, String colour, String[] sellerNames) {
		super();
		this.name = name;
		this.price = price;
		this.colour = colour;
		this.sellerNames = sellerNames;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String[] getSellerNames() {
		return sellerNames;
	}
	public void setSellerNames(String[] sellerNames) {
		this.sellerNames = sellerNames;
	}
	
	
}
