package com.example.demo.honeywell.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.honeywell.dto.Category;
import com.example.demo.honeywell.service.CategoryRepo;

@RestController
public class OrderContoller {

	@Autowired
	private CategoryRepo categoryRepo;
	
	@GetMapping("/category")
	private List<Category> getAllCategories(){
		return categoryRepo.findAll();
	}
}
