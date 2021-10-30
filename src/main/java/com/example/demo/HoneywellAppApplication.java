package com.example.demo;

import java.util.Arrays;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.honeywell.dto.Category;
import com.example.demo.honeywell.dto.Product;
import com.example.demo.honeywell.enums.CategoryEnum;
import com.example.demo.honeywell.service.CategoryRepo;
import com.example.demo.honeywell.service.ProductRepo;

@SpringBootApplication
public class HoneywellAppApplication {

	@Autowired
	private ProductRepo productRepo;

	@Autowired
	private CategoryRepo categoryRepo;

	
	public static void main(String[] args) {
		SpringApplication.run(HoneywellAppApplication.class, args);
	}

	@PostConstruct
	private void initDb() {

		Product prod1 = new Product();
		prod1.setId(UUID.randomUUID());
		prod1.setManufacturer("PUMA");
		prod1.setName("Enzo Light Shoe");
		prod1.setPrice(3000.0f);
		productRepo.save(prod1);

		Product prod2 = new Product();
		prod2.setId(UUID.randomUUID());
		prod2.setManufacturer("Jack & Jones");
		prod2.setName("Silk Shirt");
		prod2.setPrice(2000.0f);
		productRepo.save(prod2);

		Product prod3 = new Product();
		prod3.setId(UUID.randomUUID());
		prod3.setManufacturer("Samsung");
		prod3.setName("Galaxy Ultra");
		prod3.setPrice(30000.0f);
		productRepo.save(prod3);

		Product prod4 = new Product();
		prod4.setId(UUID.randomUUID());
		prod4.setManufacturer("Apple");
		prod4.setName("Mac Pro");
		prod4.setPrice(300000.0f);

		productRepo.save(prod4);

		Category cat1 = new Category();
		cat1.setId(UUID.randomUUID());
		cat1.setName(CategoryEnum.ELECTRONICS);
		cat1.setProducts(Arrays.asList(prod3, prod4));
		categoryRepo.save(cat1);

		Category cat2 = new Category();
		cat2.setId(UUID.randomUUID());
		cat2.setName(CategoryEnum.FASHION);
		cat2.setProducts(Arrays.asList(prod1, prod2));
		categoryRepo.save(cat2);

	}
}
