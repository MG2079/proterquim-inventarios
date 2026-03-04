import { useEffect, useState } from "react";
import { productoService } from "../../services/productoService";

/**
 * Componente React que muestra el inventario de productos.
 * Se encarga de:
 * - Consultar los productos desde el backend
 * - Mostrar la lista en una tabla
 * - Permitir eliminar productos del inventario
 */
function ProductoList() {

  // Estado que almacena la lista de productos obtenidos del backend
  const [productos, setProductos] = useState([]);

  /**
   * Función que consulta los productos desde la API REST
   * definida en el backend (Spring Boot).
   */
  const cargarProductos = async () => {
    try {
      const data = await productoService.listarProductos();
      setProductos(data);
    } catch (error) {
      console.error("Error al cargar productos:", error);
    }
  };

  /**
   * Hook useEffect
   * Se ejecuta automáticamente cuando el componente se carga
   * y llama la función para obtener los productos.
   */
  useEffect(() => {
    cargarProductos();
  }, []);

  /**
   * Función para eliminar un producto del inventario.
   * Recibe el ID del producto y llama al servicio backend.
   */
  const eliminarProducto = async (id) => {
    try {
      await productoService.eliminarProducto(id);
      // Recarga la lista después de eliminar
      cargarProductos();
    } catch (error) {
      console.error("Error al eliminar producto:", error);
    }
  };

  return (
    <div>
      {/* Título del módulo de inventario */}
      <h2>Inventario de Productos</h2>

      {/* Tabla donde se muestran los productos */}
      <table border="1">

        {/* Encabezados de la tabla */}
        <thead>
          <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Descripción</th>
            <th>Precio</th>
            <th>Stock</th>
            <th>Acciones</th>
          </tr>
        </thead>

        {/* Cuerpo de la tabla */}
        <tbody>
          {productos.map((producto) => (
            <tr key={producto.id}>
              <td>{producto.id}</td>
              <td>{producto.nombre}</td>
              <td>{producto.descripcion}</td>
              <td>{producto.precio}</td>
              <td>{producto.stock}</td>

              {/* Botón para eliminar el producto */}
              <td>
                <button onClick={() => eliminarProducto(producto.id)}>
                  Eliminar
                </button>
              </td>
            </tr>
          ))}
        </tbody>

      </table>
    </div>
  );
}

export default ProductoList;