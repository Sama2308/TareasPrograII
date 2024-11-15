package com.tienda.sistemagestiontiendasonline.repository;

import com.tienda.sistemagestiontiendasonline.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}