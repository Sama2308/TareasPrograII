package com.tienda.sistemagestiontiendasonline.service;

import com.tienda.sistemagestiontiendasonline.model.Pedido;
import com.tienda.sistemagestiontiendasonline.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido crearPedido(Long clienteId) {
        Pedido pedido = new Pedido();
        // Aquí puedes establecer el cliente si tienes la lógica
        return pedidoRepository.save(pedido);
    }

    // Otros métodos para gestionar pedidos
}