/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proterquim.inventarios.service;

import com.proterquim.inventarios.model.Producto;
import com.proterquim.inventarios.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio Producto
 * Contiene la lógica de negocio del módulo de inventarios.
 */
@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    /**
     * Listar todos los productos
     */
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    /**
     * Guardar o actualizar un producto
     */
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    /**
     * Buscar producto por ID
     */
    public Optional<Producto> buscarPorId(Long id) {
        return productoRepository.findById(id);
    }

    /**
     * Eliminar producto por ID
     */
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}

