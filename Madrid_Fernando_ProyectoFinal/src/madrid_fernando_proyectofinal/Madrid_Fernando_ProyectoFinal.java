package madrid_fernando_proyectofinal;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Madrid_Fernando_ProyectoFinal {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Variables
        boolean salirVentas = false;
        double caja = 0, adicionCaja, cantidadAzucar = 0, cantidadAvena = 0, cantidadTrigo = 0, cantidadMaiz = 0,
               inventarioAzucar = 1, inventarioAvena = 1, inventarioTrigo = 1, inventarioMaiz = 1;
        int opcion = 0, codigo, idFacturacion = 0;
        String tipoCliente, seguirComprando;
        
        while(opcion != 6) {
            System.out.println("===============================");
            System.out.println("       Supercito Morfly");
            System.out.println("===============================");
            System.out.println("");
            System.out.println(String.format("Efectivo en Caja: L.%.2f", caja));
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
                entrada.nextLine();
                
                switch(opcion) {
                    case 1: // Seccion Abrir Caja
                        System.out.println("\n===============================");
                        System.out.println("  Supercito Morfly | Caja");
                        System.out.println("===============================");
                        System.out.println("");
                        System.out.print("Ingrese la cantidad que desea adicionar: ");
                        adicionCaja = entrada.nextDouble();
                        caja += adicionCaja;
                        System.out.println("");
                        System.out.println("Efectivo Adicionado Exitosamente");
                        System.out.println(String.format("Cantidad Adicionada: L.%.2f",adicionCaja));
                        System.out.println("");
                        break; 
                    case 2: // Seccion de Ventas
                        
                        if(inventarioAzucar > 0 && inventarioAvena > 0 && inventarioTrigo > 0 && inventarioMaiz > 0){
                            while(!salirVentas) {
                                System.out.println("\n===============================");
                                System.out.println("  Supercito Morfly | Ventas");
                                System.out.println("===============================");
                                System.out.println("");
                                System.out.print("Ingrese el tipo de cliente: ");
                                tipoCliente = entrada.next().toUpperCase().strip();

                                if(tipoCliente.equalsIgnoreCase("A") || tipoCliente.equalsIgnoreCase("B") || tipoCliente.equalsIgnoreCase("C")){

                                    do{
                                        System.out.println("\n=================================");
                                        System.out.println("   Supercito Morfly | Ventas");
                                        System.out.println("=================================");
                                        System.out.println("");
                                        System.out.println("Codigo     Producto      Precio");
                                        System.out.println("  1         Azucar      Lps.30.00");
                                        System.out.println("  2         Avena       Lps.25.00");
                                        System.out.println("  3         Trigo       Lps.32.00");
                                        System.out.println("  4         Maiz        Lps.20.00");
                                        System.out.println("");
                                        System.out.print("Ingrese el codigo del producto que vendera: ");
                                        codigo = entrada.nextInt();

                                        switch(codigo){
                                            case 1:
                                                System.out.println("\n===============================");
                                                System.out.println("  Supercito Morfly | Ventas");
                                                System.out.println("===============================");
                                                System.out.println("");
                                                System.out.println("Tipo de Cliente: "+tipoCliente);
                                                System.out.println("Producto Seleccionado: Azucar");
                                                System.out.println("");

                                                if(tipoCliente.equalsIgnoreCase("A") || tipoCliente.equalsIgnoreCase("B")){
                                                    while(true){
                                                        try{
                                                            System.out.print("Ingrese la cantidad en kilogramos: ");
                                                            cantidadAzucar = entrada.nextDouble();
                                                            
                                                            if(cantidadAzucar > 0) {
                                                                if(inventarioAzucar >= cantidadAzucar){
                                                                    break;
                                                                }else{
                                                                    System.out.println("\nNo disponemos esa cantidad de Azucar");
                                                                    System.out.println("Cantidad Disponible: "+inventarioAzucar+("kg\n"));
                                                                } 
                                                            }else{
                                                                System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n"); 
                                                            } 
                                                        }catch(InputMismatchException e){
                                                            System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                                            entrada.nextLine();
                                                        }
                                                    }
                                                    break;
                                                }
                                            default:
                                                System.out.println("\n*** Este codigo de producto no existe ***\n");
                                                break;
                                        }
                                        System.out.println("\nDesea agregar algo mas?");
                                        seguirComprando = entrada.next().toUpperCase().strip();

                                        // Proceso de facturacion
                                        if(seguirComprando.equalsIgnoreCase("No")){
                                            idFacturacion += 1;
                                            System.out.println("=======================================================");
                                            System.out.println("            Supercito Morfly | Facturacion");
                                            System.out.println("=======================================================");
                                            System.out.println("");
                                            System.out.println("ID Factura: "+idFacturacion);
                                            System.out.println("Tipo de Cliente: "+tipoCliente);
                                            System.out.println("");
                                            System.out.println("Codigo     Nombre      Cantidad     Precio     Total");

                                            if(cantidadAzucar > 0){
                                                System.out.println("  1        Azucar      "+cantidadAzucar+"kg        Lps.25.00  Lps.100");
                                            }
                                            salirVentas = true; // Poner fin ciclo de Ventas
                                        }
                                    }while(seguirComprando.equalsIgnoreCase("Si")); // Fin del Do While luego de facturacion

                                }else{
                                    System.out.println("\n*** Este tipo de cliente no existe ***");
                                }
                            }
                            break;
                        }else{
                            System.out.println("\n*** No dispones de suficientes productos ***\n");
                            break;
                        }
                    case 3: // Compras
                        break;
                    case 4: // Reportes
                        break;
                    case 5: // Cierre de Caja
                        break;
                    case 6: // Salir del Sistema
                        break;  
                    default: // Opcion Invalida
                        System.out.println("\n*** Opcion Ingresada Invalida ***\n");
                        break;
                }
            }catch(InputMismatchException e) {
                System.out.println("\n*** Formato Ingresado Invalido ***\n");
                entrada.nextLine();
            }
        }   
    }
}
