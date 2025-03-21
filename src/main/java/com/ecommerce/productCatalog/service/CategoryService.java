package com.ecommerce.productCatalog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.productCatalog.model.Category;
import com.ecommerce.productCatalog.repository.CategoryRepository;

@Service
public class CategoryService {

	private final CategoryRepository categoryRepository;
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
		
	}

}
