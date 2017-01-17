/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Itzel
 */
public class Automovil {
    
    private String color;
    private String marca;
    private String submarca;
    private int modelo;
    private double precio;

    public double getPrecio() {
        return precio;
    }
    
    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public int getModelo() {
        return modelo;
    }
    
    public void descripcion() {
        
        System.out.println("Vehiculo Marca:" + marca );
        System.out.println("Sub-Marca:" + submarca);
        System.out.println("Modelo:" + modelo);
        System.out.println("Color:" + color);
        System.out.println("Precio:" + precio);
        
    }
    
    public static void main(String[] args) { 
        //CREACION DE UNA ESTANCIA (OBJETO) DE TIPO AUTOMOVIL
        Automovil miCarrito = new Automovil();
        miCarrito.color = "rojo";
        miCarrito.marca = "VW";
        miCarrito.modelo = 1999;
        miCarrito.precio = 100000;
        miCarrito. submarca = "Bocho";
        
        miCarrito.descripcion();
        
    }
    
}
