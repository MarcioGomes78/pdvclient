package com.mjgomes.pdvclient.repository;

import com.mjgomes.pdvclient.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Long, Product>{
}
