
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del jugador: ");
        sc.hasNextLine();
        String nombreJugador = sc.nextLine();
        System.out.println("Ingrese la cantidad de apuestas: ");
        int cantidadApuestas = sc.nextInt();
        
        Ruleta ruleta = new Ruleta(nombreJugador, cantidadApuestas);
        
        for (int i = 0; i < cantidadApuestas; i++) {
            System.out.println("Ingrese el numero jugado: ");
            int numeroJugado = sc.nextInt();
            System.out.println("Ingrese el dinero apostado: ");
            float dineroApostado = sc.nextFloat();
            System.out.println("Ingrese el numero que salio: ");
            int numeroQueSalio = sc.nextInt();
            
            Apuesta apuesta = new Apuesta(numeroJugado, dineroApostado, numeroQueSalio);
            ruleta.agregarApuesta(apuesta);
        }
        
        System.out.println("Cantidad de apuesta ganadas: " + ruleta.cantidadApuestasGanadas());
        System.out.println("Dinero total ganado: " + ruleta.totalGanado());
        System.out.println("Suma del dinero apostado a numeros pares: " + ruleta.sumaNumerosPares());
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        System.out.println("Veces que salio el numero " + numero + ": " + ruleta.vecesQueSalio(numero));
    }
}
