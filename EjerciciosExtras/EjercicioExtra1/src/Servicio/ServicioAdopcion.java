/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
*/
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ServicioAdopcion {
    
    Scanner leer = new Scanner(System.in);
    List<Persona> adoptantes = new ArrayList();
    List<Perro> perros = new ArrayList();
    
    public void crearPersona(){
        
        String rta;
        do {
            System.out.println("---Nuevo Adoptante---");
            Persona p = new Persona();
            System.out.print("Nombre: ");
            p.setNombre(leer.next());
            System.out.print("Apellido: ");
            p.setApellido(leer.next());
            System.out.print("Edad: ");
            p.setEdad(leer.nextInt());
            System.out.print("Documento: ");
            p.setDocumento(leer.nextInt());
            adoptantes.add(p);
            System.out.println("¿Desea ingresar otro adoptante?");
            rta = leer.next();
            System.out.println("");
        } while (rta.equalsIgnoreCase("S"));
    
    }
    
    public void crearPerro(){
        
        String rta;
        do {
            System.out.println("---Nuevo Perro---");
            Perro m = new Perro();
            System.out.print("Nombre: ");
            m.setNombre(leer.next().toUpperCase());
            System.out.print("Raza: ");
            m.setRaza(leer.next());
            System.out.print("Edad: ");
            m.setEdad(leer.nextInt());
            System.out.print("Tamaño: ");
            m.setTamaño(leer.next());
            perros.add(m);
            System.out.println("¿Desea ingresar otro perro para poner en adopción?");
            rta = leer.next();
            System.out.println("");
        } while (rta.equalsIgnoreCase("S"));
        
    }
    
    public void adopcion(){
        
        for (Persona persona : adoptantes) {
            System.out.println("¿Que perro desea adoptar " + persona.getNombre() + "?");           
            if (perros.isEmpty()) {
                System.out.println("No quedan más perros en adopción");
            } else {
                System.out.println("---Perros en adopción---");
                for (Perro perro : perros) {
                    System.out.println("-" + perro.getNombre());
                }
                
                String adopcion = leer.next().toUpperCase();
                Iterator it = perros.iterator();
                int cont = perros.size();
                while(it.hasNext()){
                    Perro m = (Perro) it.next();
                    if (m.toString().contains(adopcion)) {
                        it.remove();
                    }
                }
                if (cont == perros.size()) {
                    System.out.println("El perro ingresado no se encuentra");
                }
            }
            System.out.println("");
        }
        
    }
    
}
