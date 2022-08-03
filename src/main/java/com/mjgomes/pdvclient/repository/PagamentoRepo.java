package com.mjgomes.pdvclient.repository;

import com.mjgomes.pdvclient.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepo extends JpaRepository<Pagamento, Long> {
}
