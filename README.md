# Sistema de Inventarios – Proterquim

## Descripción del proyecto

El Sistema de Inventarios Proterquim es una aplicación desarrollada en **Java utilizando el framework Spring Boot**, cuyo objetivo es gestionar de forma eficiente los productos de la empresa Proterquim.

El sistema permite realizar operaciones básicas de inventario como:

- Registro de productos
- Consulta de productos
- Eliminación de productos
- Registro de usuarios
- Autenticación de usuarios

El proyecto hace parte de las evidencias académicas del programa **Análisis y Desarrollo de Software**, donde se aplican conceptos de desarrollo de API REST, arquitectura en capas y control de versiones.


# Objetivo del proyecto

Desarrollar una API REST para la gestión de inventarios utilizando **Spring Boot**, aplicando buenas prácticas de desarrollo de software y herramientas de control de versiones como **Git y GitHub**.

# Arquitectura del proyecto

El sistema está construido bajo una arquitectura en capas:

src/main/java/com/proterquim/inventarios
Estructura:

- **model** → Entidades del sistema  
- **repository** → Acceso a datos con Spring Data JPA  
- **service** → Lógica de negocio  
- **controller** → Controladores REST  


# Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Maven
- Base de datos H2
- Postman
- Git
- GitHub


# Endpoints principales

## Autenticación

| Método | Endpoint      | Descripción              |

POST     | /api/registro | Registrar usuario        |
POST     | /api/login    | Autenticación de usuario |


## Gestión de productos

| Método  |    Endpoint         | Descripción        |

POST      | /api/productos      | Crear producto     |
GET       | /api/productos      | Listar productos   |
GET       | /api/productos/{id} | Consultar producto |
DELETE    | /api/productos/{id} | Eliminar producto  |


# Ejecución del proyecto

Para ejecutar el proyecto localmente:

1. Clonar el repositorio

git clone https://github.com/MG2079/proterquim-inventarios.git


2. Ingresar al proyecto

cd inventarios


3. Ejecutar la aplicación

./mvnw spring-boot:run


4. La aplicación se ejecutará en:

http://localhost:8081


# Pruebas de la API

Las pruebas de la API fueron realizadas utilizando **Postman**, verificando el funcionamiento de todos los endpoints del sistema.

Las pruebas incluyen:

- Registro de usuario
- Autenticación de usuario
- Creación de productos
- Consulta de productos
- Eliminación de productos
- Verificación de eliminación


# Repositorio del proyecto

Repositorio en GitHub:

https://github.com/MG2079/proterquim-inventarios


# Autor
Mario Gallo  
Programa: Análisis y Desarrollo de Software
