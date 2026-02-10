# Sistema de Inventarios – Proterquim

## 📌 Descripción del proyecto
El Sistema de Inventarios Proterquim es una aplicación desarrollada en Java utilizando el framework Spring Boot, cuyo objetivo es gestionar de forma eficiente los productos de la empresa Proterquim.  
Este módulo permite realizar operaciones básicas de inventario como registrar, consultar y eliminar productos, aplicando una arquitectura en capas y buenas prácticas de desarrollo de software.

El proyecto hace parte de una evidencia académica del programa Análisis y Desarrollo de Software, enfocada en la codificación de módulos usando frameworks Java.

---

## 🎯 Objetivo
Desarrollar un módulo funcional de inventarios aplicando frameworks de Java, siguiendo los artefactos del ciclo de vida del software (diagramas, casos de uso, diseño y planificación), y utilizando herramientas de versionamiento.

---

## 🧩 Módulo desarrollado
**Módulo de Gestión de Productos**, el cual permite:
- Registrar productos
- Listar productos
- Consultar productos por ID
- Eliminar productos

---

## 🏗️ Arquitectura del proyecto
El sistema está construido bajo una **arquitectura en capas**, distribuida de la siguiente forma:

- **model**: Entidades del sistema (Producto)
- **repository**: Acceso a datos con Spring Data JPA
- **service**: Lógica de negocio
- **controller**: Controladores REST (Spring MVC)

---

## 🛠️ Tecnologías utilizadas
- Java 17
- Spring Boot 4.0.2
- Spring Web
- Spring Data JPA
- Base de datos H2 (en memoria)
- Maven
- Apache Tomcat (embebido)
- NetBeans IDE

---

## ▶️ Ejecución del proyecto
Para ejecutar el proyecto localmente:

1. Abrir el proyecto en NetBeans.
2. Asegurarse de tener Java JDK 17 o superior.
3. Ejecutar el comando:

4. La aplicación se ejecuta en el puerto:


---

## 🔗 Endpoints principales
- Listar productos:  
`GET /api/productos`
- Crear producto:  
`POST /api/productos`
- Buscar producto por ID:  
`GET /api/productos/{id}`
- Eliminar producto:  
`DELETE /api/productos/{id}`

---

## 🗄️ Base de datos
Se utiliza la base de datos H2 en memoria, configurada únicamente para fines académicos y de prueba.  
La consola H2 está disponible en:


---

## 📚 Contexto académico
Este proyecto fue desarrollado como evidencia práctica para demostrar la aplicación de frameworks Java en el desarrollo de software, integrando conceptos de arquitectura, persistencia de datos, servicios REST y control de versiones.

---

## ✍️ Autor
**Mario Gallo**  
Análisis y Desarrollo de Software  


