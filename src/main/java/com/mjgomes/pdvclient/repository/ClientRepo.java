package com.mjgomes.pdvclient.repository;

import com.mjgomes.pdvclient.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Long, Client>{
}
