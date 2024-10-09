package ru.clevertec.donnerAbstract.lisica;

import ru.clevertec.donnerAbstract.interfaces.Donner;

public class SpicyPike implements Donner {
    @Override
    public void makeDonner() {
        System.out.println("Острый пайк готов");
    }
}
