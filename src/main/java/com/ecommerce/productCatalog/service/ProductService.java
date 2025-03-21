package com.ecommerce.productCatalog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.productCatalog.model.Product;
import com.ecommerce.productCatalog.repository.ProductRepository;

@Service
public class ProductService {

	private ProductRepository productRepository;
	
	

	public ProductService(ProductRepository productRepository) {
		
		this.productRepository = productRepository;
	}



	public List<Product> getAllProducts()
	{
		return  productRepository.findAll();
	}



	public List<Product> getProductsByCategory(Long cateogryId) {
		// TODO Auto-generated method stub
		return productRepository.findByCategoryId( cateogryId);
		
	}
}
