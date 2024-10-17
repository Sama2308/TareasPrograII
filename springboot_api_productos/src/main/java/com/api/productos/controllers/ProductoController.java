package com.api.productos.controllers;

import com.api.productos.entities.Producto;
import com.api.productos.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    // Crear un nuevo producto
    @PostMapping("/crear")
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.agregarProducto(producto);
    }

    // Obtener todos los productos
    @GetMapping("/listar")
    public List<Producto> listarProductos() {
        return productoService.obtenerTodosLosProductos();
    }

    // Obtener un producto por ID
    @GetMapping("/buscar/{id}")
    public Optional<Producto> obtenerProducto(@PathVariable int id) {
        return productoService.obtenerProductoPorId(id);
    }

    // Actualizar un producto existente
    @PutMapping("/actualizar")
    public Producto actualizarProducto(@RequestBody Producto producto) {
        return productoService.actualizarProducto(producto);
    }

    // Eliminar un producto por ID
    @DeleteMapping("/eliminar/{id}")
    public void eliminarProducto(@PathVariable int id) {
        productoService.eliminarProducto(id);
    }
}
