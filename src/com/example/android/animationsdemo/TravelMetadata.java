package com.example.android.animationsdemo;

public class TravelMetadata {
	private String imageName;
	private String city;
	private String category;

	public TravelMetadata(String imageName, String city, String category) {
		this.imageName = imageName;
		this.city = city;
		this.category = category;
	}
	
	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
