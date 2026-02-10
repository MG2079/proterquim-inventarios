/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proterquim.inventarios.repository;

import com.proterquim.inventarios.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de Producto
 * Proporciona operaciones CRUD para la entidad Producto.
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // No es necesario escribir métodos básicos,
    // Spring Data JPA los genera automáticamente.
}

