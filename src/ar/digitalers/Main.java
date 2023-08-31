import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

import tarjetaCredito.TarjetaCredito;
import util.RandomNum;

public class Main {

    public static void main(String[] args) {

        ArrayList<TarjetaCredito> list = new ArrayList<TarjetaCredito>();
        TarjetaCredito creditCard = new TarjetaCredito();

        // Genera un ID random
        UUID rand = UUID.randomUUID();

        // Límite de dinero
        int limit = new RandomNum(100_000, 1_000_000).random();

        // Un número de expiración al azar, meses, días y años
        int month = new RandomNum(1, 12).random();
        int days = new RandomNum(1, 25).random();
        int years = new RandomNum(2024, 2030).random();

        // Setea la fecha
        LocalDate localDate2 = LocalDate.of(years, month, days);

        // Lista que contiene los 4 dígitos del ID de la tarjeta de crédito
        ArrayList<String> code = new ArrayList<String>();

        // Número máximo de carácteres por grupo (ID DE TARJETA)
        int max = 4;

        for (int i = 0; i < max; i++) {
            // Genera un núero al azar entre 1111 y 9999
            Integer nums = new RandomNum(1111, 9999).random();
            code.add(nums.toString());
        }

        // Concatena todos los números al azar en una variable de tipo String
        String codigo = code.get(0) + " " + code.get(1) + " " + code.get(2) + " " + code.get(3);

        creditCard.setCuentabancariaID(rand);
        creditCard.setCodigo(codigo);
        creditCard.setFecha_vencimiento(localDate2);
        creditCard.setLimite(limit);

        // Añade en la lista la tarjeta de crédito
        list.add(creditCard);

        System.out.println("MI TARJETA DE CRÉDITO");
        System.out.println();

        // Recorremos el array de lista para obtener todos los datos de la / las
        // tarjetas de créditos
        for (TarjetaCredito items : list) {
            System.out.printf(
                    "TARJETA DE CRÉDITO\n\n* ID de la cuenta bancaria: %s\n* ID de la tarjeta: %s\n* Expira: %s\n* Máximo de retiro: $%d",
                    items.getCuentabancariaID(),
                    items.getCodigo(),
                    items.getFecha_vencimiento(),
                    items.getLimite());
        }
    }
}
