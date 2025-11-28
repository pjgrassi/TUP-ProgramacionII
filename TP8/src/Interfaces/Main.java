/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Personal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Cliente Uno");
        Cliente c2 = new Cliente("Cliente Dos");
        
        Pedido pedido = new Pedido("Pendiente", c1);
        Pedido pedido2 = new Pedido("Pendiente", c2);
       
        Producto p1 = new Producto("TV LED 75", 1000000);
        Producto p2 = new Producto("Cafetera Nespresso", 400000);
        Producto p3 = new Producto("Lavavajillas", 600000);
        
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p3);
        
        pedido.notificarEstado("EN_PROCESO");
        
        double total = pedido.calcularTotal();
        
        PagoConPayPal pago = new PagoConPayPal();
        
        pago.procesarPago(total);
        
        pedido.notificarEstado("PAGADO");
       
        pedido2.agregarProducto(p2);
        
        pedido2.notificarEstado("EN_PROCESO");
        
        double total2 = pedido2.calcularTotal();
        
        PagoConTarjeta pago2 = new PagoConTarjeta();
        
        pago2.procesarPago(total2);
        
        pedido2.notificarEstado("PAGADO");    
    }
}
