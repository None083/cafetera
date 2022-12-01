/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package cafetera;

/**
 *
 * @author noelia
 */
public record PersonaR(String nombre, int edad) {
    
    public void hacerCafe(Cafetera c) {
        c.llenarCafetera();
    }
    
    public void beberCafé(Cafetera c, int cantidad) {
        c.servirTaza(cantidad);
    }
    
    
    
}
