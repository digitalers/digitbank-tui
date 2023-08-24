package servicios;

import entidades.CuentaBancaria;
import entidades.Titular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorCuentas {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> dnisRegistrados = new ArrayList<>();

    public static CuentaBancaria crearCuenta() {
        String dni;

        do {
            System.out.println("Ingrese el DNI del titular:");
            dni = scanner.nextLine();

            if (dniExistente(dni)) {
                System.out.println("Ya existe una cuenta con este DNI. Intente con otro.");
            }
        } while (dniExistente(dni));

        System.out.println("Ingrese el apellido del titular:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese el nombre del titular:");
        String nombre = scanner.nextLine();

        dnisRegistrados.add(dni);

        System.out.println("¿Desea ingresar un saldo inicial? (S/N)");
        double saldoInicial = 0.0;
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("S")) {
            System.out.println("Ingrese el saldo inicial:");
            saldoInicial = scanner.nextDouble();
            scanner.nextLine();
        }

        return new CuentaBancaria(new Titular(dni, apellido, nombre), saldoInicial);
    }

    public static void mostrarSaldo(CuentaBancaria cuenta) {
        System.out.println(cuenta);
    }

    private static boolean dniExistente(String dni) {
        return dnisRegistrados.contains(dni);
    }
}
