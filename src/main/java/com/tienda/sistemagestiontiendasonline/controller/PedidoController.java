package com.tienda.sistemagestiontiendasonline.controller;

import com.tienda.sistemagestiontiendasonline.model.Pedido;
import com.tienda.sistemagestiontiendasonline.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/cliente/{clienteId}")
    public Pedido crearPedido(@PathVariable Long clienteId) {
        return pedidoService.crearPedido(clienteId);
    }

    // Otros endpoints para gestionar pedidos
}