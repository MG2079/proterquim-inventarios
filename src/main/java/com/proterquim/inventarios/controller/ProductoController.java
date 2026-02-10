/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proterquim.inventarios.controller;

import com.proterquim.inventarios.model.Producto;
import com.proterquim.inventarios.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controlador REST de Producto
 * Expone los servicios del módulo de inventarios.
 */
@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    /**
     * Listar todos los productos
     */
    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.listarProductos();
    }

    /**
     * Crear un nuevo producto
     */
    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.guardarProducto(producto);
    }

    /**
     * Buscar producto por ID
     */
    @GetMapping("/{id}")
    public Optional<Producto> buscarProducto(@PathVariable Long id) {
        return productoService.buscarPorId(id);
    }

    /**
     * Eliminar producto por ID
     */
    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
    }
}
