# Sistema de Inventarios – Proterquim

## Descripción del proyecto
El **Sistema de Inventarios Proterquim** es una aplicación desarrollada en **Java** utilizando el framework **Spring Boot**, cuyo objetivo es gestionar de forma eficiente los productos de la empresa Proterquim.

El sistema permite administrar el inventario mediante servicios web REST, permitiendo registrar, consultar y eliminar productos. Además, incluye un módulo de autenticación de usuarios para el acceso al sistema.

Este proyecto hace parte de una evidencia académica del programa **Análisis y Desarrollo de Software**, enfocada en la codificación de módulos utilizando frameworks Java y buenas prácticas de desarrollo.

# Objetivo

Desarrollar un módulo funcional de inventarios aplicando frameworks de Java, siguiendo los artefactos del ciclo de vida del software (diagramas, casos de uso, diseño y planificación), e implementando servicios web REST con control de versiones.

# Módulos desarrollados

### Gestión de productos
Permite realizar las operaciones básicas del inventario:

- Registrar productos
- Listar productos
- Consultar productos por ID
- Eliminar productos

### Autenticación de usuarios

Permite gestionar el acceso al sistema mediante:

- Registro de usuarios
- Inicio de sesión (login)
- Validación de credenciales

# Arquitectura del proyecto

El sistema está construido bajo una **arquitectura en capas**, organizada de la siguiente manera:
controller → Controladores REST
service → Lógica de negocio
repository → Acceso a datos
model → Entidades del sistema
dto → Objetos de transferencia de datos

# Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Base de datos H2 (en memoria)
- Maven
- Apache Tomcat (embebido)
- NetBeans IDE
- Git y GitHub
- Postman (pruebas de API)

---

# Ejecución del proyecto

Para ejecutar el proyecto localmente:

1. Clonar el repositorio:
git clone https://github.com/MG2079/proterquim-inventarios.git

2. Abrir el proyecto en **NetBeans** o cualquier IDE compatible con Java.

3. Asegurarse de tener instalado **Java JDK 17 o superior**.

4. Ejecutar la clase principal:
ProterquimInventariosApplication.java

La aplicación se ejecutará en:
http://localhost:8081

# Endpoints principales

## Gestión de productos

Listar productos
GET /api/productos

Crear producto
POST /api/productos

Buscar producto por ID
GET /api/productos/{id}

Eliminar producto
DELETE /api/productos/{id}


# Autenticación de usuarios

Registro de usuario

POST /api/registro

Login de usuario

POST /api/login

Ejemplo de solicitud login:

```json
{
 "correo": "usuario@proterquim.com",
 "contrasena": "123456"
}
Base de datos

El sistema utiliza H2 Database en memoria para pruebas y desarrollo.

La consola de administración está disponible en:

http://localhost:8081/h2-console
Contexto académico

Este proyecto fue desarrollado como evidencia práctica del programa Análisis y Desarrollo de Software, con el objetivo de aplicar conceptos de:

Arquitectura de software

Desarrollo backend con frameworks Java

Persistencia de datos

Servicios web REST

Control de versiones con Git

Autor
Mario Gallo

Programa: Análisis y Desarrollo de Software
Servicio Nacional de Aprendizaje – SENA
