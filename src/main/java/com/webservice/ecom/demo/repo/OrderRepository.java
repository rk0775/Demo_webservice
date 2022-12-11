package com.webservice.ecom.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.ecom.demo.entities.PlaceOrders;

public interface OrderRepository extends JpaRepository<PlaceOrders, String> {
	public List<PlaceOrders> findByInvoice(String invoice);
}
