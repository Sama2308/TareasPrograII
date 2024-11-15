package com.tienda.sistemagestiontiendasonline.repository;

import com.tienda.sistemagestiontiendasonline.model.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarritoRepository extends JpaRepository<Carrito, Long> {
}