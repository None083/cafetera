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

    // Atributos
    private double cantidadMaxima;
    private double cantidadActual;

    // Constructor sin paramatetros
    public Cafetera() {
        this.cantidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    // Constructor que solo recibe la capacidad máxima
    public Cafetera(double cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadMaxima;
    }

    // Constructor con las dos capacidades
    public Cafetera(double cantidadMaxima, double cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;

        // Si la cantidad actual es mayor que la máxima 
        //se ajusta a la cantidad máxima
        //si no, simplemente da la cantidad que hayamos puesto
        if (cantidadActual > cantidadMaxima) {
            this.cantidadActual = cantidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }
    
    // Getter de cantidad actual, para poder mirarlo en las pruebas
    public double getCantidadActual() {
        return cantidadActual;
    }

    // Método que pone la cafetera con su cantidad máxima
    public void llenarCafetera() {
        this.cantidadActual = this.cantidadMaxima;
    }

    // Método para restar cantides al contenido de la cafetera
    public void servirTaza(double cantidadAServir) {
        // Si es más de lo que se puede la cantidadActual se queda a 0
        if (cantidadAServir > this.cantidadActual) {
            this.cantidadActual = 0;
        } else {
            this.cantidadActual = this.cantidadActual - cantidadAServir;
        }

    }

    // Método que pone el contenido actual en 0
    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    // Es igual que el método de servir taza, pero aquí se llena, en vez de vaciar
    public void agregarCafe(double cantidadAgregar) {
        if (cantidadAgregar > this.cantidadMaxima) {
            this.cantidadActual = this.cantidadMaxima;
        } else {
            this.cantidadActual = this.cantidadActual + cantidadAgregar;
        }
    }

}
