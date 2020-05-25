package fabrica_caños;

import java.util.Scanner;

public class Fabrica_Caños {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //pedimos al usuario que ingrese los parametros del Producto
        System.out.println("Ingrese la cantidad de materiales: ");
        int cantElementos = sc.nextInt();
        
        System.out.println("Ingrese la descripcion del producto: ");
        sc.nextLine();
        String descripcion = sc.nextLine();
        
        //creamos un Producto con los parametros ingresados
        Producto p = new Producto(descripcion, cantElementos);
        
        //dependiendo la cantElementos que ingreso el usuario creamos los materiales que componen al Producto
        for (int i = 0; i < cantElementos; i++) {
            
            System.out.println("Ingrese la descripcion del material: ");
            String descripcionMaterial = sc.nextLine();
            
            System.out.println("Ingrese un codigo: ");
            int codigo = sc.nextInt();
            
            System.out.println("Ingrese el valor unitario: ");
            float valorUnitario = sc.nextFloat();
            
            sc.nextLine();
            
            //creamos el Material con los parametros ingresados
            Material m = new Material(codigo, descripcionMaterial, valorUnitario);
            p.agregarMateriales(m); //usamos el metodo que existe en Producto para agregar materiales
        }
        
        int eleccion = 100;
        while(eleccion != 0){
            System.out.println("Bienvenido al menu.");
            System.out.println("Ingrese 1 para ver el costo total de los materiales.");
            System.out.println("Ingrese 2 para ver si algun material existe.");
            System.out.println("Ingrese 0 para salir.");
            System.out.println("Eliga su opcion: ");
            eleccion = sc.nextInt();
            
            if(eleccion == 1){
                System.out.println(p.CalculoTotal());
            }
            else if(eleccion == 2){
                System.out.println("Ingrese el codigo del material que desea buscar: ");
                int codigo = sc.nextInt();
                
                if(p.existeMaterial(codigo)){
                    System.out.println("El material existe.");
                }
                else{
                    System.out.println("El material no existe.");
                }    
            }
            
            if(eleccion == 0){
                break;
            }
        }
    }
    
}
