package com.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findAll();
	List<Product> findByIsActiveTrue();

	List<Product> findByCategory(String category);

	Product  findProductById(Integer id);
}
