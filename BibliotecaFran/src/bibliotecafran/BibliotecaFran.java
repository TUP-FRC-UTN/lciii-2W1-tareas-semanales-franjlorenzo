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
            
            for (int j = 0; j < cantidadPrestamos; j++) {
                System.out.println("Ingrese el nombre del solicitante: " + j);
                sc.nextLine();
                String solicitante = sc.nextLine();
                System.out.println("Ingrese la cantidad de dias prestados: ");
                int cantidadDias = sc.nextInt();
                System.out.println("Ingrese si el libro fue devuelto(1) o no fue devuelto(0): ");
                int devu = sc.nextInt();
                boolean devuelto = false;
                if(devu == 1){
                    devuelto = true;
                }
                Prestamo pr = new Prestamo(solicitante, cantidadDias, devuelto);
                libro.agregarPrestamo(pr);
            }
            biblioteca.agregarLibro(libro);
        }
        
        System.out.println("Cantidad de libros disponibles: " + biblioteca.cantidadLibros(1));
        System.out.println("Cantidad de libros prestados: " + biblioteca.cantidadLibros(2));
        System.out.println("Cantidad de libros extraviados: " + biblioteca.cantidadLibros(3));
        System.out.println("Suma de los precios de libros extraviados: " + biblioteca.sumaPrecioExtraviados());
        System.out.println("Promedio de libros prestados: " + biblioteca.promedioPrestamos());  
    }
    
}
