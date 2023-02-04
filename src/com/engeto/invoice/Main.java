package com.engeto.invoice;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // OCHUTNAVKA NAVIC

        String item = "Trekové boty Sedmimílovky";
        int quantity = 4;
        double weight = 0.45;
        BigDecimal pricePerPiece = BigDecimal.valueOf(1800);
        LocalDate dateOfIssue = LocalDate.of(2022, 4, 7);
        boolean isDiscounted = true;

        double totalWeight = quantity * weight;
        System.out.println("Celková váha je: " + totalWeight + " kg");

        BigDecimal totalPrice =
                computeTotalPrice(pricePerPiece,3,isDiscounted,50 );// metoda pro vypocet total price
        System.out.println("Celková cena zásilky: " + totalPrice + " Kč");

        quantity = 5;
        pricePerPiece = BigDecimal.valueOf(2000);
        totalPrice = computeTotalPrice(pricePerPiece,quantity,isDiscounted,0);

        for (int i = 0; i < quantity; i ++) {
            System.out.println(item);
        }



    }

    public static BigDecimal computeTotalPrice(BigDecimal pricePerPiece,
                                               int quantity, boolean isDiscounted, int discount) {
        BigDecimal totalPrice = pricePerPiece.multiply(BigDecimal.valueOf(quantity));
        totalPrice = totalPrice.add(BigDecimal.valueOf(45));
        System.out.println("Celková cena před slevou: " + totalPrice + " Kč");
        System.out.println("Sleva: " + discount + " %");

        if (isDiscounted)  {
            totalPrice = totalPrice.subtract((totalPrice.divide(BigDecimal.valueOf(100)).multiply(BigDecimal.valueOf(discount))));
        }
        return totalPrice;

    }
}



//        String item;
//        int quantity;
//        double weight;
//        BigDecimal pricePerPiece;
//        LocalDate dateOfIssue;
//        boolean isDiscounted;
//        int discount;
//
//        item = "Trekové boty Sedmimilovky";
//        quantity = 3;
//        weight = 0.45;
//        pricePerPiece = BigDecimal.valueOf(1800);
//        dateOfIssue = LocalDate.of(2022,4,7);
//        isDiscounted = true;
//        discount = 5;
//
//        quantity = 2;
//        pricePerPiece = BigDecimal.valueOf(1990);
//        int transport = 45;
//        BigDecimal totalPrice = pricePerPiece.multiply(BigDecimal.valueOf(quantity).add(BigDecimal.valueOf(45)));
//
//        System.out.println("Celková hmotnost zásilky je: " + (quantity * weight) + " kg");
//        System.out.println("Celková cena zásilky je: " + (pricePerPiece.multiply(BigDecimal.valueOf(quantity))));
//        System.out.println("Celková cena zásilky s dopravou je: " +
//                (pricePerPiece.multiply(BigDecimal.valueOf(quantity)).add(BigDecimal.valueOf(45))) + " Kč");




//    }
//}