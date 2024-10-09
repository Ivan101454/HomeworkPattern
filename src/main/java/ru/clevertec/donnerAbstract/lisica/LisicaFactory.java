package ru.clevertec.donnerAbstract.lisica;

import ru.clevertec.donnerAbstract.interfaces.AbstractDonnerFactory;
import ru.clevertec.donnerAbstract.interfaces.Donner;

public class LisicaFactory implements AbstractDonnerFactory {

    @Override
    public Donner createDonnerMushroomSourcream() {
        return new MohentonenMushroom();
    }

    @Override
    public Donner createDonnerFalafel() {
        return new SaladRoll();
    }

    @Override
    public Donner createDonnerKorean() {
        return new SpicyPike();
    }
}

