package ar.digitalers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

import ar.digitalers.CreditCard.CreditCard;
import ar.digitalers.RandomNum.RandomNum;

public class Main {

    public static void main(String[] args) {

        ArrayList<CreditCard> list = new ArrayList<CreditCard>();
        CreditCard creditCard = new CreditCard();


        UUID rand = UUID.randomUUID(); 

        int limit = new RandomNum(100_000, 1_000_000).random();

        int month = new RandomNum(1, 12).random();
        int days = new RandomNum(1, 25).random();
        int years = new RandomNum(2024, 2030).random();

        LocalDate localDate2 = LocalDate.of(years, month, days);

        creditCard.setCuentabancariaID(rand);
        creditCard.setCodigo();
        creditCard.setFecha_vencimiento(localDate2);
        creditCard.setLimite(limit);


        list.add(creditCard);

        System.out.println("MI TARJETA DE CRÉDITO");
        System.out.println();


        for (CreditCard items: list) {
            System.out.printf("TARJETA DE CRÉDITO\n\n* ID de la cuenta bancaria: %s\n* ID de la tarjeta: %s\n* Expira: %s\n* Máximo de retiro: $%d",
                items.getCuentabancariaID(),
                items.getCodigo(),
                items.getFecha_vencimiento(),
                items.getLimite()
            );
        }
    }
}
