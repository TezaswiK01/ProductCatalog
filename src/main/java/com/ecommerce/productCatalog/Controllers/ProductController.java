package com.ecommerce.productCatalog.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.productCatalog.model.Product;
import com.ecommerce.productCatalog.repository.ProductRepository;
import com.ecommerce.productCatalog.service.ProductService;

@RestController
@RequestMapping("/api/product")
@CrossOrigin(origins="http://localhost:5173/")
public class ProductController {
	
private ProductService productService;


	public ProductController(ProductService productService) {

	this.productService = productService;
}


	@GetMapping
	public List<Product> getAllProducts()
	{
		System.out.println("ERror-starting");
		return productService.getAllProducts();
	}
	
	 @GetMapping("/category/{categoryId}")
	public List<Product> getProductsByCategory(@PathVariable Long categoryId)
	{
		System.out.print("Yes there is no error");
		return productService.getProductsByCategory(categoryId);
	}
}
