package com.api.productos.repositories;

import com.api.productos.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface I_ProductoRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findByNombre(String nombre);
    List<Producto> findByPrecio(float precio);
}
