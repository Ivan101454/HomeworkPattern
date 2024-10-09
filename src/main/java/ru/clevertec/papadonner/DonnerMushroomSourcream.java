package ru.clevertec.papadonner;

import ru.clevertec.interfaces.Donner;

public class DonnerMushroomSourcream implements Donner {
    @Override
    public void makeDonner() {
        System.out.println("Шаурма сметана грибы готова");
    }
}
