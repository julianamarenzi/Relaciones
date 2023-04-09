/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
*/
package ejercicioextra1;

import Entidad.Perro;
import Entidad.Persona;
import Servicio.ServicioAdopcion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioExtra1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        List<Persona> adoptantes = new ArrayList();
        List<Perro> perros = new ArrayList();
        ServicioAdopcion sa = new ServicioAdopcion();
        
        sa.crearPersona();
        sa.crearPerro();
        sa.adopcion();
            
    }
    
}
