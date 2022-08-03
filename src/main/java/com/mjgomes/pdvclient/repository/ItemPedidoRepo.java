package com.mjgomes.pdvclient.repository;

import com.mjgomes.pdvclient.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepo extends JpaRepository<ItemPedido, Long> {
}
