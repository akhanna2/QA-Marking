package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{
	
	@Query(value="select * from product where brand=?1", nativeQuery=true)
	List<Product> findProductByBrand(String brand);
	
	@Query("select prod from Product prod where prod.name=?1")
	List<Product> findProductByName(String name);
	
}
