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

    private double cantidadMaxima;
    private double cantidadActual;

    public Cafetera() {
        this.cantidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(double cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadMaxima;
    }

    public Cafetera(double cantidadMaxima, double cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;
        if (cantidadActual > cantidadMaxima) {
            this.cantidadActual = cantidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    public double getCantidadMaxima() {
        return cantidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void llenarCafetera() {
        this.cantidadActual = this.cantidadMaxima;
    }

    public void servirTaza(double cantidadAServir) {
        if (cantidadAServir > this.cantidadActual) {
            this.cantidadActual = 0;
        } else {
            this.cantidadActual = this.cantidadActual - cantidadAServir;
        }

    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    public void agregarCafe(double cantidadAgregar) {
        if (cantidadAgregar > this.cantidadMaxima) {
            this.cantidadActual = this.cantidadMaxima;
        } else {
            this.cantidadActual = this.cantidadActual + cantidadAgregar;
        }
    }

}
