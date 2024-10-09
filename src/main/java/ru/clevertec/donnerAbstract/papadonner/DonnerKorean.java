package ru.clevertec.donnerAbstract.papadonner;

import ru.clevertec.donnerAbstract.interfaces.Donner;

public class DonnerKorean implements Donner {
    @Override
    public void makeDonner() {
        System.out.println("Шаурма корян готова");
    }
}
