/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
*/
package Servicio;

import Entidad.Carta;
import static java.util.Collections.shuffle;
import java.util.List;
import java.util.Scanner;

public class ServicioBaraja {
    
    Scanner leer = new Scanner(System.in);
    
    public void barajar(List<Carta> baraja){
        
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 13; j++) {
                if (j == 8 || j == 9) {
                    continue;
                }
                Carta c = new Carta();
                c.setNumero(j);
                switch(i){
                    case 1:
                        c.setPalo("Espada");
                        break;
                    case 2:
                        c.setPalo("Basto");
                        break;
                    case 3:
                        c.setPalo("Oro");
                        break;
                    case 4:
                        c.setPalo("Copa");
                        break;
                }
                baraja.add(c);
            }
        }
        shuffle(baraja);
    }

    public void siguienteCarta(List<Carta> baraja, List<Carta> monton){
        
        if (baraja.isEmpty()) {
            System.out.println("No hay más cartas");
        } else {
            System.out.println(baraja.get(0));
            monton.add(baraja.get(0));
            baraja.remove(0);
        }
        
    }
    
    public void mostrarBaraja(List<Carta> baraja){
        
        for (Carta carta : baraja) {
            System.out.println(carta);
        }
        
    }
    
    public void cartasDisponibles(List<Carta> baraja){
        
        System.out.println("Cartas Disponibles: " + baraja.size());
        
    }
    
    public void darCartas(List<Carta> baraja, List<Carta> monton){
        
        System.out.println("¿Cuántas cartas desea retirar?");
        int cartas = leer.nextInt();
        if (baraja.size() >= cartas) {
            for (int i = 0; i < cartas; i++) {
                System.out.println(baraja.get(0));
                monton.add(baraja.get(0));
                baraja.remove(0);
            }
        } else {
            System.out.println("No hay suficientes cartas");
            System.out.println("Cantidad disponibles: " + baraja.size());
        }
        
    }
    
    public void cartasMonton(List<Carta> monton){
        
        if (monton.isEmpty()) {
            System.out.println("No ha salido ninguna carta");
        } else {
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }
 
    }
    
}
