package ru.clevertec.lisica;

import ru.clevertec.interfaces.Donner;

public class SpicyPike implements Donner {
    @Override
    public void makeDonner() {
        System.out.println("Острый пайк готов");
    }
}
