package com.ecommerce.productCatalog.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ecommerce.productCatalog.model.Category;
import com.ecommerce.productCatalog.model.Product;
import com.ecommerce.productCatalog.repository.CategoryRepository;
import com.ecommerce.productCatalog.repository.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner{
	
	private final ProductRepository productRepository;
	private final CategoryRepository categoryRepository;
	public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
		
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//cleaning all data in db via repo
		categoryRepository.deleteAll();
		productRepository.deleteAll();
		
		//create all data of category
		Category electronics = new Category();
		electronics.setName("Electronics");
		
		Category clothing = new Category();
		clothing.setName("Clothing");
		
		Category home = new Category();
		home.setName("Home and Kitchen");
		
		categoryRepository.saveAll(Arrays.asList(electronics, clothing, home));
		//create products
		Product phone = new Product();
		phone.setName("SmartPhone");
		phone.setDescription("LatestSmartPhone");
		phone.setImageUrl("https://placehold.co/600x400");
		phone.setPrice(57676.34);
		phone.setCategory(electronics);
		
		Product laptop = new Product();
		laptop.setName("Laptop");
		laptop.setDescription("High speed laptop");
		laptop.setImageUrl("https://placehold.co/600x400");
		laptop.setPrice(4567465.78);
		laptop.setCategory(electronics);
		
		Product  jacket= new Product();
		jacket.setName("Jacket");
		jacket.setDescription("High Quality");
		jacket.setImageUrl("https://placehold.co/600x400");
		jacket.setPrice(1235.78);
		jacket.setCategory(clothing);
		
		Product blender= new Product();
		blender.setName("Blender");
		blender.setDescription("Durable");
		blender.setImageUrl("https://placehold.co/600x400");
		blender.setPrice(90787.23);
		blender.setCategory(home);
		


		//this is the place where i have to start work to insert img url then only 
		//i can go forward in to excute the project
		productRepository.saveAll(Arrays.asList(laptop,phone,jacket,blender));
		
	}

}
