package com.mycompany.proyecto_7;
import java.util.Scanner;

public class Proyecto_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPersonas = 0;
        int cantidadVarones = 0;
        int cantidadMujeres = 0;
        int varonesEnRangoEdad = 0;

        String documentoMayorEdad = "";
        int mayorEdad = -1;

        System.out.println("Ingrese los datos de las personas censadas:");

        while (true) {
            System.out.print("Número de documento: ");
            String documento = scanner.nextLine();

            if (documento.equals("0")) {
                break;
            }

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Sexo (F/M): ");
            String sexo = scanner.nextLine().toUpperCase(); 

            totalPersonas++;

            if (sexo.equals("M")) {
                cantidadVarones++;
                if (edad >= 16 && edad <= 65) {
                    varonesEnRangoEdad++;
                }
            } else if (sexo.equals("F")) {
                cantidadMujeres++;
            } else {
                System.out.println("Sexo inválido. Se omitirá esta persona del conteo de sexo.");
            }

            if (edad > mayorEdad) {
                mayorEdad = edad;
                documentoMayorEdad = documento;
            }
        }

        System.out.println("--- Resultados del Censo ---");
        System.out.println("Cantidad total de personas censadas: " + totalPersonas);
        System.out.println("Cantidad de varones: " + cantidadVarones);
        System.out.println("Cantidad de mujeres: " + cantidadMujeres);

        if (cantidadVarones > 0) {
            double porcentajeVaronesEnRango = (double) varonesEnRangoEdad / cantidadVarones * 100;
            System.out.printf("Porcentaje de varones entre 16 y 65 años: %.2f%%\n", porcentajeVaronesEnRango);
        } else {
            System.out.println("No se censaron varones para calcular el porcentaje.");
        }

        if (totalPersonas > 0) {
            System.out.println("Persona con mayor edad:");
            System.out.println("  Número de documento: " + documentoMayorEdad);
            System.out.println("  Edad: " + mayorEdad);
        } else {
            System.out.println("No se ingresaron datos de personas.");
        }

        scanner.close();
    }
}