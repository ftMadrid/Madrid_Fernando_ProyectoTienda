package madrid_fernando_proyectotienda;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Madrid_Fernando_ProyectoTienda {

    public static void main(String[] args) throws InterruptedException {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        // Variables
        boolean abrirCaja = false, salirSeccion, cierreCaja = false, salirPrograma = false; // Booleanos generales
        double caja = 0, adicionCaja = 0, // Seccion de Abrir Caja

                // Variables para Seccion de Ventas y Compras 
                cantidadAzucar = 0, cantidadAvena = 0, cantidadTrigo = 0, cantidadMaiz = 0,
                totalCantidadAzucar = 0, totalCantidadAvena = 0, totalCantidadTrigo = 0, totalCantidadMaiz = 0,
                ventaAzucar = 0, ventaAvena = 0, ventaTrigo = 0, ventaMaiz = 0,
                descuentoAplicadoVentas = 0, impuestoVentas, totalVentas = 0, totalCompras = 0, subtotalVentas,
                inventarioAzucar = 0, inventarioAvena = 0, inventarioTrigo = 0, inventarioMaiz = 0,
                // Variables para Seccion de Reportes
                estrellaAzucar = 0, estrellaAvena = 0, estrellaTrigo = 0, estrellaMaiz = 0,
                margenVentas = 0, margenCompras = 0, promedioVentas = 0, promedioCompras = 0, ventaMayor = 0, compraMayor = 0, cantidadEstrella = 0,
                // Variables para Seccion Cierre de Caja
                limiteBanco = 0, guardarBanco = 0;

        // Variables para seccion de Ventas y Compras
        int opcion = 0, codigo = 0, idFacturacionVentas = 1, idFacturacionCompras = 1, descuentoVentas, cantidadVentas = 0, cantidadCompras = 0;

        // Strings generales
        String tipoCliente, seguirComprando, margenTotal = "", productoEstrella = "";

        while (!salirPrograma) {
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
            System.out.print("Elige el numero de opcion: ");

            try {
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1: // Seccion Abrir Caja
                        System.out.println("\n===============================");
                        System.out.println("  Supercito Morfly | Caja");
                        System.out.println("===============================\n");

                        // Chequeo sobre si la caja esta cerrada o no
                        if (!cierreCaja) {
                            if (!abrirCaja) { // Chequeo sobre si la caja esta abierta o no
                                while (true) {
                                    System.out.print("Ingrese la cantidad que desea adicionar: ");
                                    try {
                                        adicionCaja = entrada.nextDouble();
                                        if (adicionCaja > 0) {
                                            caja += adicionCaja;
                                            abrirCaja = true;
                                            System.out.println("\nEfectivo Adicionado Exitosamente");
                                            System.out.println(String.format("Cantidad Adicionada: L.%.2f\n", adicionCaja));
                                            System.out.println("** Se ha abierto caja **\n");
                                            Thread.sleep(1000);
                                            break;
                                        } else {
                                            System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n");
                                            Thread.sleep(500);
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                        Thread.sleep(500);
                                        entrada.nextLine();
                                    }
                                }
                            } else { // Proceso de la caja ya estando abierta
                                while (true) {
                                    System.out.print("Ingrese la cantidad que desea adicionar: ");
                                    try {
                                        adicionCaja = entrada.nextDouble();
                                        if (adicionCaja > 0) {
                                            caja += adicionCaja;
                                            abrirCaja = true;
                                            System.out.println("\nEfectivo Adicionado Exitosamente");
                                            System.out.println(String.format("Cantidad Adicionada: L.%.2f\n", adicionCaja));
                                            Thread.sleep(1000);
                                            break;
                                        } else {
                                            System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n");
                                            Thread.sleep(500);
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                        Thread.sleep(500);
                                        entrada.nextLine();
                                    }
                                }
                            }
                        } else { // Proceso de caja cuando se hace cierre de caja
                            if (!abrirCaja) {
                                System.out.println("** Se ha abierto caja **\n");

                                // Reseteo de toda estadistica para Reportes
                                margenTotal = "";
                                promedioVentas = 0;
                                promedioCompras = 0;
                                cantidadVentas = 0;
                                margenVentas = 0;
                                cantidadCompras = 0;
                                margenCompras = 0;
                                ventaMayor = 0;
                                compraMayor = 0;
                                productoEstrella = "";
                                cantidadEstrella = 0;
                                estrellaAzucar = 0;
                                estrellaAvena = 0;
                                estrellaTrigo = 0;
                                estrellaMaiz = 0;
                                cantidadAzucar = 0;
                                cantidadAvena = 0;
                                cantidadTrigo = 0;
                                cantidadMaiz = 0;
                                totalCantidadAzucar = 0;
                                totalCantidadAvena = 0;
                                totalCantidadTrigo = 0;
                                totalCantidadMaiz = 0;
                                ventaAzucar = 0;
                                ventaAvena = 0;
                                ventaTrigo = 0;
                                ventaMaiz = 0;

                                Thread.sleep(1000);
                                abrirCaja = true;
                                cierreCaja = false;
                                break;
                            } else {
                                System.out.println("** La caja ya se encuentra abierta **\n");
                                Thread.sleep(1000);
                                break;
                            }
                        }
                        break;
                    case 2: // Seccion de Ventas
                        if (abrirCaja) {
                            if (inventarioAzucar > 0 || inventarioAvena > 0 || inventarioTrigo > 0 || inventarioMaiz > 0) { // Chequeo de que si hay producto en el inventario
                                salirSeccion = false;
                                while (!salirSeccion) {
                                    System.out.println("\n===============================");
                                    System.out.println("  Supercito Morfly | Ventas");
                                    System.out.println("===============================");
                                    System.out.println("");
                                    System.out.print("Ingrese el tipo de cliente (A, B, C): ");
                                    tipoCliente = entrada.next().toUpperCase().strip();

                                    if (tipoCliente.equalsIgnoreCase("A") || tipoCliente.equalsIgnoreCase("B") || tipoCliente.equalsIgnoreCase("C")) { // Chequeo de que si el usuario ingreso correcto el tipo de cliente

                                        do {
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

                                            while (true) {
                                                try {
                                                    System.out.print("\nIngrese el codigo del producto que vendera: ");
                                                    codigo = entrada.nextInt();
                                                    break;
                                                } catch (InputMismatchException e) {
                                                    System.out.println("\n*** Formato Ingresado Invalido ***");
                                                    Thread.sleep(500);
                                                    entrada.nextLine();
                                                }
                                            }

                                            switch (codigo) {
                                                case 1:
                                                    if (tipoCliente.equalsIgnoreCase("A") || tipoCliente.equalsIgnoreCase("B")) {
                                                        if (inventarioAzucar > 0) {
                                                            System.out.println("\n===============================");
                                                            System.out.println("  Supercito Morfly | Ventas");
                                                            System.out.println("===============================");
                                                            System.out.println("");
                                                            System.out.println("Tipo de Cliente: " + tipoCliente);
                                                            System.out.println("Producto Seleccionado: Azucar");
                                                            System.out.println(String.format("Disponibles: %.1fkg", inventarioAzucar));
                                                            System.out.println("");

                                                            while (true) {
                                                                try {
                                                                    System.out.print("Ingrese la cantidad en kilogramos: ");
                                                                    cantidadAzucar = entrada.nextDouble();

                                                                    if (cantidadAzucar > 0) {
                                                                        if (inventarioAzucar >= cantidadAzucar) {
                                                                            
                                                                            // Calculos
                                                                            inventarioAzucar -= cantidadAzucar;
                                                                            totalCantidadAzucar += cantidadAzucar;
                                                                            ventaAzucar = totalCantidadAzucar * 30;
                                                                            estrellaAzucar += totalCantidadAzucar;
                                                                            break;
                                                                        } else {
                                                                            System.out.println("\n*** No hay suficiente cantidad de Azucar ***\n");
                                                                            Thread.sleep(500);
                                                                        }
                                                                    } else {
                                                                        System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n");
                                                                        Thread.sleep(500);
                                                                    }
                                                                } catch (InputMismatchException e) {
                                                                    System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                                                    Thread.sleep(500);
                                                                    entrada.nextLine();
                                                                }
                                                            }
                                                            break;
                                                        } else {
                                                            System.out.println("\n*** No hay suficiente cantidad de Azucar ***");
                                                            Thread.sleep(500);
                                                            break;
                                                        }
                                                    } else {
                                                        System.out.println("\n*** Este tipo de cliente no puede comprar este producto ***");
                                                        Thread.sleep(500);
                                                        break;
                                                    }
                                                case 2:
                                                    if (tipoCliente.equalsIgnoreCase("A") || tipoCliente.equalsIgnoreCase("B")) {
                                                        if (inventarioAvena > 0) {
                                                            System.out.println("\n===============================");
                                                            System.out.println("  Supercito Morfly | Ventas");
                                                            System.out.println("===============================");
                                                            System.out.println("");
                                                            System.out.println("Tipo de Cliente: " + tipoCliente);
                                                            System.out.println("Producto Seleccionado: Avena");
                                                            System.out.println(String.format("Disponibles: %.1fkg", inventarioAvena));
                                                            System.out.println("");

                                                            while (true) {
                                                                try {
                                                                    System.out.print("Ingrese la cantidad en kilogramos: ");
                                                                    cantidadAvena = entrada.nextDouble();

                                                                    if (cantidadAvena > 0) {
                                                                        if (inventarioAvena >= cantidadAvena) {
                                                                            inventarioAvena -= cantidadAvena;
                                                                            totalCantidadAvena += cantidadAvena;
                                                                            ventaAvena = totalCantidadAvena * 25;
                                                                            estrellaAvena += totalCantidadAvena;
                                                                            break;
                                                                        } else {
                                                                            System.out.println("\n*** No hay suficiente cantidad de Avena ***\n");
                                                                            Thread.sleep(500);
                                                                        }
                                                                    } else {
                                                                        System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n");
                                                                        Thread.sleep(500);
                                                                    }
                                                                } catch (InputMismatchException e) {
                                                                    System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                                                    Thread.sleep(500);
                                                                    entrada.nextLine();
                                                                }
                                                            }
                                                            break;
                                                        } else {
                                                            System.out.println("\n*** No hay suficiente cantidad de Avena ***");
                                                            Thread.sleep(500);
                                                            break;
                                                        }
                                                    } else {
                                                        System.out.println("\n*** Este tipo de cliente no puede comprar este producto ***");
                                                        Thread.sleep(500);
                                                        break;
                                                    }
                                                case 3:
                                                    if (tipoCliente.equalsIgnoreCase("A") || tipoCliente.equalsIgnoreCase("B")) {
                                                        if (inventarioTrigo > 0) {
                                                            System.out.println("\n===============================");
                                                            System.out.println("  Supercito Morfly | Ventas");
                                                            System.out.println("===============================");
                                                            System.out.println("");
                                                            System.out.println("Tipo de Cliente: " + tipoCliente);
                                                            System.out.println("Producto Seleccionado: Trigo");
                                                            System.out.println(String.format("Disponibles: %.1fkg", inventarioTrigo));
                                                            System.out.println("");

                                                            while (true) {
                                                                try {
                                                                    System.out.print("Ingrese la cantidad en kilogramos: ");
                                                                    cantidadTrigo = entrada.nextDouble();

                                                                    if (cantidadTrigo > 0) {
                                                                        if (inventarioTrigo >= cantidadTrigo) {
                                                                            inventarioTrigo -= cantidadTrigo;
                                                                            totalCantidadTrigo += cantidadTrigo;
                                                                            ventaTrigo = totalCantidadTrigo * 32;
                                                                            estrellaTrigo += totalCantidadTrigo;
                                                                            break;
                                                                        } else {
                                                                            System.out.println("\n*** No hay suficiente cantidad de Trigo ***\n");
                                                                            Thread.sleep(500);
                                                                        }
                                                                    } else {
                                                                        System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n");
                                                                        Thread.sleep(500);
                                                                    }
                                                                } catch (InputMismatchException e) {
                                                                    System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                                                    Thread.sleep(500);
                                                                    entrada.nextLine();
                                                                }
                                                            }
                                                            break;
                                                        } else {
                                                            System.out.println("\n*** No hay suficiente cantidad de Trigo ***");
                                                            Thread.sleep(500);
                                                            break;
                                                        }
                                                    } else {
                                                        System.out.println("\n*** Este tipo de cliente no puede comprar este producto ***");
                                                        Thread.sleep(500);
                                                        break;
                                                    }
                                                case 4:
                                                    if (tipoCliente.equalsIgnoreCase("A") || tipoCliente.equalsIgnoreCase("C")) {
                                                        if (inventarioMaiz > 0) {
                                                            System.out.println("\n===============================");
                                                            System.out.println("  Supercito Morfly | Ventas");
                                                            System.out.println("===============================");
                                                            System.out.println("");
                                                            System.out.println("Tipo de Cliente: " + tipoCliente);
                                                            System.out.println("Producto Seleccionado: Maiz");
                                                            System.out.println(String.format("Disponibles: %.1fkg", inventarioMaiz));
                                                            System.out.println("");

                                                            while (true) {
                                                                try {
                                                                    System.out.print("Ingrese la cantidad en kilogramos: ");
                                                                    cantidadMaiz = entrada.nextDouble();

                                                                    if (cantidadMaiz > 0) {
                                                                        if (inventarioMaiz >= cantidadMaiz) {
                                                                            inventarioMaiz -= cantidadMaiz;
                                                                            totalCantidadMaiz += cantidadMaiz;
                                                                            ventaMaiz = totalCantidadMaiz * 20;
                                                                            estrellaMaiz += totalCantidadMaiz;
                                                                            break;
                                                                        } else {
                                                                            System.out.println("\n*** No hay suficiente cantidad de Maiz ***\n");
                                                                            Thread.sleep(500);
                                                                        }
                                                                    } else {
                                                                        System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n");
                                                                        Thread.sleep(500);
                                                                    }
                                                                } catch (InputMismatchException e) {
                                                                    System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                                                    Thread.sleep(500);
                                                                    entrada.nextLine();
                                                                }
                                                            }
                                                            break;
                                                        } else {
                                                            System.out.println("\n*** No hay suficiente cantidad de Maiz ***");
                                                            Thread.sleep(500);
                                                            break;
                                                        }
                                                    } else {
                                                        System.out.println("\n*** Este tipo de cliente no puede comprar este producto ***");
                                                        Thread.sleep(500);
                                                        break;
                                                    }
                                                case 5:
                                                    if (cantidadAzucar > 0 || cantidadAvena > 0 || cantidadTrigo > 0 || cantidadMaiz > 0) {
                                                        inventarioAzucar += cantidadAzucar;
                                                        inventarioAvena += cantidadAvena;
                                                        inventarioTrigo += cantidadTrigo;
                                                        inventarioMaiz += cantidadMaiz;
                                                        estrellaAzucar -= totalCantidadAzucar;
                                                        estrellaAvena -= totalCantidadAvena;
                                                        estrellaTrigo -= totalCantidadTrigo;
                                                        estrellaMaiz -= totalCantidadMaiz;
                                                        cantidadAzucar = 0;
                                                        cantidadAvena = 0;
                                                        cantidadTrigo = 0;
                                                        cantidadMaiz = 0;
                                                        totalCantidadAzucar = 0;
                                                        totalCantidadAvena = 0;
                                                        totalCantidadTrigo = 0;
                                                        totalCantidadMaiz = 0;
                                                        System.out.println("\n*** Has salido de Ventas ***\n");
                                                        salirSeccion = true;
                                                        Thread.sleep(500);
                                                        break;
                                                    } else {
                                                        System.out.println("\n*** Has salido de Ventas ***\n");
                                                        Thread.sleep(500);
                                                        salirSeccion = true;
                                                        break;
                                                    }
                                                default:
                                                    System.out.println("\n*** Este codigo de producto no existe ***");
                                                    Thread.sleep(500);
                                                    break;
                                            }

                                            if (salirSeccion) { // Chequeo cuando se sale de ventas sin realizar ninguna venta
                                                break;
                                            }
                                            
                                            System.out.println("\nDesea agregar algo mas? (Si/No)");
                                            seguirComprando = entrada.next();

                                            // Proceso de facturacion
                                            if (seguirComprando.equalsIgnoreCase("No")) {
                                                if (cantidadAzucar > 0 || cantidadAvena > 0 || cantidadTrigo > 0 || cantidadMaiz > 0) {
                                                    System.out.println("\n==========================================================");
                                                    System.out.println("             Supercito Morfly | Facturacion");
                                                    System.out.println("==========================================================");
                                                    System.out.println("");
                                                    System.out.println("ID Factura: " + (idFacturacionVentas++));
                                                    System.out.println("Tipo de Cliente: " + tipoCliente);
                                                    System.out.println("");
                                                    System.out.println("Codigo     Nombre      Cantidad     Precio     Total");

                                                    if (cantidadAzucar > 0) {
                                                        System.out.println(String.format("  1        Azucar        %.1fkg      Lps.30.00  Lps.%.2f", totalCantidadAzucar, ventaAzucar));
                                                        cantidadAzucar = 0;
                                                        totalCantidadAzucar = 0;
                                                    }
                                                    if (cantidadAvena > 0) {
                                                        System.out.println(String.format("  2        Avena         %.1fkg      Lps.25.00  Lps.%.2f", totalCantidadAvena, ventaAvena));
                                                        cantidadAvena = 0;
                                                        totalCantidadAvena = 0;
                                                    }
                                                    if (cantidadTrigo > 0) {
                                                        System.out.println(String.format("  3        Trigo         %.1fkg      Lps.32.00  Lps.%.2f", totalCantidadTrigo, ventaTrigo));
                                                        cantidadTrigo = 0;
                                                        totalCantidadTrigo = 0;
                                                    }
                                                    if (cantidadMaiz > 0) {
                                                        System.out.println(String.format("  4        Maiz          %.1fkg      Lps.20.00  Lps.%.2f", totalCantidadMaiz, ventaMaiz));
                                                        cantidadMaiz = 0;
                                                        totalCantidadMaiz = 0;
                                                    }
                                                    subtotalVentas = ventaAzucar + ventaAvena + ventaTrigo + ventaMaiz;
                                                    ventaAzucar = 0;
                                                    ventaAvena = 0;
                                                    ventaTrigo = 0;
                                                    ventaMaiz = 0;
                                                    if (subtotalVentas >= 1000) {
                                                        descuentoVentas = 5;
                                                        descuentoAplicadoVentas = subtotalVentas * (descuentoVentas / 100.0);
                                                    } else if (subtotalVentas > 5000) {
                                                        descuentoVentas = 10;
                                                        descuentoAplicadoVentas = subtotalVentas * (descuentoVentas / 100.0);
                                                    } else {
                                                        descuentoVentas = 0;
                                                    }
                                                    subtotalVentas += descuentoAplicadoVentas;
                                                    impuestoVentas = subtotalVentas * 0.07;
                                                    totalVentas = subtotalVentas + impuestoVentas;
                                                    System.out.println(String.format("\nDescuento %d%%: L.%.2f", descuentoVentas, descuentoAplicadoVentas));
                                                    System.out.println(String.format("SubTotal: L.%.2f", subtotalVentas));
                                                    System.out.println(String.format("Impuesto 7%%: L.%.2f", impuestoVentas));
                                                    System.out.println(String.format("Total: L.%.2f", totalVentas));
                                                    System.out.println("==========================================================\n");
                                                    caja += totalVentas; // Agregar el total vendido a la caja
                                                    margenVentas += totalVentas; // Contador del margen de ventas para seccion de Reportes
                                                    cantidadVentas++; // Contador de ventas realizadas para seccion de Reportes
                                                    Thread.sleep(3000);

                                                    // Chequeo producto con mayor venta
                                                    if (totalVentas >= ventaMayor) {
                                                        ventaMayor = totalVentas;
                                                    }

                                                    // Chequeo producto estrella

                                                    cantidadEstrella = estrellaAzucar;
                                                    
                                                    if (estrellaAvena > cantidadEstrella) {
                                                        cantidadEstrella = estrellaAvena;
                                                    }
                                                    if (estrellaTrigo > cantidadEstrella) {
                                                        cantidadEstrella = estrellaTrigo;
                                                    }
                                                    if (estrellaMaiz > cantidadEstrella) {
                                                        cantidadEstrella = estrellaMaiz;
                                                    }

                                                    productoEstrella = "";

                                                    if (estrellaAzucar == cantidadEstrella) {
                                                        productoEstrella += "Azucar, ";
                                                    }
                                                    if (estrellaAvena == cantidadEstrella) {
                                                        productoEstrella += "Avena, ";
                                                    }
                                                    if (estrellaTrigo == cantidadEstrella) {
                                                        productoEstrella += "Trigo, ";
                                                    }
                                                    if (estrellaMaiz == cantidadEstrella) {
                                                        productoEstrella += "Maiz, ";
                                                    }

                                                    if (productoEstrella.endsWith(", ")) {
                                                        productoEstrella = productoEstrella.substring(0, productoEstrella.length() - 2);
                                                    }

                                                    salirSeccion = true; // Poner fin ciclo de Ventas
                                                } else {
                                                    salirSeccion = true; // Para salir del ciclo de ventas sin mostrar factura si no compro productos
                                                }
                                            }
                                        } while (!seguirComprando.equalsIgnoreCase("No")); // Fin del Do While luego de facturacion

                                    } else {
                                        System.out.println("\n*** Este tipo de cliente no existe ***");
                                        Thread.sleep(500);
                                    }
                                }
                                break;
                            } else {
                                System.out.println("\n*** No dispones de suficientes productos ***\n");
                                Thread.sleep(500);
                                break;
                            }
                        } else {
                            System.out.println("\n            **    ERROR    **");
                            System.out.println("No puedes ingresar porque no has abierto caja.\n");
                            Thread.sleep(500);
                            break;
                        }
                    case 3: // Compras
                        if (abrirCaja) {
                            salirSeccion = false;
                            while (!salirSeccion) {
                                System.out.println("\n===============================");
                                System.out.println("  Supercito Morfly | Compras");
                                System.out.println("===============================");
                                System.out.println("");
                                System.out.print("Ingrese el tipo de proveedor (A, B, C): ");
                                tipoCliente = entrada.next().toUpperCase().strip();

                                if (tipoCliente.equalsIgnoreCase("A") || tipoCliente.equalsIgnoreCase("B") || tipoCliente.equalsIgnoreCase("C")) {
                                    System.out.println("\n=================================");
                                    System.out.println("   Supercito Morfly | Compras");
                                    System.out.println("=================================");
                                    System.out.println("");
                                    System.out.println("Codigo     Producto      Precio");
                                    System.out.println("  1         Azucar      Lps.25.00");
                                    System.out.println("  2         Avena       (B) Lps.20.00 - (C) Lps.22.00");
                                    System.out.println("  3         Trigo       Lps.30.00");
                                    System.out.println("  4         Maiz        Lps.18.00");
                                    System.out.println("=================================");
                                    System.out.println("  5     Salir de Compras");
                                    System.out.println("=================================");

                                    while (true) {
                                        try {
                                            System.out.print("\nIngrese el codigo del producto que comprara: ");
                                            codigo = entrada.nextInt();

                                            switch (codigo) {
                                                case 1:
                                                    if (tipoCliente.equalsIgnoreCase("A")) {
                                                        System.out.println("\n===============================");
                                                        System.out.println("  Supercito Morfly | Compras");
                                                        System.out.println("===============================");
                                                        System.out.println("");
                                                        System.out.println("Tipo de Proveedor: " + tipoCliente);
                                                        System.out.println("Producto Seleccionado: Azucar");
                                                        System.out.println(String.format("Inventario: %.1fkg", inventarioAzucar));
                                                        System.out.println("");

                                                        while (true) {
                                                            try {
                                                                System.out.print("Ingrese la cantidad en kilogramos: ");
                                                                cantidadAzucar = entrada.nextDouble();

                                                                if (cantidadAzucar > 0) {
                                                                    inventarioAzucar += cantidadAzucar;
                                                                    totalCantidadAzucar += cantidadAzucar;
                                                                    ventaAzucar = totalCantidadAzucar * 25;
                                                                    break;
                                                                } else {
                                                                    System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n");
                                                                    Thread.sleep(500);
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                                                Thread.sleep(500);
                                                                entrada.nextLine();
                                                            }
                                                        }
                                                        break;
                                                    } else {
                                                        System.out.println("\n*** Este tipo de proveedor no vende este producto ***");
                                                        Thread.sleep(500);
                                                        continue;
                                                    }
                                                case 2:
                                                    if (tipoCliente.equalsIgnoreCase("B") || tipoCliente.equalsIgnoreCase("C")) {
                                                        System.out.println("\n===============================");
                                                        System.out.println("  Supercito Morfly | Compras");
                                                        System.out.println("===============================");
                                                        System.out.println("");
                                                        System.out.println("Tipo de Proveedor: " + tipoCliente);
                                                        System.out.println("Producto Seleccionado: Avena");
                                                        System.out.println(String.format("Inventario: %.1fkg", inventarioAvena));
                                                        System.out.println("");

                                                        while (true) {
                                                            try {
                                                                System.out.print("Ingrese la cantidad en kilogramos: ");
                                                                cantidadAvena = entrada.nextDouble();

                                                                if (cantidadAvena > 0) {
                                                                    inventarioAvena += cantidadAvena;
                                                                    totalCantidadAvena += cantidadAvena;
                                                                    ventaAvena = (tipoCliente.equalsIgnoreCase("B")) ? totalCantidadAvena * 20 : totalCantidadAvena * 22;
                                                                    break;
                                                                } else {
                                                                    System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n");
                                                                    Thread.sleep(500);
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                                                Thread.sleep(500);
                                                                entrada.nextLine();
                                                            }
                                                        }
                                                        break;
                                                    } else {
                                                        System.out.println("\n*** Este tipo de proveedor no vende este producto ***");
                                                        Thread.sleep(500);
                                                        break;
                                                    }
                                                case 3:
                                                    if (tipoCliente.equalsIgnoreCase("B")) {
                                                        System.out.println("\n===============================");
                                                        System.out.println("  Supercito Morfly | Compras");
                                                        System.out.println("===============================");
                                                        System.out.println("");
                                                        System.out.println("Tipo de Proveedor: " + tipoCliente);
                                                        System.out.println("Producto Seleccionado: Trigo");
                                                        System.out.println(String.format("Inventario: %.1fkg", inventarioTrigo));
                                                        System.out.println("");

                                                        while (true) {
                                                            try {
                                                                System.out.print("Ingrese la cantidad en kilogramos: ");
                                                                cantidadTrigo = entrada.nextDouble();

                                                                if (cantidadTrigo > 0) {
                                                                    inventarioTrigo += cantidadTrigo;
                                                                    totalCantidadTrigo += cantidadTrigo;
                                                                    ventaTrigo = totalCantidadTrigo * 30;
                                                                    break;
                                                                } else {
                                                                    System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n");
                                                                    Thread.sleep(500);
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                                                Thread.sleep(500);
                                                                entrada.nextLine();
                                                            }
                                                        }
                                                        break;
                                                    } else {
                                                        System.out.println("\n*** Este tipo de proveedor no vende este producto ***");
                                                        Thread.sleep(500);
                                                        break;
                                                    }
                                                case 4:
                                                    if (tipoCliente.equalsIgnoreCase("A")) {
                                                        System.out.println("\n===============================");
                                                        System.out.println("  Supercito Morfly | Compras");
                                                        System.out.println("===============================");
                                                        System.out.println("");
                                                        System.out.println("Tipo de Proveedor: " + tipoCliente);
                                                        System.out.println("Producto Seleccionado: Maiz");
                                                        System.out.println(String.format("Inventario: %.1fkg", inventarioMaiz));
                                                        System.out.println("");

                                                        while (true) {
                                                            try {
                                                                System.out.print("Ingrese la cantidad en kilogramos: ");
                                                                cantidadMaiz = entrada.nextDouble();

                                                                if (cantidadMaiz > 0) {
                                                                    inventarioMaiz += cantidadMaiz;
                                                                    totalCantidadMaiz += cantidadMaiz;
                                                                    ventaMaiz = totalCantidadMaiz * 18;
                                                                    break;
                                                                } else {
                                                                    System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n");
                                                                    Thread.sleep(500);
                                                                }
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                                                Thread.sleep(500);
                                                                entrada.nextLine();
                                                            }
                                                        }
                                                        break;
                                                    } else {
                                                        System.out.println("\n*** Este tipo de proveedor no vende este producto ***\n");
                                                        Thread.sleep(500);
                                                        break;
                                                    }
                                                case 5:
                                                    System.out.println("\n*** Has salido de Compras ***\n");
                                                    Thread.sleep(500);
                                                    salirSeccion = true;
                                                    break;
                                                default:
                                                    System.out.println("\n*** Esta opcion no existe ***");
                                                    Thread.sleep(500);
                                                    continue;
                                            }
                                            break;
                                        } catch (InputMismatchException e) {
                                            System.out.println("\n*** Formato Ingresado Invalido ***");
                                            Thread.sleep(500);
                                            entrada.nextLine();
                                        }
                                    }

                                    if (salirSeccion) {
                                        break;
                                    }

                                    // Proceso de facturacion
                                    subtotalVentas = ventaAzucar + ventaAvena + ventaTrigo + ventaMaiz;
                                    if (subtotalVentas <= caja) {
                                        if (cantidadAzucar > 0 || cantidadAvena > 0 || cantidadTrigo > 0 || cantidadMaiz > 0) {
                                            System.out.println("\n==========================================================");
                                            System.out.println("         Supercito Morfly | Facturacion Compras");
                                            System.out.println("==========================================================");
                                            System.out.println("");
                                            System.out.println("ID Factura: " + (idFacturacionCompras++));
                                            System.out.println("Tipo de Proveedor: " + tipoCliente);
                                            System.out.println("");
                                            System.out.println("Codigo     Nombre      Cantidad     Precio     Total");

                                            if (cantidadAzucar > 0) {
                                                System.out.println(String.format("  1        Azucar        %.1fkg      Lps.25.00  Lps.%.2f", totalCantidadAzucar, ventaAzucar));
                                                cantidadAzucar = 0;
                                                totalCantidadAzucar = 0;
                                            }
                                            if (cantidadAvena > 0) {
                                                if (tipoCliente.equalsIgnoreCase("B")) {
                                                    System.out.println(String.format("  2        Avena         %.1fkg      Lps.20.00  Lps.%.2f", totalCantidadAvena, ventaAvena));
                                                } else {
                                                    System.out.println(String.format("  2        Avena         %.1fkg      Lps.22.00  Lps.%.2f", totalCantidadAvena, ventaAvena));
                                                }
                                                cantidadAvena = 0;
                                                totalCantidadAvena = 0;
                                            }
                                            if (cantidadTrigo > 0) {
                                                System.out.println(String.format("  3        Trigo         %.1fkg      Lps.30.00  Lps.%.2f", totalCantidadTrigo, ventaTrigo));
                                                cantidadTrigo = 0;
                                                totalCantidadTrigo = 0;
                                            }
                                            if (cantidadMaiz > 0) {
                                                System.out.println(String.format("  4        Maiz          %.1fkg      Lps.18.00  Lps.%.2f", totalCantidadMaiz, ventaMaiz));
                                                cantidadMaiz = 0;
                                                totalCantidadMaiz = 0;
                                            }
                                            ventaAzucar = 0;
                                            ventaAvena = 0;
                                            ventaTrigo = 0;
                                            ventaMaiz = 0;
                                            totalCompras = subtotalVentas;
                                            System.out.println(String.format("\nTotal: L.%.2f", totalCompras));
                                            System.out.println("==========================================================\n");
                                            caja -= totalCompras; // Se le resta el total de la compra a la caja
                                            margenCompras += totalCompras; // Contador del margen de ventas para seccion de Reportes
                                            cantidadCompras++; // Contador de compras realizadas para la seccion de Reportes
                                            Thread.sleep(3000);

                                            // Chequeo de la mayor compra
                                            if (totalCompras >= compraMayor) {
                                                compraMayor = totalCompras;
                                            }

                                            salirSeccion = true; // Poner fin ciclo de Compras
                                        } else {
                                            salirSeccion = true; // Para salir del ciclo de compras sin mostrar factura si no compro productos
                                        }
                                    } else {
                                        System.out.println("\n*** Saldo Insuficiente para pagar esta compra ***\n");
                                        System.out.println(String.format("Saldo en Caja: Lps.%.2f", caja));
                                        System.out.println(String.format("Total de Compra: Lps.%.2f\n", subtotalVentas));

                                        // Reseteo de todas las variables
                                        inventarioAzucar -= cantidadAzucar;
                                        inventarioAvena -= cantidadAvena;
                                        inventarioTrigo -= cantidadTrigo;
                                        inventarioMaiz -= cantidadMaiz;
                                        cantidadAzucar = 0;
                                        cantidadAvena = 0;
                                        cantidadTrigo = 0;
                                        cantidadMaiz = 0;
                                        totalCantidadAzucar = 0;
                                        totalCantidadAvena = 0;
                                        totalCantidadTrigo = 0;
                                        totalCantidadMaiz = 0;
                                        ventaAzucar = 0;
                                        ventaAvena = 0;
                                        ventaTrigo = 0;
                                        ventaMaiz = 0;
                                        salirSeccion = true;
                                        Thread.sleep(1000);
                                    }
                                } else {
                                    System.out.println("\n*** Este tipo de cliente no existe ***");
                                    Thread.sleep(500);
                                }
                            }
                            break;
                        } else {
                            System.out.println("\n            **    ERROR    **");
                            System.out.println("No puedes ingresar porque no has abierto caja.\n");
                            Thread.sleep(500);
                            break;
                        }
                    case 4: // Reportes

                        if (abrirCaja) {

                            //Calculos
                            margenTotal = (margenVentas > margenCompras) ? String.format("| Margen de Ganancia: Lps.%.2f", margenVentas - margenCompras) : String.format("| Margen de Ganancia: Lps.0.00\n| Perdida: Lps.%.2f", margenCompras - margenVentas);

                            if (margenVentas > 0) {
                                promedioVentas = margenVentas / cantidadVentas;
                            } else {
                                promedioVentas = 0;
                            }

                            if (margenCompras > 0) {
                                promedioCompras = margenCompras / cantidadCompras;
                            } else {
                                promedioCompras = 0;
                            }

                            System.out.println("\n====================================");
                            System.out.println("    Supercito Morfly | Reportes");
                            System.out.println("====================================\n");
                            System.out.println(String.format("| Cantidad en Caja: Lps.%.2f\n", caja));
                            System.out.println("| Ventas Realizadas: " + cantidadVentas);
                            System.out.println(String.format("| Total Ventas: Lps.%.2f\n", margenVentas));
                            System.out.println("| Compras Realizadas: " + cantidadCompras);
                            System.out.println(String.format("| Total Compras: Lps.%.2f\n", margenCompras));
                            System.out.println(margenTotal + "\n");
                            System.out.println(String.format("| Promedio de Ventas: Lps.%.2f", promedioVentas));
                            System.out.println(String.format("| Promedio de Compras: Lps.%.2f\n", promedioCompras));
                            System.out.println(String.format("| Venta con Mayor Ganancia: Lps.%.2f", ventaMayor));
                            System.out.println(String.format("| Compra con Mayor Gasto: Lps.%.2f\n", compraMayor));
                            System.out.println("| Producto Estrella: " + productoEstrella);
                            System.out.println(String.format("| Cantidad Vendida: %.1fkg\n", cantidadEstrella));
                            System.out.println("====================================\n");
                            Thread.sleep(3000);
                            break;
                        } else {
                            System.out.println("\n            **    ERROR    **");
                            System.out.println("No puedes ingresar porque no has abierto caja.\n");
                            Thread.sleep(500);
                            break;
                        }
                    case 5: // Cierre de Caja

                        if (abrirCaja) {
                            if (caja > 0) {
                                // Calculos
                                limiteBanco = caja * 0.60;

                                System.out.println("\n==========================================");
                                System.out.println("    Supercito Morfly | Cierre de Caja");
                                System.out.println("==========================================\n");
                                System.out.println("Nota: Solo se puede depositar menos o el 60%\nde efectivo que hay en caja.\n");
                                System.out.println(String.format("| Cantidad en Caja: Lps.%.2f", caja));
                                System.out.println(String.format("| Cantidad maxima permitida: L.%.2f\n",limiteBanco));

                                while (true) {
                                    try {
                                        System.out.print("Ingrese el efectivo a depositar en el banco: ");
                                        guardarBanco = entrada.nextDouble();

                                        if (guardarBanco <= limiteBanco) { // Chequeo deposito en el banco
                                            if (guardarBanco > 0) {
                                                caja = caja - guardarBanco;
                                                System.out.println("\n=============================================");
                                                System.out.println("**** Se ha realizado el cierre de caja ****");
                                                System.out.println(String.format("    Se guardo en el banco Lps.%.2f", guardarBanco));
                                                System.out.println("=============================================\n");
                                                cierreCaja = true;
                                                abrirCaja = false;
                                                Thread.sleep(1000);
                                                break;
                                            } else {
                                                System.out.println("\n*** Ingrese una cantidad mayor que 0 ***\n");
                                                Thread.sleep(500);
                                            }
                                        } else {
                                            System.out.println("\n*** No puedes depositar mas del 60% del efectivo en caja ***\n");
                                            Thread.sleep(500);
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("\n*** Formato Ingresado Invalido ***\n");
                                        Thread.sleep(500);
                                        entrada.nextLine();
                                    }
                                }
                            } else {
                                System.out.println("\n*** No tienes efectivo en caja para depositar ***");
                                System.out.println("        Se ha realizado el cierre de caja\n");
                                cierreCaja = true;
                                abrirCaja = false;
                                Thread.sleep(500);
                                break;
                            }
                        } else {
                            System.out.println("\n            **    ERROR    **");
                            System.out.println("No puedes ingresar porque no has abierto caja.\n");
                            Thread.sleep(500);
                            break;
                        }
                        break;
                    case 6: // Salir del Sistema
                        if (!abrirCaja || cierreCaja) {
                            System.out.println("\nQue tenga lindo dia!\n");
                            salirPrograma = true;
                            Thread.sleep(1000);
                            break;
                        } else {
                            System.out.println("\n*** No puedes salir si no has cerrado caja ***\n");
                            Thread.sleep(500);
                            break;
                        }
                    default: // Opcion Invalida
                        System.out.println("\n*** Opcion Ingresada Invalida ***\n");
                        Thread.sleep(500);
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\n*** Formato Ingresado Invalido ***\n");
                Thread.sleep(500);
                entrada.nextLine();
            }
        }
    }
}
