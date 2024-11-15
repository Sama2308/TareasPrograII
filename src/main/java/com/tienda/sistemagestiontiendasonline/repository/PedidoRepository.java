package com.tienda.sistemagestiontiendasonline.repository;

import com.tienda.sistemagestiontiendasonline.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}