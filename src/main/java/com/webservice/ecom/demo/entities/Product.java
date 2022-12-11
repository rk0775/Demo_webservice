package com.webservice.ecom.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	String Product_reference_id;
	String SKU;
	String Title;
	int Quentity;
	double MRP;
	String Brand;
	String Channel_ID;
	String Material;
	String Image_URL1;
	String Image_URL2;
	String Image_URL3;
	String Image_URL4;
	String Image_URL5;
	String Color;
	
	public Product() {}
	
	public String getProduct_reference_id() {
		return Product_reference_id;
	}
	public void setProduct_reference_id(String product_reference_id) {
		Product_reference_id = product_reference_id;
	}
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getQuentity() {
		return Quentity;
	}
	public void setQuentity(int quentity) {
		Quentity = quentity;
	}
	public double getMRP() {
		return MRP;
	}
	public void setMRP(double mRP) {
		MRP = mRP;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getChannel_ID() {
		return Channel_ID;
	}
	public void setChannel_ID(String channel_ID) {
		Channel_ID = channel_ID;
	}
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String material) {
		Material = material;
	}
	public String getImage_URL1() {
		return Image_URL1;
	}
	public void setImage_URL1(String image_URL1) {
		Image_URL1 = image_URL1;
	}
	public String getImage_URL2() {
		return Image_URL2;
	}
	public void setImage_URL2(String image_URL2) {
		Image_URL2 = image_URL2;
	}
	public String getImage_URL3() {
		return Image_URL3;
	}
	public void setImage_URL3(String image_URL3) {
		Image_URL3 = image_URL3;
	}
	public String getImage_URL4() {
		return Image_URL4;
	}
	public void setImage_URL4(String image_URL4) {
		Image_URL4 = image_URL4;
	}
	public String getImage_URL5() {
		return Image_URL5;
	}
	public void setImage_URL5(String image_URL5) {
		Image_URL5 = image_URL5;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	String Description;
	
	
	
	
}
