package com.example.demo.honeywell.dto;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.demo.honeywell.enums.CategoryEnum;

@Entity
public class Category {
	
	@Id
	private UUID id;
	private CategoryEnum name;
	@OneToMany
	private List<Product> products;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public CategoryEnum getName() {
		return name;
	}
	public void setName(CategoryEnum name) {
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
