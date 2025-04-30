package madrid_fernando_proyectofinal;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Madrid_Fernando_ProyectoFinal {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        
        // Variables
        boolean salirVentas;
        double caja = 0, adicion_caja, cantidad_azucar = 0, cantidad_avena = 0, cantidad_trigo = 0, cantidad_maiz = 0;
        int opcion = 0, codigo, id_facturacion = 0;
        String tipo_cliente = "", seguir_comprando = "";
        
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
                        System.out.println("===============================");
                        System.out.println("  Supercito Morfly | Caja");
                        System.out.println("===============================");
                        System.out.println("");
                        System.out.print("Ingrese la cantidad que desea adicionar: ");
                        adicion_caja = entrada.nextDouble();
                        caja += adicion_caja;
                        System.out.println("");
                        System.out.println("**** Efectivo Adicionado Exitosamente ****");
                        System.out.println("");
                        break;
                    case 2: // Seccion de Ventas
                        
                        salirVentas = false;
                        while(!salirVentas) {
                            System.out.println("\n===============================");
                            System.out.println("  Supercito Morfly | Ventas");
                            System.out.println("===============================");
                            System.out.println("");
                            System.out.print("Ingrese el tipo de cliente: ");
                            tipo_cliente = entrada.next().toUpperCase().strip();
                            
                            if(tipo_cliente.equalsIgnoreCase("A") || tipo_cliente.equalsIgnoreCase("B") || tipo_cliente.equalsIgnoreCase("C")){
                                
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
                                            System.out.println("Tipo de Cliente: "+tipo_cliente);
                                            System.out.println("Producto Seleccionado: Azucar");
                                            System.out.println("");
                                            
                                            if(tipo_cliente.equalsIgnoreCase("A") || tipo_cliente.equalsIgnoreCase("B")){
                                                System.out.print("Ingrese la cantidad en kilogramos: ");
                                                cantidad_azucar = entrada.nextDouble();
                                                break;
                                            }
                                        default:
                                            System.out.println("");
                                            System.out.println("*** Este codigo de producto no existe ***");
                                            System.out.println("");
                                            break;
                                    }
                                    System.out.print("\nDesea comprar algo mas?");
                                    seguir_comprando = entrada.next().toUpperCase().strip();
                                    
                                    // Proceso de facturacion
                                    if(seguir_comprando.equalsIgnoreCase("No")){
                                        id_facturacion += 1;
                                        System.out.println("=======================================================");
                                        System.out.println("            Supercito Morfly | Facturacion");
                                        System.out.println("=======================================================");
                                        System.out.println("");
                                        System.out.println("ID Factura: "+id_facturacion);
                                        System.out.println("");
                                        System.out.println("Codigo     Nombre      Cantidad     Precio     Total");
                                        
                                        if(cantidad_azucar > 0){
                                            System.out.println("  1        Azucar      "+cantidad_azucar+"kg        Lps.25.00  Lps.100");
                                        }
                                        salirVentas = true;
                                    }
                                }while(seguir_comprando.equalsIgnoreCase("Si"));
                                
                            }else{
                                System.out.println("");
                                System.out.println("*** Este tipo de cliente no existe ***");
                            }
                        }
                        break;
                    case 3: // Compras
                        break;
                    case 4: // Reportes
                        break;
                    case 5: // Cierre de Caja
                        break;
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
