package ru.clevertec.lisica;

import ru.clevertec.interfaces.Donner;

public class SaladRoll implements Donner {
    @Override
    public void makeDonner() {
        System.out.println("Вегатаринский готов");
    }
}
