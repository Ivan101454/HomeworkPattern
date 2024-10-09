package ru.clevertec.animalBuilder.builder;

import lombok.Getter;
import ru.clevertec.animalBuilder.model.Animal;
@Getter
public abstract class AbstractBuilderAnimal {
    private Animal animal;

    public void createAnimal() {
        animal = new Animal();
    }
    public abstract PredatorBuilding setId(int id);
    public abstract PredatorBuilding setBread(String bread);
    public abstract PredatorBuilding setAge(int age);
    public abstract PredatorBuilding setOrigin(String origin);
    public abstract PredatorBuilding setGender(String gender);

}
