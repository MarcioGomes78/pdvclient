package com.mjgomes.pdvclient.repository;

import com.mjgomes.pdvclient.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepo extends JpaRepository<Long, Endereco>{
}
