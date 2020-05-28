import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la fecha de inicio: ");
        int fechaInicio = sc.nextInt();
        System.out.println("Ingrese la cantidad de folletos: ");
        int cantidadOfertas = sc.nextInt();
        
        Folleto folleto = new Folleto(fechaInicio, cantidadOfertas);
        
        for (int i = 0; i < cantidadOfertas; i++) {
            System.out.println("Ingrese el codigo del articulo: ");
            int codigo = sc.nextInt();
            System.out.println("Ingrese el nombre del articulo: ");
            sc.nextLine();
            String nombre = sc.nextLine();
            System.out.println("Ingrese el precio regular del articulo: ");
            float precioRegular = sc.nextFloat();
            System.out.println("Ingrese el precio de oferta: ");
            float precioOferta = sc.nextFloat();
            System.out.println("Ingrese los dias en oferta: ");
            int diasOferta = sc.nextInt();
            System.out.println("Ingrese el stock del articulo: ");
            int stock = sc.nextInt();
            
            Oferta oferta = new Oferta(codigo, nombre, precioRegular, precioOferta, diasOferta, stock);
            folleto.agregarOferta(oferta);
        }
        
        System.out.println("Cantidad de art ofertados por mas de 5 dias: " + folleto.cantidadArtOfertados());
        System.out.println("Total de unidades que hay a la venta: " + folleto.totalUnidades());
        System.out.println("Cant articulos ofrecidos con descuento mayor a 20: " + folleto.descuentoSuperior());
        System.out.println("Ingrese el codigo: del articulo deseado: ");
        int codigo = sc.nextInt();
        System.out.println("Total a recaudar por un articulo indicado por codigo: " + folleto.totalRecaudado(codigo));
    }
}

