package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Product;
import com.revature.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping(value = "/Products/{id}")
	public Product getProduct(@PathVariable("id") String id) {
		return service.getProduct(Integer.parseInt(id));
	}
	
	@GetMapping(value = "/Products", produces = "application/json")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}
	
	@PostMapping(value = "/Products", consumes = "application/json", produces = "application/json")
	public Product addProduct(@RequestBody Product a) {
		return service.addProduct(a);
	}
	
	@PutMapping(value = "/Products/{id}", consumes = "application/json")
	public Product updateProduct(@PathVariable("id") int id, @RequestBody Product change) {
		change.setId(id);
		return service.updateProduct(change);
	}
	
	@DeleteMapping(value = "/Products/{id}")
	public boolean deleteProduct(@PathVariable("id") int id) {
		System.out.println("Executing Delete");
		return service.deleteProduct(id);
	}



}
