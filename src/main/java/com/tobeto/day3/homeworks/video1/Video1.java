package com.tobeto.day3.homeworks.video1;

class Video1 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        // Değişken isimlendirmeleri Java'da "camelCase" yazılır.
        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade süresi";

        System.out.println(ortaMetin);

        // Integer
        int vade = 12;

        // Double
        double dolarDun = 30.25;
        double dolarBugun = 50.95;

        // Boolean
        boolean dolarDustuMu = false;


        // Conditions

        String okYonu = "down.svg";

        if (dolarBugun < dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }


        // Array

        String[] krediler = {"Hızlı kredi", "Maaşını Halkbank'tan", "Mutlu emekli"};

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }
}
