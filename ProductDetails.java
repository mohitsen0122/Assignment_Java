package com.database.insertion;


import java.io.File;

public class ProductDetails 
{
	String name;
	int price;
	String description;
	int rating;
	File image;
	
	public ProductDetails(String name, int price, String description, int rating) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.rating = rating;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}
}
