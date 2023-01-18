package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Product;
import com.Repository.productRepository;

@Service
public class Productservice {
	@Autowired
	productRepository prepo;
	
	//crud operations
	public List<Product> getallproducts() {
		return prepo.findAll();
	}

	// Create product
	public void addproduct(Product product) {
		prepo.save(product);
	}

	// Update product
	public void updateproduct(Product product) {
		prepo.save(product);
	}

	// delete product
	public void deleteProduct(Integer id) {
		prepo.deleteById(id);
	}
}
