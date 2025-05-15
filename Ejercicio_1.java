package com.mycompany.trabajopractico_1;
import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas del alumno: ");
        int cantidadNotas = scan.nextInt();

 
        double[] notas = new double[cantidadNotas];

        System.out.println("Ingrese las " + cantidadNotas + " notas:");
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scan.nextDouble();
        }

        double notaAlta = notas[0];
        for (int i = 1; i < cantidadNotas; i++) {
            if (notas[i] > notaAlta) {
                notaAlta = notas[i];
            }
        }
        double sumaNotas = 0;
        for (double nota : notas) {
            sumaNotas += nota;
        }
        double promedio = sumaNotas / cantidadNotas;

        System.out.println("Resultados:");
        System.out.println("La nota más alta es: " + notaAlta);
        System.out.println("El promedio de las notas es: " + promedio);

        scan.close();
    }
}
