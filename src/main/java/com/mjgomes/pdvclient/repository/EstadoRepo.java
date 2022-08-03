package com.mjgomes.pdvclient.repository;

import com.mjgomes.pdvclient.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepo extends JpaRepository<Estado, Long> {
}
