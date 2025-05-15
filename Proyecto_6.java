package com.mycompany.proyecto_6;
import java.util.Scanner;

public class Proyecto_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_COMPETIDORES = 12;

        int mejorNumeroVehiculo = -1;
        double mejorTiempo = Double.MAX_VALUE;

        System.out.println("Ingrese la información de los " + NUM_COMPETIDORES + " competidores:");

        for (int i = 0; i < NUM_COMPETIDORES; i++) {
            System.out.println("\nCompetidor " + (i + 1) + ":");

            System.out.print("Número de vehículo: ");
            int numeroVehiculo = scanner.nextInt();

            System.out.print("Tiempo realizado (en segundos): ");
            double tiempo = scanner.nextDouble();

            if (tiempo < mejorTiempo) {
                mejorTiempo = tiempo;
                mejorNumeroVehiculo = numeroVehiculo;
            }
        }

        System.out.println("--- Resultado del Mejor Tiempo ---");
        System.out.println("Número de vehículo con el mejor tiempo: " + mejorNumeroVehiculo);
        System.out.println("Mejor tiempo realizado: " + mejorTiempo + " segundos");

        scanner.close();
    }
} 