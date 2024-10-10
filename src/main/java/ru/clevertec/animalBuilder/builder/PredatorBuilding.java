package ru.clevertec.animalBuilder.builder;

import ru.clevertec.animalBuilder.model.Animal;

public class PredatorBuilding extends AbstractBuilderAnimal{
    @Override
    public AbstractBuilderAnimal createAnimal() {
        super.setAnimal(new Animal());
        return this;
    }

    @Override
    public PredatorBuilding setId(int id) {
        getAnimal().setId(id);
        return this;
    }

    @Override
    public PredatorBuilding setBread(String bread) {
        getAnimal().setBread(bread);
        return this;
    }

    @Override
    public PredatorBuilding setAge(int age) {
        getAnimal().setAge(age);
        return this;
    }

    @Override
    public PredatorBuilding setOrigin(String origin) {
        getAnimal().setOrigin(origin);
        return this;
    }

    @Override
    public PredatorBuilding setGender(String gender) {
        getAnimal().setGender(gender);
        return this;
    }
}
