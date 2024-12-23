package com.tienda.sistemagestiontiendasonline.service;

import com.tienda.sistemagestiontiendasonline.model.Producto;
import com.tienda.sistemagestiontiendasonline.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    public Producto agregarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Otros métodos para gestionar productos
}