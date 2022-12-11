package com.webservice.ecom.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlaceOrders {
	@Id
	String Channel_Order_Id;
	String Item_Name;
	String Status;
	String UserId;
	double Sold_Price;
	String Remark;
	String Customer_id;
	String Buyer_Name;
	String Buyer_Phone_Number;
	String Recepient_Name;
	String Shipping_addr1;
	String Shipping_addr2;
	String Shipping_addr3;
	String Ship_City;
	String Ship_State;
	String Ship_Country;
	String Ship_Postal_Code;
	String Ship_Phon_Number;
	String Payment_Method;
	String Fullfilled_By;
	String invoice;
	String category;
	String Warehouse_Id;
	String product_id;
	String Ship_date;
	int Quentity;
	String Sale_Order_id;
	double Tax_Rate1;
	double Tax_Type;
	double Tax_Amount;
	double Item_Price;
	double Shiping_price;
	double Shiping_tax;
	
	public PlaceOrders() {}
	
	//getter setter
	public String getChannel_Order_Id() {
		return Channel_Order_Id;
	}
	public void setChannel_Order_Id(String channel_Order_Id) {
		Channel_Order_Id = channel_Order_Id;
	}
	public String getItem_Name() {
		return Item_Name;
	}
	public void setItem_Name(String item_Name) {
		Item_Name = item_Name;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public double getSold_Price() {
		return Sold_Price;
	}
	public void setSold_Price(double sold_Price) {
		Sold_Price = sold_Price;
	}
	
	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}
	public String getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(String customer_id) {
		Customer_id = customer_id;
	}
	public String getBuyer_Name() {
		return Buyer_Name;
	}
	public void setBuyer_Name(String buyer_Name) {
		Buyer_Name = buyer_Name;
	}
	public String getBuyer_Phone_Number() {
		return Buyer_Phone_Number;
	}
	public void setBuyer_Phone_Number(String buyer_Phone_Number) {
		Buyer_Phone_Number = buyer_Phone_Number;
	}
	public String getRecepient_Name() {
		return Recepient_Name;
	}
	public void setRecepient_Name(String recepient_Name) {
		Recepient_Name = recepient_Name;
	}
	public String getShipping_addr1() {
		return Shipping_addr1;
	}
	public void setShipping_addr1(String shipping_addr1) {
		Shipping_addr1 = shipping_addr1;
	}
	public String getShipping_addr2() {
		return Shipping_addr2;
	}
	public void setShipping_addr2(String shipping_addr2) {
		Shipping_addr2 = shipping_addr2;
	}
	public String getShipping_addr3() {
		return Shipping_addr3;
	}
	public void setShipping_addr3(String shipping_addr3) {
		Shipping_addr3 = shipping_addr3;
	}
	public String getShip_City() {
		return Ship_City;
	}
	public void setShip_City(String ship_City) {
		Ship_City = ship_City;
	}
	public String getShip_State() {
		return Ship_State;
	}
	public void setShip_State(String ship_State) {
		Ship_State = ship_State;
	}
	public String getShip_Country() {
		return Ship_Country;
	}
	public void setShip_Country(String ship_Country) {
		Ship_Country = ship_Country;
	}
	public String getShip_Postal_Code() {
		return Ship_Postal_Code;
	}
	public void setShip_Postal_Code(String ship_Postal_Code) {
		Ship_Postal_Code = ship_Postal_Code;
	}
	public String getShip_Phon_Number() {
		return Ship_Phon_Number;
	}
	public void setShip_Phon_Number(String ship_Phon_Number) {
		Ship_Phon_Number = ship_Phon_Number;
	}
	public String getPayment_Method() {
		return Payment_Method;
	}
	public void setPayment_Method(String payment_Method) {
		Payment_Method = payment_Method;
	}
	public String getFullfilled_By() {
		return Fullfilled_By;
	}
	public void setFullfilled_By(String fullfilled_By) {
		Fullfilled_By = fullfilled_By;
	}
	public String getInvoice_Number() {
		return invoice;
	}
	public void setInvoice_Number(String invoice_Number) {
		invoice = invoice_Number;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getWarehouse_Id() {
		return Warehouse_Id;
	}
	public void setWarehouse_Id(String warehouse_Id) {
		Warehouse_Id = warehouse_Id;
	}
	public String getShip_date() {
		return Ship_date;
	}
	public void setShip_date(String ship_date) {
		Ship_date = ship_date;
	}
	public int getQuentity() {
		return Quentity;
	}
	public void setQuentity(int i) {
		Quentity = i;
	}
	public String getSale_Order_id() {
		return Sale_Order_id;
	}
	public void setSale_Order_id(String sale_Order_id) {
		Sale_Order_id = sale_Order_id;
	}
	public double getTax_Rate1() {
		return Tax_Rate1;
	}
	public void setTax_Rate1(double tax_Rate1) {
		Tax_Rate1 = tax_Rate1;
	}
	public double getTax_Type() {
		return Tax_Type;
	}
	public void setTax_Type(double tax_Type) {
		Tax_Type = tax_Type;
	}
	public double getTax_Amount() {
		return Tax_Amount;
	}
	public void setTax_Amount(double tax_Amount) {
		Tax_Amount = tax_Amount;
	}
	public double getItem_Price() {
		return Item_Price;
	}
	public void setItem_Price(double item_Price) {
		Item_Price = item_Price;
	}
	public double getShiping_price() {
		return Shiping_price;
	}
	public void setShiping_price(double shiping_price) {
		Shiping_price = shiping_price;
	}
	public double getShiping_tax() {
		return Shiping_tax;
	}
	public void setShiping_tax(double shiping_tax) {
		Shiping_tax = shiping_tax;
	}
	
	
	
}
