package ru.clevertec;

import ru.clevertec.interfaces.AbstractDonnerFactory;
import ru.clevertec.interfaces.Donner;
import ru.clevertec.lisica.LisicaFactory;
import ru.clevertec.papadonner.PapadonnerFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractDonnerFactory abstractDonnerFactor;
        Donner donner = null;
        System.out.println("Приятного аппетита");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("где будете заказывать введите \"пападонер\" или \"лисица\" введите");
            String input = scanner.next().trim();
            if (input.equals("пападонер")) {
                abstractDonnerFactor = new PapadonnerFactory();
            } else if (input.equals("лисица")) {
                abstractDonnerFactor = new LisicaFactory();
            } else {
                throw new RuntimeException("данные некоректны");
            }
            System.out.println("Введите доннер \"грибы\", \"овощи\" или \"пикантная\"");
            String inputDonner = scanner.next().trim();
            switch (inputDonner) {
                case "грибы":
                    donner = abstractDonnerFactor.createDonnerMushroomSourcream();
                    break;
                case "овощи":
                    donner = abstractDonnerFactor.createDonnerFalafel();
                    break;
                case "пикантная":
                    donner = abstractDonnerFactor.createDonnerKorean();
                    break;
                default:
                    throw new RuntimeException("данные некоректны");
            }
            if (donner != null) {
                donner.makeDonner();
            }
            System.out.println("Все готово!");
        }
    }
}
