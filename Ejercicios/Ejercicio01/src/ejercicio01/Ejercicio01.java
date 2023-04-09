/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
*/
package ejercicio01;

import Entidad.Perro;
import Entidad.Persona;

public class Ejercicio01 {

    public static void main(String[] args) {

        Perro m1 = new Perro("Duque", "Pastor Aleman", 4, "Grande");
        Perro m2 = new Perro("Claudio", "Caniche", 3, "Mediano");
        
        Persona p1 = new Persona("Pedro", "Rodriguez", 61, 12345678, m1);
        Persona p2 = new Persona("Luis", "Alespiedo", 35, 12345678, m2);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
}
