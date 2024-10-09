package ru.clevertec.papadonner;

import ru.clevertec.interfaces.Donner;

public class DonnerFalafel implements Donner {
    @Override
    public void makeDonner() {
        System.out.println("Шаурма фалафель готова");
    }
}
