
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("Ingrese 1 si quiere cargar un Cliente, ingrese 2 si quiere cargar un Cliente Preferencial, Ingrese 0 si quiere finalizar: ");
            opcion = sc.nextInt();

            if (opcion == 1) {

                System.out.println("Ingrese numero de cliente: ");
                int id = sc.nextInt();
                System.out.println("Ingrese el nombre del cliente: ");
                sc.nextLine();
                String nombre = sc.nextLine();
                System.out.println("Ingrese el telefono del cliente: ");
                int telefono = sc.nextInt();

                Cliente cli = new Cliente(nombre, id, telefono);
                System.out.println(cli.toString());
            }

            if (opcion == 2) {
                System.out.println("Ingrese numero de cliente: ");
                int id = sc.nextInt();
                System.out.println("Ingrese el nombre del cliente: ");
                sc.nextLine();
                String nombre = sc.nextLine();
                System.out.println("Ingrese el telefono del cliente: ");
                int telefono = sc.nextInt();

                System.out.println("Ingrese el saldo del cliente: ");
                double saldo = sc.nextDouble();
                System.out.println("Ingrese el saldo limite: ");
                double limite_saldo = sc.nextDouble();
                System.out.println("Ingrese el domicilio: ");
                sc.nextLine();
                String domicilio = sc.nextLine();

                ClientePreferencial cliPre = new ClientePreferencial(saldo, limite_saldo, domicilio, nombre, id, telefono);
                System.out.println(cliPre.toString());
            }
            
            if(opcion == 0){
                break;
            }
        }
        
    }
}
