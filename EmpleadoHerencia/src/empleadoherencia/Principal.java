package empleadoherencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresa empresa = new Empresa();

        int opcion = -1;
        while (opcion != 0) {
            Empleado nuevoEmpleado = null;

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
                
                nuevoEmpleado = new Obrero(diasTrabajados, legajo, nombre, sueldoBasico);
         
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
                
                nuevoEmpleado = new Administrativo(presentismo, legajo, nombre, sueldoBasico);
                
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
                
                nuevoEmpleado = new Vendedor(totalVentas, legajo, nombre, sueldoBasico);
                
            }
            
            if(opcion == 0){
                break;
            }
            
            empresa.agregarEmpleado(nuevoEmpleado);
        }
        
        System.out.println("Ingrese el tipo de empleado del que quiere saber el sueldo: ");
        int opcionTipo = sc.nextInt();
        System.out.println(empresa.tipoSueldo(opcionTipo));
        System.out.println("El total general es de: " + empresa.sueldoTotal());
        System.out.println("Datos del empleado que menos cobra : \n"
                + empresa.empleadoMenosPago());
        System.out.println("Promedio de sueldo de los obreros: " + empresa.promedioSueldoObrero());
    }
}
