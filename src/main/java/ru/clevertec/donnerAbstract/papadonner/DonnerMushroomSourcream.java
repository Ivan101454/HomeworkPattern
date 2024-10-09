package ru.clevertec.donnerAbstract.papadonner;

import ru.clevertec.donnerAbstract.interfaces.Donner;

public class DonnerMushroomSourcream implements Donner {
    @Override
    public void makeDonner() {
        System.out.println("Шаурма сметана грибы готова");
    }
}
