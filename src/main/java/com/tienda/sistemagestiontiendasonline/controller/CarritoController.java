package com.tienda.sistemagestiontiendasonline.controller;

import com.tienda.sistemagestiontiendasonline.service.CarritoService;
import com.tienda.sistemagestiontiendasonline.model.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carritos")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @PostMapping("/cliente/{clienteId}")
    public Carrito crearCarrito(@PathVariable Long clienteId) {
        return carritoService.crearCarrito(clienteId);
    }

    // Otros endpoints para gestionar carritos
}