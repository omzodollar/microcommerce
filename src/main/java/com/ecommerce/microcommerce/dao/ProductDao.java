package com.ecommerce.microcommerce.dao;
import com.ecommerce.microcommerce.model.Product;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {
    public List<Product>findAll();
    public  Product findById(int id);
    public  Product save(Product product);
    List<Product> findByPrixGreaterThan(int prixLimit);
    List<Product> findByNomLike(String recherche);
}