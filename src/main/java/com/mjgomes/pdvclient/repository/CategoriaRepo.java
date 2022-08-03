package com.mjgomes.pdvclient.repository;

import com.mjgomes.pdvclient.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepo extends JpaRepository<Long, Categoria>{
}
