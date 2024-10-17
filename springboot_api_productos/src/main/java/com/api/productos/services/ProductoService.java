package com.api.productos.services;

import com.api.productos.entities.Producto;
import com.api.productos.repositories.I_ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private I_ProductoRepository productoRepository;

    // Método para agregar un nuevo producto
    public Producto agregarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Método para actualizar un producto existente
    public Producto actualizarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Método para eliminar un producto
    public void eliminarProducto(int id) {
        productoRepository.deleteById(id);
    }

    // Método para obtener todos los productos
    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    // Método para obtener un producto por ID
    public Optional<Producto> obtenerProductoPorId(int id) {
        return productoRepository.findById(id);
    }
}
