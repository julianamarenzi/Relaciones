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
package ejercicio03;

import Entidad.Carta;
import Servicio.ServicioBaraja;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ServicioBaraja sb = new ServicioBaraja();
        List<Carta> baraja = new ArrayList();
        List<Carta> monton = new ArrayList();
        
        sb.barajar(baraja);
        int rta;
        do {
            System.out.println("¿Qué desea realizar? \n 1. Recibir cartas \n 2. Siguiente carta"
                    + "\n 3. Cantidad de cartas disponibles \n 4. Mostrar cartas ya entregadas \n 5. Mostrar baraja restante ");
            rta = leer.nextInt();
            switch(rta){
                case 1:
                    sb.darCartas(baraja, monton);
                    break;
                case 2: 
                    sb.siguienteCarta(baraja, monton);
                    break;
                case 3:
                    sb.cartasDisponibles(baraja);
                    break;
                case 4:
                    sb.cartasMonton(monton);
                    break;
                case 5:
                    sb.mostrarBaraja(baraja);
            }
        } while (rta <= 5);
        
        
        
        
    }
    
}
