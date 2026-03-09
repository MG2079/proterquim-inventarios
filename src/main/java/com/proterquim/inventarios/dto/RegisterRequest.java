/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proterquim.inventarios.dto;

// Clase que representa los datos enviados para registrar un usuario
public class RegisterRequest {

    private String nombre;
    private String correo;
    private String contrasena;

    // Getter nombre
    public String getNombre() {
        return nombre;
    }

    // Setter nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter correo
    public String getCorreo() {
        return correo;
    }

    // Setter correo
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Getter contraseña
    public String getContrasena() {
        return contrasena;
    }

    // Setter contraseña
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
