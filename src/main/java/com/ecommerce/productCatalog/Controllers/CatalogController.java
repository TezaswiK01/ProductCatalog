package com.ecommerce.productCatalog.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.productCatalog.model.Category;
import com.ecommerce.productCatalog.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins="http://localhost:5173/")

public class CatalogController {
	private final CategoryService categoryService;
	
	public CatalogController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping
	public List<Category> getAllCategories()
	{
		return categoryService.getAllCategories();
	}

}
