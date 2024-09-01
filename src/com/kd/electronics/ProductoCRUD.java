package com.kd.electronics;

import java.util.ArrayList;
import java.util.List;

public class ProductoCRUD {
    private List<Producto> productos = new ArrayList<>();

    // Create (Agregar Producto)
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Read (Consultar Producto)
    public Producto consultarProductoPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    // Update (Actualizar Producto)
    public void actualizarProducto(String codigo, String nombre, String descripcion, double precioBase, double precioVenta, String categoria, int cantidadDisponible) {
        Producto producto = consultarProductoPorCodigo(codigo);
        if (producto != null) {
            producto.setNombre(nombre);
            producto.setDescripcion(descripcion);
            producto.setPrecioBase(precioBase);
            producto.setPrecioVenta(precioVenta);
            producto.setCategoria(categoria);
            producto.setCantidadDisponible(cantidadDisponible);
        }
    }

    // Delete (Eliminar Producto)
    public void eliminarProducto(String codigo) {
        Producto producto = consultarProductoPorCodigo(codigo);
        if (producto != null) {
            productos.remove(producto);
        }
    }

    // Listar todos los productos
    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
