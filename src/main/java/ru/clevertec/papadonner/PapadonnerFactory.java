package ru.clevertec.papadonner;

import ru.clevertec.interfaces.AbstractDonnerFactory;
import ru.clevertec.interfaces.Donner;

public class PapadonnerFactory implements AbstractDonnerFactory {


    @Override
    public Donner createDonnerMushroomSourcream() {
        return new DonnerMushroomSourcream();
    }

    @Override
    public Donner createDonnerFalafel() {
        return new DonnerFalafel();
    }

    @Override
    public Donner createDonnerKorean() {
        return new DonnerKorean();
    }
}

