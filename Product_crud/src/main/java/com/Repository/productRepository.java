package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.Product;

public interface productRepository extends JpaRepository<Product, Integer> {

}
