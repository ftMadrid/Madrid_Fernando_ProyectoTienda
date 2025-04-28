package madrid_fernando_proyectofinal;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Madrid_Fernando_ProyectoFinal {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int opcion = 0;
        
        while(opcion != 6) {
            System.out.println("===============================");
            System.out.println("Supercito Morfly");
            System.out.println("===============================");
            System.out.println("");
            System.out.println("1. Abrir Caja");
            System.out.println("2. Ventas");
            System.out.println("3. Compras");
            System.out.println("4. Reportes");
            System.out.println("5. Cierre de Caja");
            System.out.println("6. Salir del Sistema");
            System.out.println("");
            System.out.print("Elige una opcion: ");
            
            try{
                opcion = entrada.nextInt();
                
                switch(opcion) {
                    
                    case 1: // Abrir Caja
                    case 2: // Ventas
                    case 3: // Compras
                    case 4: // Reportes
                    case 5: // Cierre de Caja
                    case 6: // Salir del Sistema
                        break;  
                    default: // Opcion Invalida
                        System.out.println("");
                        System.out.println("**** Opcion Ingresada Invalida ****");
                        System.out.println("");
                        break;
                }
            }catch(InputMismatchException e) {
                System.out.println("");
                System.out.println("**** Formato Ingresado Invalido ****");
                System.out.println("");
                entrada.nextLine();
            }
        }   
    }
}
