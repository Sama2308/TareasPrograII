package com.tienda.sistemagestiontiendasonline.service;

import com.tienda.sistemagestiontiendasonline.model.Carrito;
import com.tienda.sistemagestiontiendasonline.repository.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

    public Carrito crearCarrito(Long clienteId) {
        Carrito carrito = new Carrito();
        // Aquí puedes establecer el cliente si tienes la lógica
        return carritoRepository.save(carrito);
    }

    // Otros métodos para gestionar el carrito
}