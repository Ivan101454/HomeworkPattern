package ru.clevertec.donnerAbstract.papadonner;

import ru.clevertec.donnerAbstract.interfaces.Donner;

public class DonnerFalafel implements Donner {
    @Override
    public void makeDonner() {
        System.out.println("Шаурма фалафель готова");
    }
}
