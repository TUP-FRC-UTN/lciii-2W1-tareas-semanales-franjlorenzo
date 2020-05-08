
package veterinaria;

import java.util.Scanner;

public class Veterinaria {

    public static void main(String[] args) {
        
        Cliente[] cliente;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de clientes a cargar: ");
        int cantidad = sc.nextInt();
        
        cliente = new Cliente[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el numero de cliente: ");
            int nroCliente = sc.nextInt();
            
            System.out.println("Ingrese el nombre del cliente: ");
            sc.nextLine();
            String nombre = sc.nextLine();
            
            System.out.println("Ingrese la antiguedad del cliente: ");
            int antiguedad = sc.nextInt();
            
            System.out.println("Ingrese el nombre de la mascota: ");
            sc.nextLine();
            String nombreMascota = sc.nextLine();
            
            System.out.println("Ingrese la edad de la mascota: ");
            int edadMascota = sc.nextInt();
            
            cliente[i] = new Cliente(nroCliente, nombre, antiguedad, nombreMascota, edadMascota);
        }
        
        //1---mostrar cantidad de clientes
        System.out.println("Hay " + cantidad + " clientes.");
        
        for (int i = 0; i < cliente.length; i++) {
            System.out.println(cliente[i]);
        }
        
        //2---promedio de edad de las mascotas
        int sumaEdades = 0;
        
        for (int i = 0; i < cliente.length; i++) {
            sumaEdades += cliente[i].getEdadMascota();
        }
        
        float promedioEdades = sumaEdades / cantidad;
        System.out.println("El promedio de edades de las mascotas es de " + promedioEdades);
        
        //3---clientes con mayor o igual a 5 años de antiguedad
        int contadorAntiguedad = 0;
        for (int i = 0; i < cliente.length; i++) {
            if(cliente[i].getAntiguedad() >= 5){
                contadorAntiguedad++;
            }
        }
        
        System.out.println("La cantidad de clientes con antiguedad mayor o igual a 5 es de " + contadorAntiguedad);
    }
    
}
