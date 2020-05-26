package bibliotecafran;

import java.util.Scanner;

public class BibliotecaFran {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de libros: ");
        int cantidadLibros = sc.nextInt();
        
        Biblioteca biblioteca = new Biblioteca(cantidadLibros);
        
        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println("Ingrese un titulo del libro: " + i);
            sc.nextLine();
            String titulo = sc.nextLine();
            System.out.println("Ingrese el precio del libro: " + i);
            int precio = sc.nextInt();
            System.out.println("Ingrese el estado (1: disponible, 2: prestado, 3: extraviado): ");
            int estado = sc.nextInt();
            System.out.println("Ingrese la cantidad de prestamos: ");
            int cantidadPrestamos = sc.nextInt();
            
            Libro libro = new Libro(titulo, precio, estado, cantidadPrestamos);
        }
        
        
    }
    
}
