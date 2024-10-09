package ru.clevertec.animalBuilder.builder;

public class PredatorBuilding extends AbstractBuilderAnimal{
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
