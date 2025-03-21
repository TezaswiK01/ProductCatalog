package com.ecommerce.productCatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.productCatalog.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{

}
