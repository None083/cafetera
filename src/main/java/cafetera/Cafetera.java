/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafetera;

/**
 *
 * @author noelia
 */
public class Cafetera {
    
    double cantidadMaxima;
    double cantidadActual;

    public Cafetera() {
    }

    public Cafetera(double cantidadMaxima) {
        this.cantidadActual = cantidadMaxima;
    }

    public Cafetera(double cantidadMaxima, double cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;
        if(cantidadActual > cantidadMaxima){
            this.cantidadActual = cantidadMaxima;
        } else{
            this.cantidadActual = cantidadActual;
        }
    }
    
    public void llenarCafetera (double cantidadActual, double cantidadMaxima){
        cantidadActual = cantidadMaxima;
    }
    
    
    
    
}
