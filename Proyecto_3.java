package com.mycompany.proyecto_3;
import java.util.Scanner;

public class Proyecto_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos: ");
        int n = scanner.nextInt();

        int[] cantidades = new int[n];
        double[] costos = new double[n];
        double precioTotal = 0;

        System.out.println("Ingrese la información de los " + n + " productos:");

        for (int i = 0; i < n; i++) {
            System.out.println("Producto " + (i + 1) + ":");
            System.out.print("  Cantidad: ");
            cantidades[i] = scanner.nextInt();
            System.out.print("  Costo unitario: $");
            costos[i] = scanner.nextDouble();

            double precioProducto = cantidades[i] * costos[i];
            precioTotal += precioProducto;
        }

        System.out.println("Resultados:");
        System.out.println("Precio total de todos los productos:" + precioTotal);

        System.out.println("Productos con precio total superior a $1000:");
        boolean hayProductosSuperiores = false;
        for (int i = 0; i < n; i++) {
            double precioProducto = cantidades[i] * costos[i];
            if (precioProducto > 1000) {
                System.out.println("Producto " + (i + 1) + ": Cantidad=" + cantidades[i] + ", Costo Unitario=$" + costos[i] + ", Precio Total=$" + precioProducto);
                hayProductosSuperiores = true;
            }
        }

        if (!hayProductosSuperiores) {
            System.out.println("Ningún producto supera los $1000.");
        }

        scanner.close();
    }
}