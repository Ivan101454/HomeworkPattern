package ru.clevertec.papadonner;

import ru.clevertec.interfaces.Donner;

public class DonnerKorean implements Donner {
    @Override
    public void makeDonner() {
        System.out.println("Шаурма корян готова");
    }
}
