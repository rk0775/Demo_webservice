package com.webservice.ecom.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.webservice.ecom.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product,String> {
	@Query("select e from Product e where e.Title like %:key% or e.Brand like %:key%")
	List<Product> getLikeProductName(@Param("key") String key);
	
	
}
