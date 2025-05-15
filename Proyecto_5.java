package com.mycompany.proyecto_5;
import java.util.Scanner;

public class Proyecto_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CANT_CLIENTES = 5;

        for (int i = 0; i < CANT_CLIENTES; i++) {
            System.out.println("Cliente " + (i + 1) + " ---");

            System.out.print("Ingrese el DNI del cliente: ");
            String dni = scanner.nextLine();

            System.out.println("Seleccione el tipo de servicio:");
            System.out.println("1. Internet 30 megas");
            System.out.println("2. Internet 50 megas");
            System.out.println("3. Internet 100 megaS");
            System.out.print("Ingrese el número de servicio (1 2 o 3): ");
            int tipoServicio = scanner.nextInt();
            scanner.nextLine(); 

            double montoPagar = 0;

            switch (tipoServicio) {
                case 1:
                    montoPagar = 750;
                    break;
                case 2:
                    montoPagar = 1100;
                    break;
                case 3:
                    montoPagar = 1500 * 0.95;
                    break;
                default:
                    System.out.println("servicio invalido");
                    continue; 
            }

            System.out.println("--- Factura ---");
            System.out.println("DNI del cliente: " + dni);
            System.out.println("Numero de servicio: " + tipoServicio);
            System.out.println("Monto a pagar:" + String.format("%.2f", montoPagar));
        }

        scanner.close();
    }
}