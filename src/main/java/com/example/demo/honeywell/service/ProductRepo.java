package com.example.demo.honeywell.service;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.honeywell.dto.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, UUID> {

}
