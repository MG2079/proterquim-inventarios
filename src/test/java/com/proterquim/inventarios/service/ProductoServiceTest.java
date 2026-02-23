/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proterquim.inventarios.service;

import com.proterquim.inventarios.model.Producto;
import com.proterquim.inventarios.repository.ProductoRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductoServiceTest {

    @Mock
    private ProductoRepository productoRepository;

    @InjectMocks
    private ProductoService productoService;

    private Producto producto;
    @BeforeEach
    void setUp() {
        producto = new Producto();
        producto.setId(1L);
        producto.setNombre("Producto Test");
        producto.setPrecio(5000.0);
        producto.setStock(10);
    }

    // ✅ CASO EXITOSO: Guardar producto
    @Test
    void guardarProducto_debeGuardarCorrectamente() {

        when(productoRepository.save(producto)).thenReturn(producto);

        Producto resultado = productoService.guardarProducto(producto);

        assertNotNull(resultado);
        assertEquals("Producto Test", resultado.getNombre());
        verify(productoRepository, times(1)).save(producto);
    }

    // ✅ CASO EXITOSO: Buscar producto existente
@Test
void buscarProductoPorId_debeRetornarProducto_siExiste() {

    when(productoRepository.findById(1L)).thenReturn(Optional.of(producto));

    Optional<Producto> resultado = productoService.buscarPorId(1L);

    assertTrue(resultado.isPresent());
    assertEquals(1L, resultado.get().getId());
    verify(productoRepository, times(1)).findById(1L);
}

// ❌ CASO: Producto no encontrado
@Test
void buscarProductoPorId_debeRetornarVacio_siNoExiste() {

    when(productoRepository.findById(1L)).thenReturn(Optional.empty());

    Optional<Producto> resultado = productoService.buscarPorId(1L);

    assertFalse(resultado.isPresent());
    verify(productoRepository, times(1)).findById(1L);
}

@Test
void actualizarProducto_debeRetornarVacio_siNoExiste() {

    Producto productoActualizado = new Producto();
    productoActualizado.setNombre("Producto Actualizado");

    when(productoRepository.findById(1L)).thenReturn(Optional.empty());

    Optional<Producto> resultado = productoService.actualizarProducto(1L, productoActualizado);

    assertFalse(resultado.isPresent());
    verify(productoRepository, times(1)).findById(1L);
    verify(productoRepository, never()).save(any(Producto.class));
}

@Test
void actualizarProducto_debeActualizarCorrectamente_siExiste() {

    Producto productoActualizado = new Producto();
    productoActualizado.setNombre("Producto Actualizado");
    productoActualizado.setDescripcion("Nueva descripción");
    productoActualizado.setPrecio(8000.0);
    productoActualizado.setStock(20);

    when(productoRepository.findById(1L)).thenReturn(Optional.of(producto));
    when(productoRepository.save(any(Producto.class))).thenReturn(productoActualizado);

    Optional<Producto> resultado = productoService.actualizarProducto(1L, productoActualizado);

    assertTrue(resultado.isPresent());
    assertEquals("Producto Actualizado", resultado.get().getNombre());
    verify(productoRepository, times(1)).findById(1L);
    verify(productoRepository, times(1)).save(any(Producto.class));
}

@Test
void eliminarProducto_debeEliminarCorrectamente() {

    doNothing().when(productoRepository).deleteById(1L);

    productoService.eliminarProducto(1L);

    verify(productoRepository, times(1)).deleteById(1L);
}
}
