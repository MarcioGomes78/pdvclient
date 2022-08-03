package com.mjgomes.pdvclient.repository;

import com.mjgomes.pdvclient.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepo extends JpaRepository<Cidade, Long> {
}
