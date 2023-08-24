package main;

import entidades.CuentaBancaria;
import servicios.GestorCuentas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<CuentaBancaria> cuentas = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Bienvenido a la aplicación de registro de cuentas bancarias.");

        do {
            CuentaBancaria nuevaCuenta = GestorCuentas.crearCuenta();
            cuentas.add(nuevaCuenta);

            System.out.println("¡Cuenta creada con éxito!");
            GestorCuentas.mostrarSaldo(nuevaCuenta);

            System.out.println("¿Desea crear otra cuenta? (S/N)");
            String respuesta = scanner.nextLine();

            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }
        } while (true);


        System.out.println("\nResumen de cuentas creadas:");
        for (int i = 0; i < cuentas.size(); i++) {
            System.out.println("Cuenta " + (i + 1) + ":");
            GestorCuentas.mostrarSaldo(cuentas.get(i));
            System.out.println("-----------------------------");
        }
    }
}
