/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafetera;

/**
 *
 * @author FX506
 */
public class Pruebas {

    /**
     *
     */
    public static void main(String[] args) {

        Cafetera nespresso = new Cafetera(700, 0);
        Persona noelia = new Persona("Noelia", 30);
        Persona persona2 = new Persona("Persona 2", 0);

        noelia.hacerCafe(nespresso);
        noelia.beberCafé(nespresso, 200);
        System.out.println("Noelia se ha servido una taza de café, en la cafetera queda: "
                + nespresso.getCantidadActual() + " c.c");
        
        persona2.beberCafé(nespresso, 600);
        System.out.println("Alguien más se ha servido café, ahora queda: " 
                + nespresso.getCantidadActual() + " c.c");
        
        noelia.hacerCafe(nespresso);
        noelia.beberCafé(nespresso, 500);
        System.out.println("Noelia se ha vuelto a sarvir una taza, en la cafetera queda: "
                + nespresso.getCantidadActual() + " c.c");
        
        nespresso.vaciarCafetera();
        System.out.println(nespresso.getCantidadActual());
        
        PersonaR persona3 = new PersonaR("Persona 3", 20);
        persona3.hacerCafe(nespresso);
        persona3.beberCafé(nespresso, 300);
        System.out.println("Una tercera persona se ha servido una taza, ahora queda: " 
                + nespresso.getCantidadActual() + " c.c");
        
        
        PersonaR persona4 = new PersonaR("Persona 4", 24);
        System.out.println(persona3.equals(persona4));

    }

}
