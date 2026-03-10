/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proterquim.inventarios.controller;

import com.proterquim.inventarios.dto.LoginRequest;
import com.proterquim.inventarios.model.Usuario;
import com.proterquim.inventarios.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.proterquim.inventarios.dto.RegisterRequest;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Servicio web que permite iniciar sesión
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        // Buscar usuario por correo
        Usuario usuario = usuarioRepository.findByCorreo(request.getCorreo());

        // Validar credenciales
        if (usuario != null && usuario.getContrasena().equals(request.getContrasena())) {
            return "Autenticación satisfactoria";
        }

        return "Error en la autenticación";
    }
    
    // Servicio web para registrar un usuario
@PostMapping("/registro")
public String registro(@RequestBody RegisterRequest request) {

    // Verificar si el usuario ya existe
    Usuario usuarioExistente = usuarioRepository.findByCorreo(request.getCorreo());

    if (usuarioExistente != null) {
        return "El usuario ya está registrado";
    }

    // Crear nuevo usuario
    Usuario nuevoUsuario = new Usuario();
    nuevoUsuario.setNombre(request.getNombre());
    nuevoUsuario.setCorreo(request.getCorreo());
    nuevoUsuario.setContrasena(request.getContrasena());
    nuevoUsuario.setId_rol(1);

    // Guardar en la base de datos
    usuarioRepository.save(nuevoUsuario);

    return "Usuario registrado correctamente";
}
}
