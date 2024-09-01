package com.kd.electronics;

public class Main {
    public static void main(String[] args) {
        ProductoCRUD crud = new ProductoCRUD();

        // Crear productos
        Producto p1 = new Producto("001", "Televisor", "TV 50 pulgadas", 3000000, 3500000, "Electrodomésticos", 10);
        Producto p2 = new Producto("002", "Laptop", "Laptop Gamer", 5000000, 5500000, "Computación", 5);
        
        // Agregar productos
        crud.agregarProducto(p1);
        crud.agregarProducto(p2);

        // Listar productos
        System.out.println("Lista de productos:");
        crud.listarProductos();

        // Consultar producto por código
        System.out.println("\nConsultar producto con código 001:");
        System.out.println(crud.consultarProductoPorCodigo("001"));

        // Actualizar producto
        System.out.println("\nActualizar producto con código 002:");
        crud.actualizarProducto("002", "Laptop", "Laptop Gamer Actualizada", 5000000, 5400000, "Computación", 3);
        crud.listarProductos();

        // Eliminar producto
        System.out.println("\nEliminar producto con código 001:");
        crud.eliminarProducto("001");
        crud.listarProductos();
    }
}
