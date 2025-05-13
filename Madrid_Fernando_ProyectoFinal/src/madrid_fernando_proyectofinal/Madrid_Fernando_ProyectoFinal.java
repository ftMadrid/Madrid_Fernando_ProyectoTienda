package madrid_fernando_proyectofinal;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Madrid_Fernando_ProyectoFinal {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        
        // Variables
        boolean abrirCaja = false, salirVentas;
        double caja = 0, adicionCaja = 0,
               cantidadAzucar = 0, cantidadAvena = 0, cantidadTrigo = 0, cantidadMaiz = 0, 
               totalCantidadAzucar = 0, totalCantidadAvena = 0, totalCantidadTrigo = 0, totalCantidadMaiz = 0, 
               ventaAzucar = 0, ventaAvena = 0, ventaTrigo = 0, ventaMaiz = 0,
               compraAzucar = 0, compraAvena = 0, compraTrigo = 0, compraMaiz = 0,
               descuentoAplicadoVentas = 0, impuestoVentas, totalVentas,
               subtotalVentas,
               inventarioAzucar = 0, inventarioAvena = 0, inventarioTrigo = 0, inventarioMaiz = 0;
        
        int opcion = 0, codigo, idFacturacion = 0, descuentoVentas;
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
                
                switch(opcion) {
                    case 1: // Seccion Abrir Caja
                        System.out.println("\n===============================");
                        System.out.println("  Supercito Morfly | Caja");
                        System.out.println("===============================");
                        System.out.println("");
                        if(!abrirCaja){
                            while(true){
                                System.out.print("Ingrese la cantidad que desea adicionar: ");
                                
                                try{
                                    adicionCaja = entrada.nextDouble();

                                    if(adicionCaja > 0) {
                                        caja += adicionCaja;
                                        abrirCaja = true;
                                        System.out.println("");
                                        System.out.println("Efectivo Adicionado Exitosamente");
                                        System.out.println(String.format("Cantidad Adicionada: L.%.2f",adicionCaja));
                                        System.out.println("");
                                        System.out.println("Se ha abierto caja!\n");
                                        break;
                                    }else{
                                        System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n");
                                    }
                                }catch(InputMismatchException e){
                                    System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                    entrada.nextLine();
                                }
                            }
                        }else{
                            while (true){
                                System.out.print("Ingrese la cantidad que desea adicionar: ");
                                
                                try{
                                    adicionCaja = entrada.nextDouble();

                                    if(adicionCaja > 0) {
                                        caja += adicionCaja;
                                        abrirCaja = true;
                                        System.out.println("");
                                        System.out.println("Efectivo Adicionado Exitosamente");
                                        System.out.println(String.format("Cantidad Adicionada: L.%.2f",adicionCaja));
                                        System.out.println("");
                                        break;
                                    }else{
                                        System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n");
                                    }
                                }catch(InputMismatchException e){
                                    System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                    entrada.nextLine();
                                }
                            }
                        }
                        break;
                    case 2: // Seccion de Ventas
                        if(abrirCaja){
                            if(inventarioAzucar > 0 || inventarioAvena > 0 || inventarioTrigo > 0 || inventarioMaiz > 0){
                                salirVentas = false;
                                while(!salirVentas) {
                                    System.out.println("\n===============================");
                                    System.out.println("  Supercito Morfly | Ventas");
                                    System.out.println("===============================");
                                    System.out.println("");
                                    System.out.print("Ingrese el tipo de cliente (A, B, C): ");
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
                                            System.out.println("=================================");
                                            System.out.println("  5     Salir de Ventas");
                                            System.out.println("=================================");
                                            System.out.println("");
                                            System.out.print("Ingrese el codigo del producto que vendera: ");
                                            codigo = entrada.nextInt();

                                            switch(codigo){
                                                case 1:
                                                    if(tipoCliente.equalsIgnoreCase("A") || tipoCliente.equalsIgnoreCase("B")){
                                                        if(inventarioAzucar > 0) {
                                                            System.out.println("\n===============================");
                                                            System.out.println("  Supercito Morfly | Ventas");
                                                            System.out.println("===============================");
                                                            System.out.println("");
                                                            System.out.println("Tipo de Cliente: "+tipoCliente);
                                                            System.out.println("Producto Seleccionado: Azucar");
                                                            System.out.println(String.format("Disponibles: %.1fkg",inventarioAzucar));
                                                            System.out.println("");

                                                            while(true){
                                                                try{
                                                                    System.out.print("Ingrese la cantidad en kilogramos: ");
                                                                    cantidadAzucar = entrada.nextDouble();

                                                                    if(cantidadAzucar > 0) {
                                                                        if(inventarioAzucar >= cantidadAzucar){
                                                                            inventarioAzucar -= cantidadAzucar;
                                                                            totalCantidadAzucar += cantidadAzucar;
                                                                            ventaAzucar = totalCantidadAzucar*30;
                                                                            break;
                                                                        }else{
                                                                            System.out.println("\n*** No hay suficiente cantidad de Azucar ***\n");
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
                                                        }else{
                                                            System.out.println("\n*** No hay suficiente cantidad de Azucar ***");
                                                            break;
                                                        }
                                                    }else{
                                                        System.out.println("\n*** Este tipo de cliente no puede comprar este producto ***\n");
                                                        salirVentas = true;
                                                        break;
                                                    }
                                                case 2:
                                                    if(tipoCliente.equalsIgnoreCase("A") || tipoCliente.equalsIgnoreCase("B")){
                                                        if(inventarioAvena > 0) {
                                                            System.out.println("\n===============================");
                                                            System.out.println("  Supercito Morfly | Ventas");
                                                            System.out.println("===============================");
                                                            System.out.println("");
                                                            System.out.println("Tipo de Cliente: "+tipoCliente);
                                                            System.out.println("Producto Seleccionado: Avena");
                                                            System.out.println(String.format("Disponibles: %.1fkg",inventarioAvena));
                                                            System.out.println("");

                                                            while(true){
                                                                try{
                                                                    System.out.print("Ingrese la cantidad en kilogramos: ");
                                                                    cantidadAvena = entrada.nextDouble();

                                                                    if(cantidadAvena > 0) {
                                                                        if(inventarioAvena >= cantidadAvena){
                                                                            inventarioAvena -= cantidadAvena;
                                                                            totalCantidadAvena += cantidadAvena;
                                                                            ventaAvena = totalCantidadAvena*30;
                                                                            break;
                                                                        }else{
                                                                            System.out.println("\n*** No hay suficiente cantidad de Avena ***\n");
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
                                                        }else{
                                                            System.out.println("\n*** No hay suficiente cantidad de Avena ***");
                                                            break;
                                                        }
                                                    }else{
                                                        System.out.println("\n*** Este tipo de cliente no puede comprar este producto ***\n");
                                                        salirVentas = true;
                                                        break;
                                                    }
                                                case 3:
                                                    if(tipoCliente.equalsIgnoreCase("A") || tipoCliente.equalsIgnoreCase("B")){
                                                        if(inventarioTrigo > 0) {
                                                            System.out.println("\n===============================");
                                                            System.out.println("  Supercito Morfly | Ventas");
                                                            System.out.println("===============================");
                                                            System.out.println("");
                                                            System.out.println("Tipo de Cliente: "+tipoCliente);
                                                            System.out.println("Producto Seleccionado: Trigo");
                                                            System.out.println(String.format("Disponibles: %.1fkg",inventarioTrigo));
                                                            System.out.println("");

                                                            while(true){
                                                                try{
                                                                    System.out.print("Ingrese la cantidad en kilogramos: ");
                                                                    cantidadTrigo = entrada.nextDouble();

                                                                    if(cantidadTrigo > 0) {
                                                                        if(inventarioTrigo >= cantidadTrigo){
                                                                            inventarioTrigo -= cantidadTrigo;
                                                                            totalCantidadTrigo += cantidadTrigo;
                                                                            ventaTrigo = totalCantidadTrigo*30;
                                                                            break;
                                                                        }else{
                                                                            System.out.println("\n*** No hay suficiente cantidad de Trigo ***\n");
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
                                                        }else{
                                                            System.out.println("\n*** No hay suficiente cantidad de Trigo ***");
                                                            break;
                                                        }
                                                    }else{
                                                        System.out.println("\n*** Este tipo de cliente no puede comprar este producto ***\n");
                                                        salirVentas = true;
                                                        break;
                                                    }
                                                case 4:
                                                    if(tipoCliente.equalsIgnoreCase("A") || tipoCliente.equalsIgnoreCase("C")){
                                                        if(inventarioMaiz > 0) {
                                                            System.out.println("\n===============================");
                                                            System.out.println("  Supercito Morfly | Ventas");
                                                            System.out.println("===============================");
                                                            System.out.println("");
                                                            System.out.println("Tipo de Cliente: "+tipoCliente);
                                                            System.out.println("Producto Seleccionado: Maiz");
                                                            System.out.println(String.format("Disponibles: %.1fkg",inventarioMaiz));
                                                            System.out.println("");

                                                            while(true){
                                                                try{
                                                                    System.out.print("Ingrese la cantidad en kilogramos: ");
                                                                    cantidadMaiz = entrada.nextDouble();

                                                                    if(cantidadMaiz > 0) {
                                                                        if(inventarioMaiz >= cantidadMaiz){
                                                                            inventarioMaiz -= cantidadMaiz;
                                                                            totalCantidadMaiz += cantidadMaiz;
                                                                            ventaMaiz = totalCantidadMaiz*30;
                                                                            break;
                                                                        }else{
                                                                            System.out.println("\n*** No hay suficiente cantidad de Maiz ***\n");
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
                                                        }else{
                                                            System.out.println("\n*** No hay suficiente cantidad de Maiz ***");
                                                            break;
                                                        }
                                                    }else{
                                                        System.out.println("\n*** Este tipo de cliente no puede comprar este producto ***\n");
                                                        salirVentas = true;
                                                        break;
                                                    }
                                                case 5:
                                                    if(cantidadAzucar > 0 || cantidadAvena > 0 || cantidadTrigo > 0 || cantidadMaiz > 0){
                                                        inventarioAzucar += cantidadAzucar;
                                                        inventarioAvena += cantidadAvena;
                                                        inventarioTrigo += cantidadTrigo;
                                                        inventarioMaiz += cantidadMaiz;
                                                        cantidadAzucar = 0; cantidadAvena = 0; cantidadTrigo = 0; cantidadMaiz = 0;
                                                        System.out.println("\n*** Has salido de Ventas ***\n");
                                                        salirVentas = true;
                                                        break;
                                                    }else{
                                                        salirVentas = true;
                                                        break;
                                                    }
                                                default:
                                                    System.out.println("\n*** Este codigo de producto no existe ***");
                                                    break;
                                            }

                                            if(salirVentas){
                                                break;
                                            }

                                            System.out.println("\nDesea agregar algo mas? (Si/No)");
                                            seguirComprando = entrada.next();

                                            // Proceso de facturacion
                                            if(seguirComprando.equalsIgnoreCase("No")){
                                                if(cantidadAzucar > 0 || cantidadAvena > 0 || cantidadTrigo > 0 || cantidadMaiz > 0){
                                                    idFacturacion += 1;
                                                    System.out.println("==========================================================");
                                                    System.out.println("             Supercito Morfly | Facturacion");
                                                    System.out.println("==========================================================");
                                                    System.out.println("");
                                                    System.out.println("ID Factura: "+idFacturacion);
                                                    System.out.println("Tipo de Cliente: "+tipoCliente);
                                                    System.out.println("");
                                                    System.out.println("Codigo     Nombre      Cantidad     Precio     Total");

                                                    if(cantidadAzucar > 0){
                                                        System.out.println(String.format("  1        Azucar        %.1fkg      Lps.30.00  Lps.%.2f",totalCantidadAzucar,ventaAzucar));
                                                        cantidadAzucar = 0;
                                                        totalCantidadAzucar = 0;
                                                    }
                                                    if(cantidadAvena > 0){
                                                        System.out.println(String.format("  2        Avena         %.1fkg      Lps.25.00  Lps.%.2f",totalCantidadAvena,ventaAvena));
                                                        cantidadAvena = 0;
                                                        totalCantidadAvena = 0;
                                                    }
                                                    if(cantidadTrigo > 0){
                                                        System.out.println(String.format("  3        Trigo         %.1fkg      Lps.32.00  Lps.%.2f",totalCantidadTrigo,ventaTrigo));
                                                        cantidadTrigo = 0;
                                                        totalCantidadTrigo = 0;
                                                    }
                                                    if(cantidadMaiz > 0){
                                                        System.out.println(String.format("  2        Maiz          %.1fkg      Lps.20.00  Lps.%.2f",totalCantidadMaiz,ventaMaiz));
                                                        cantidadMaiz = 0;
                                                        totalCantidadMaiz = 0;
                                                    }
                                                    subtotalVentas = ventaAzucar+ventaAvena+ventaTrigo+ventaMaiz;
                                                    ventaAzucar = 0; ventaAvena = 0; ventaTrigo = 0; ventaMaiz = 0;
                                                    if(subtotalVentas >= 1000){
                                                        descuentoVentas = 5;
                                                        descuentoAplicadoVentas = subtotalVentas*(descuentoVentas/100.0);
                                                    }else if(subtotalVentas > 5000){
                                                        descuentoVentas = 10;
                                                        descuentoAplicadoVentas = subtotalVentas*(descuentoVentas/100.0);
                                                    }else{
                                                        descuentoVentas = 0;
                                                    }
                                                    subtotalVentas += descuentoAplicadoVentas;
                                                    impuestoVentas = subtotalVentas*0.07;
                                                    totalVentas = subtotalVentas+impuestoVentas;
                                                    System.out.println(String.format("\nDescuento %d%%: L.%.2f",descuentoVentas,descuentoAplicadoVentas));
                                                    System.out.println(String.format("SubTotal: L.%.2f",subtotalVentas));
                                                    System.out.println(String.format("Impuesto 7%%: L.%.2f",impuestoVentas));
                                                    System.out.println(String.format("Total: L.%.2f",totalVentas));
                                                    System.out.println("==========================================================\n");
                                                    caja += totalVentas;
                                                    salirVentas = true; // Poner fin ciclo de Ventas
                                                }else{
                                                    salirVentas = true; // Para salir del ciclo de ventas sin mostrar factura si no compro productos
                                                }
                                            }
                                        }while(!seguirComprando.equalsIgnoreCase("No")); // Fin del Do While luego de facturacion

                                    }else{
                                        System.out.println("\n*** Este tipo de cliente no existe ***");
                                    }
                                }
                                break;
                            }else{
                                System.out.println("\nNo dispones de suficientes productos");
                                break;
                            }
                        }else{
                            System.out.println("\n            **    ERROR    **");
                            System.out.println("No puedes ingresar porque no has abierto caja.\n");
                            break;
                        }
                    case 3: // Compras
                        if(abrirCaja){
                                salirVentas = false;
                                while(!salirVentas) {
                                    System.out.println("\n===============================");
                                    System.out.println("  Supercito Morfly | Compras");
                                    System.out.println("===============================");
                                    System.out.println("");
                                    System.out.print("Ingrese el tipo de proveedor (A, B, C): ");
                                    tipoCliente = entrada.next().toUpperCase().strip();

                                    if(tipoCliente.equalsIgnoreCase("A") || tipoCliente.equalsIgnoreCase("B") || tipoCliente.equalsIgnoreCase("C")){

                                            System.out.println("\n=================================");
                                            System.out.println("   Supercito Morfly | Compras");
                                            System.out.println("=================================");
                                            System.out.println("");
                                            System.out.println("Codigo     Producto      Precio");
                                            System.out.println("  1         Azucar      Lps.25.00");
                                            System.out.println("  2         Avena       (B) Lps.25.00 - (C) Lps.22.00");
                                            System.out.println("  3         Trigo       Lps.30.00");
                                            System.out.println("  4         Maiz        Lps.18.00");
                                            System.out.println("=================================");
                                            System.out.println("  5     Salir de Compras");
                                            System.out.println("=================================");
                                            System.out.println("");
                                            System.out.print("Ingrese el codigo del producto que comprara: ");
                                            codigo = entrada.nextInt();

                                            switch(codigo){
                                                case 1:
                                                    if(tipoCliente.equalsIgnoreCase("A")){
                                                        System.out.println("\n===============================");
                                                        System.out.println("  Supercito Morfly | Compras");
                                                        System.out.println("===============================");
                                                        System.out.println("");
                                                        System.out.println("Tipo de Proveedor: "+tipoCliente);
                                                        System.out.println("Producto Seleccionado: Azucar");
                                                        System.out.println(String.format("Inventario: %.1fkg",inventarioAzucar));
                                                        System.out.println("");

                                                        while(true){
                                                            try{
                                                                System.out.print("Ingrese la cantidad en kilogramos: ");
                                                                cantidadAzucar = entrada.nextDouble();

                                                                if(cantidadAzucar > 0) {
                                                                    inventarioAzucar += cantidadAzucar;
                                                                    totalCantidadAzucar += cantidadAzucar;
                                                                    ventaAzucar = totalCantidadAzucar*25;
                                                                    break;
                                                                }else{
                                                                    System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n"); 
                                                                } 
                                                            }catch(InputMismatchException e){
                                                                System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                                                entrada.nextLine();
                                                            }
                                                        }
                                                        break;
                                                    }else{
                                                        System.out.println("\n*** Este tipo de proveedor no vende este producto ***\n");
                                                        salirVentas = true;
                                                        break;
                                                    }
                                                case 2:
                                                    if(tipoCliente.equalsIgnoreCase("B") || tipoCliente.equalsIgnoreCase("C")){
                                                        System.out.println("\n===============================");
                                                        System.out.println("  Supercito Morfly | Compras");
                                                        System.out.println("===============================");
                                                        System.out.println("");
                                                        System.out.println("Tipo de Proveedor: "+tipoCliente);
                                                        System.out.println("Producto Seleccionado: Avena");
                                                        System.out.println(String.format("Inventario: %.1fkg",inventarioAvena));
                                                        System.out.println("");

                                                        while(true){
                                                            try{
                                                                System.out.print("Ingrese la cantidad en kilogramos: ");
                                                                cantidadAvena = entrada.nextDouble();

                                                                if(cantidadAvena > 0) {
                                                                    inventarioAvena += cantidadAvena;
                                                                    totalCantidadAvena += cantidadAvena;
                                                                    ventaAvena = (tipoCliente.equalsIgnoreCase("B")) ? totalCantidadAvena*25 : totalCantidadAvena*22;
                                                                    break;
                                                                }else{
                                                                    System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n"); 
                                                                } 
                                                            }catch(InputMismatchException e){
                                                                System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                                                entrada.nextLine();
                                                            }
                                                        }
                                                        break;
                                                    }else{
                                                        System.out.println("\n*** Este tipo de proveedor no vende este producto ***\n");
                                                        salirVentas = true;
                                                        break;
                                                    }
                                                case 3:
                                                    if(tipoCliente.equalsIgnoreCase("B")){
                                                        System.out.println("\n===============================");
                                                        System.out.println("  Supercito Morfly | Compras");
                                                        System.out.println("===============================");
                                                        System.out.println("");
                                                        System.out.println("Tipo de Proveedor: "+tipoCliente);
                                                        System.out.println("Producto Seleccionado: Trigo");
                                                        System.out.println(String.format("Inventario: %.1fkg",inventarioTrigo));
                                                        System.out.println("");

                                                        while(true){
                                                            try{
                                                                System.out.print("Ingrese la cantidad en kilogramos: ");
                                                                cantidadTrigo = entrada.nextDouble();

                                                                if(cantidadTrigo > 0) {
                                                                    inventarioTrigo += cantidadTrigo;
                                                                    totalCantidadTrigo += cantidadTrigo;
                                                                    ventaTrigo = totalCantidadTrigo*30;
                                                                    break;
                                                                }else{
                                                                    System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n"); 
                                                                } 
                                                            }catch(InputMismatchException e){
                                                                System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                                                entrada.nextLine();
                                                            }
                                                        }
                                                        break;
                                                    }else{
                                                        System.out.println("\n*** Este tipo de proveedor no vende este producto ***\n");
                                                        salirVentas = true;
                                                        break;
                                                    }
                                                case 4:
                                                    if(tipoCliente.equalsIgnoreCase("A")){
                                                        System.out.println("\n===============================");
                                                        System.out.println("  Supercito Morfly | Compras");
                                                        System.out.println("===============================");
                                                        System.out.println("");
                                                        System.out.println("Tipo de Proveedor: "+tipoCliente);
                                                        System.out.println("Producto Seleccionado: Maiz");
                                                        System.out.println(String.format("Inventario: %.1fkg",inventarioMaiz));
                                                        System.out.println("");

                                                        while(true){
                                                            try{
                                                                System.out.print("Ingrese la cantidad en kilogramos: ");
                                                                cantidadMaiz = entrada.nextDouble();

                                                                if(cantidadMaiz > 0) {
                                                                    inventarioMaiz += cantidadMaiz;
                                                                    totalCantidadMaiz += cantidadMaiz;
                                                                    ventaMaiz = totalCantidadMaiz*18;
                                                                    break;
                                                                }else{
                                                                    System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n"); 
                                                                } 
                                                            }catch(InputMismatchException e){
                                                                System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                                                entrada.nextLine();
                                                            }
                                                        }
                                                        break;
                                                    }else{
                                                        System.out.println("\n*** Este tipo de proveedor no vende este producto ***\n");
                                                        salirVentas = true;
                                                        break;
                                                    }
                                                case 5:
                                                    System.out.println("\n*** Has salido de Compras ***\n");
                                                    salirVentas = true;
                                                    break;
                                                default:
                                                    System.out.println("\n*** Este codigo de producto no existe ***");
                                                    break;
                                            }

                                            if(salirVentas){
                                                break;
                                            }

                                            // Proceso de facturacion
                                            subtotalVentas = ventaAzucar+ventaAvena+ventaTrigo+ventaMaiz;
                                            if(subtotalVentas <= caja){
                                                if(cantidadAzucar > 0 || cantidadAvena > 0 || cantidadTrigo > 0 || cantidadMaiz > 0){
                                                    idFacturacion += 1;
                                                    System.out.println("==========================================================");
                                                    System.out.println("             Supercito Morfly | Facturacion");
                                                    System.out.println("==========================================================");
                                                    System.out.println("");
                                                    System.out.println("ID Factura: "+idFacturacion);
                                                    System.out.println("Tipo de Cliente: "+tipoCliente);
                                                    System.out.println("");
                                                    System.out.println("Codigo     Nombre      Cantidad     Precio     Total");

                                                    if(cantidadAzucar > 0){
                                                        System.out.println(String.format("  1        Azucar        %.1fkg      Lps.30.00  Lps.%.2f",totalCantidadAzucar,ventaAzucar));
                                                        cantidadAzucar = 0;
                                                        totalCantidadAzucar = 0;
                                                    }
                                                    if(cantidadAvena > 0){
                                                        if(tipoCliente.equalsIgnoreCase("B")){
                                                            System.out.println(String.format("  2        Avena         %.1fkg      Lps.25.00  Lps.%.2f",totalCantidadAvena,ventaAvena));
                                                        }else{
                                                            System.out.println(String.format("  2        Avena         %.1fkg      Lps.22.00  Lps.%.2f",totalCantidadAvena,ventaAvena));
                                                        }
                                                        cantidadAvena = 0;
                                                        totalCantidadAvena = 0;
                                                    }
                                                    if(cantidadTrigo > 0){
                                                        System.out.println(String.format("  3        Trigo         %.1fkg      Lps.32.00  Lps.%.2f",totalCantidadTrigo,ventaTrigo));
                                                        cantidadTrigo = 0;
                                                        totalCantidadTrigo = 0;
                                                    }
                                                    if(cantidadMaiz > 0){
                                                        System.out.println(String.format("  2        Maiz          %.1fkg      Lps.20.00  Lps.%.2f",totalCantidadMaiz,ventaMaiz));
                                                        cantidadMaiz = 0;
                                                        totalCantidadMaiz = 0;
                                                    }
                                                    ventaAzucar = 0; ventaAvena = 0; ventaTrigo = 0; ventaMaiz = 0;
                                                    totalVentas = subtotalVentas;
                                                    System.out.println(String.format("\nTotal: L.%.2f",totalVentas));
                                                    System.out.println("==========================================================\n");
                                                    caja -= totalVentas;
                                                    salirVentas = true; // Poner fin ciclo de Compras
                                                }else{
                                                    salirVentas = true; // Para salir del ciclo de compras sin mostrar factura si no compro productos
                                                }
                                            }else{
                                                System.out.println("\n*** Saldo Insuficiente para pagar esta compra ***\n");
                                                System.out.println(String.format("Saldo en Caja: Lps.%.2f",caja));
                                                System.out.println(String.format("Total de Compra: Lps.%.2f\n",subtotalVentas));
                                                inventarioAzucar -= cantidadAzucar; inventarioAvena -= cantidadAvena; inventarioTrigo -= cantidadTrigo; inventarioMaiz -= cantidadMaiz;
                                                cantidadAzucar = 0; cantidadAvena = 0; cantidadTrigo = 0; cantidadMaiz = 0;
                                                salirVentas = true;
                                            }
                                    }else{
                                        System.out.println("\n*** Este tipo de cliente no existe ***");
                                    }
                                }
                                break;
                        }else{
                            System.out.println("\n            **    ERROR    **");
                            System.out.println("No puedes ingresar porque no has abierto caja.\n");
                            break;
                        }
                    case 4: // Reportes
                        break;
                    case 5: // Cierre de Caja
                        break;
                    case 6: // Salir del Sistema
                        System.out.println("\nQue tenga lindo dia!\n");
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
