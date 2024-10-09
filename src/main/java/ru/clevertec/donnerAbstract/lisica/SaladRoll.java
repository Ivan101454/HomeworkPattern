package ru.clevertec.donnerAbstract.lisica;

import ru.clevertec.donnerAbstract.interfaces.Donner;

public class SaladRoll implements Donner {
    @Override
    public void makeDonner() {
        System.out.println("Вегатаринский готов");
    }
}
