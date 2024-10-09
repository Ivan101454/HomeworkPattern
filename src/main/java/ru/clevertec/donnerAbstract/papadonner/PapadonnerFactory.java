package ru.clevertec.donnerAbstract.papadonner;

import ru.clevertec.donnerAbstract.interfaces.AbstractDonnerFactory;
import ru.clevertec.donnerAbstract.interfaces.Donner;

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

