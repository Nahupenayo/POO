package com.mycompany.proyecto_2;
import java.util.Scanner;

public class Proyecto_2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de notas: ");
        int cantidadNotas = scanner.nextInt();

        double[] notas = new double[cantidadNotas];
        int aprobados = 0;
        int desaprobados = 0;

        System.out.println("Ingrese las " + cantidadNotas + " notas:");
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();

            if (notas[i] >= 6) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);

        scanner.close();
    }
}