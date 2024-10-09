package ru.clevertec.lisica;

import ru.clevertec.interfaces.Donner;

public class MohentonenMushroom implements Donner {
    @Override
    public void makeDonner() {
        System.out.println("Махентонен грибной готов");
    }
}
