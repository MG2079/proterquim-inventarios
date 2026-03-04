/**
 * URL base del endpoint del backend
 * donde se encuentran los servicios REST de productos.
 */
const API_URL = "http://localhost:8081/api/productos";

/**
 * Servicio que se encarga de consumir la API REST
 * del backend para realizar operaciones sobre productos.
 */
export const productoService = {

  /**
   * Obtiene todos los productos del inventario
   * mediante una petición HTTP GET.
   */
  async listarProductos() {
    const response = await fetch(API_URL);
    return await response.json();
  },

  /**
   * Crea un nuevo producto en la base de datos
   * enviando los datos al backend mediante POST.
   */
  async crearProducto(producto) {
    const response = await fetch(API_URL, {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(producto)
    });

    return await response.json();
  },

  /**
   * Elimina un producto del inventario
   * enviando una petición DELETE al backend.
   */
  async eliminarProducto(id) {
    await fetch(`${API_URL}/${id}`, {
      method: "DELETE"
    });
  }

};