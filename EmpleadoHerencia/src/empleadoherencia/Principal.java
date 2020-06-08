package empleadoherencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleado = new ArrayList(1);

        int opcion = -1;
        while (opcion != 0) {

            System.out.println("Bienvenido al menu.");
            System.out.println("Ingrese 1 si es obrero. \n"
                    + "ingrese 2 si es administrativo. \n"
                    + "ingrese 3 si es vendedor. \n"
                    + "ingrese 0 si quiere salir.");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Ingrese el legajo del empleado: ");
                int legajo = sc.nextInt();
                System.out.println("Ingrese el nombre del empleado: ");
                sc.nextLine();
                sc.hasNextLine();
                String nombre = sc.nextLine();
                System.out.println("Ingrese el sueldo basico: ");
                float sueldoBasico = sc.nextFloat();
                System.out.println("Ingrese los dias trabajados: ");
                int diasTrabajados = sc.nextInt();
                
                Obrero obrero = new Obrero(diasTrabajados, legajo, nombre, sueldoBasico);
                listaEmpleado.add(obrero);
            }
            
            if(opcion == 2){
                System.out.println("Ingrese el legajo del empleado: ");
                int legajo = sc.nextInt();
                System.out.println("Ingrese el nombre del empleado: ");
                sc.nextLine();
                String nombre = sc.nextLine();
                System.out.println("Ingrese el sueldo basico: ");
                float sueldoBasico = sc.nextFloat();
                System.out.println("Ingrese 1 si estuvo presente o 2 si estuvo ausente: ");
                int estuvoPresente = sc.nextInt();
                boolean presentismo = false;
                if(estuvoPresente == 1){
                    presentismo = true;
                }
                
                Administrativo admin = new Administrativo(presentismo, legajo, nombre, sueldoBasico);
                listaEmpleado.add(admin);
            }
            
            if(opcion == 3){
                System.out.println("Ingrese el legajo del empleado: ");
                int legajo = sc.nextInt();
                System.out.println("Ingrese el nombre del empleado: ");
                sc.nextLine();
                String nombre = sc.nextLine();
                System.out.println("Ingrese el sueldo basico: ");
                float sueldoBasico = sc.nextFloat();
                System.out.println("Ingrese el total de sus ventas: ");
                float totalVentas = sc.nextFloat();
                
                Vendedor vendedor = new Vendedor(totalVentas, legajo, nombre, sueldoBasico);
                listaEmpleado.add(vendedor);
            }
            
            if(opcion == 0){
                break;
            }
        }
        
        for (int i = 0; i < listaEmpleado.size(); i++) {
            System.out.println(listaEmpleado.get(i).toString());
            if(listaEmpleado is obrero){
            
            }
        }
    }

}
