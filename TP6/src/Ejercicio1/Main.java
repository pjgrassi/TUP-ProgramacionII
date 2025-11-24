/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Personal
 */
public class Main {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        // 1) Crear 5 productos y agregarlos
        Producto p1 = new Producto("A1", "Leche", 1200, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E1", "Auriculares", 3500, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R1", "Remera", 2500, 50, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H1", "Almohada", 1800, 20, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A2", "Arroz", 900, 40, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2) Listar todos los productos
        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        inventario.listarProductos();

        // 3) Buscar por ID
        System.out.println("\n--- BUSCAR PRODUCTO R1 ---");
        Producto buscado = inventario.buscarProductoPorId("R1");
        if (buscado != null) buscado.mostrarInfo();

        // 4) Filtrar por categoría
        System.out.println("\n--- PRODUCTOS DE ALIMENTOS ---");
        for (Producto p : inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS)) {
            p.mostrarInfo();
        }

        // 5) Eliminar un producto
        System.out.println("\n--- ELIMINAR PRODUCTO H1 ---");
        inventario.eliminarProducto("H1");
        inventario.listarProductos();

        // 6) Actualizar stock
        System.out.println("\n--- ACTUALIZAR STOCK DE E1 A 25 ---");
        inventario.actualizarStock("E1", 25);
        inventario.buscarProductoPorId("E1").mostrarInfo();

        // 7) Total de stock
        System.out.println("\n--- TOTAL DE STOCK ---");
        System.out.println("Total: " + inventario.obtenerTotalStock());

        // 8) Producto con mayor stock
        System.out.println("\n--- PRODUCTO CON MAYOR STOCK ---");
        inventario.obtenerProductoConMayorStock().mostrarInfo();

        // 9) Filtrar por rango de precio
        System.out.println("\n--- PRODUCTOS ENTRE $1000 Y $3000 ---");
        for (Producto p : inventario.filtrarProductosPorPrecio(1000, 3000)) {
            p.mostrarInfo();
        }

        // 10) Mostrar categorías disponibles
        System.out.println("\n--- CATEGORIAS DISPONIBLES ---");
        inventario.mostrarCategoriasDisponibles();
    }
}

