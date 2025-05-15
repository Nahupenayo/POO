package com.mycompany.proyecto_4;
import java.util.Scanner;

public class Proyecto_4{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CANT_CAMIONES = 30;

        // Arrays para almacenar la información de cada camión
        String[] patente = new String[CANT_CAMIONES];
        String[] nombreChofer = new String[CANT_CAMIONES];
        String[] apellidoChofer = new String[CANT_CAMIONES];
        String[] tipoCarga = new String[CANT_CAMIONES];
        String[] horaEgreso = new String[CANT_CAMIONES];
        int camionesTe = 0;

        System.out.println("Ingrese la informacion de los " + CANT_CAMIONES + " camiones:");

        for (int i = 0; i < CANT_CAMIONES; i++) {
            System.out.println("Camion " + (i + 1) + ":");

            System.out.print("  Patente: ");
            patente[i] = scanner.nextLine(); // Usar nextLine() para leer la patente completa

            System.out.print("  Nombre del chofer: ");
            nombreChofer[i] = scanner.nextLine();

            System.out.print("  Apellido del chofer: ");
            apellidoChofer[i] = scanner.nextLine();

            System.out.print("  Tipo de carga: ");
            tipoCarga[i] = scanner.nextLine().toLowerCase(); // Convertir a minúscula para comparar fácilmente

            System.out.print("  Hora de egreso: ");
            horaEgreso[i] = scanner.nextLine();

            if (tipoCarga[i].equals("té")) {
                camionesTe++;
            }
        }

        System.out.println("Reporte de Egreso de Camiones");
        for (int i = 0; i < CANT_CAMIONES; i++) {
            System.out.println("Camión " + (i + 1) + ":");
            System.out.println("Patente: " + patente[i]);
            System.out.println("Chofer: " + nombreChofer[i] + " " + apellidoChofer[i]);
            System.out.println("Carga: " + tipoCarga[i]);
            System.out.println("Hora de egreso: " + horaEgreso[i]);
        }

        System.out.println("Cantidad de camiones que cargaron té: " + camionesTe);

        scanner.close();
    }
}