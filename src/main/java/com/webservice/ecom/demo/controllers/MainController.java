package com.webservice.ecom.demo.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.ecom.demo.entities.PlaceOrders;
import com.webservice.ecom.demo.entities.Product;
import com.webservice.ecom.demo.repo.OrderRepository;
import com.webservice.ecom.demo.repo.ProductRepository;

@RequestMapping("/Ecom")
@RestController
public class MainController {
	
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private OrderRepository orderRepository;
	
	Random random=new Random();
	List<Product> cart=new ArrayList<>();
	
	@GetMapping("/")
	public List<Product> allproducts(){
		List<Product> products=productRepository.findAll();
		return products;
	}
	
	@GetMapping("/search/{key}")
	public List<Product> searchProduct(@PathVariable String key){
		List<Product> products=productRepository.getLikeProductName(key);
		return products;
	}
	
	@PostMapping(path="/addProduct",consumes = "application/json")
	public String addNewProduct(@RequestBody Product product){
		product.setProduct_reference_id(random.nextInt()+"_Product_2022");
		try {
			
			productRepository.save(product);
			return "Product is save successfully.";
		}catch(Exception e) {
			e.printStackTrace();
			return "Product are not added.Something wrong...";
		}	
	}
	
	@GetMapping("/addToCart/{id}")
	public String addToCart(@PathVariable String id) {
		Product p=productRepository.findById(id).get();
		if(p==null)
			return "Product not found. something wrong....";
		else {
			cart.add(p);
			return "Product are added to the cart.";
		}
	}
	
	@GetMapping("/showCart")
	public List<Product> showCart(){
		return cart;
	}
	
	@PostMapping("/placeOrder")
	public String palceOrder(@RequestBody PlaceOrders odr) {
		
		System.out.println("This is order product "+odr.getBuyer_Name());
		if(cart.size()==0)
			return "Sorry, Your cart is empty.";
		try {
			odr.setUserId(random.nextInt()+"_User_2022");
			odr.setCustomer_id(random.nextInt()+"_Customer_2022");
			odr.setInvoice_Number(random.nextInt()+"_Invoice_2022");
			odr.setWarehouse_Id(2345+"-warehouse");
			odr.setShip_date(""+new Date());
			odr.setQuentity(1);
			odr.setSale_Order_id(random.nextInt()+"_sale_2022");
			odr.setTax_Amount(20);
			odr.setTax_Rate1(10);
			odr.setShiping_price(40.0);
			odr.setShiping_tax(0);
			for(Product ptr:cart) {
				
				odr.setChannel_Order_Id(random.nextInt()+"_Order_2022");
				odr.setItem_Name(ptr.getTitle());
				odr.setSold_Price(ptr.getMRP());
				odr.setProduct_id(ptr.getProduct_reference_id());
				orderRepository.save(odr);
			}
			cart.clear();
			return "Order are successfully placed.";
		}catch(Exception e) {
			e.printStackTrace();
			return "Order not place . something wrong....";
		}
	}
	
	@GetMapping("/showOrders")
	public List<PlaceOrders> getOrders(){
		List<PlaceOrders> odrs=orderRepository.findAll();
		return odrs;
	}
	
	@GetMapping("/showOrders/{invoice}")
	public List<PlaceOrders> getOrderByInvoice(@PathVariable String invoice){
		return orderRepository.findByInvoice(invoice);
	}
			
}
