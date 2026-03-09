/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proterquim.inventarios.dto;

// Clase que representa los datos enviados para iniciar sesión
public class LoginRequest {

    private String correo;
    private String contrasena;

    // Getter del correo
    public String getCorreo() {
        return correo;
    }

    // Setter del correo
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Getter de la contraseña
    public String getContrasena() {
        return contrasena;
    }

    // Setter de la contraseña
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
