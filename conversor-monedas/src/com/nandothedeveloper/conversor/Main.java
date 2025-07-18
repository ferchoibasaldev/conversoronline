package com.nandothedeveloper.conversor;

import com.nandothedeveloper.conversor.service.CurrencyConverterService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverterService service = new CurrencyConverterService();

        System.out.println("=== CONVERSOR DE MONEDAS ===");

        System.out.print("Moneda origen (ej. USD): ");
        String from = scanner.nextLine().toUpperCase();

        System.out.print("Moneda destino (ej. PEN): ");
        String to = scanner.nextLine().toUpperCase();

        System.out.print("Cantidad a convertir: ");
        double amount = scanner.nextDouble();

        try {
            double result = service.convert(from, to, amount);
            System.out.printf("%.2f %s = %.2f %s\n", amount, from, result, to);
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }

        scanner.close();
    }
}
