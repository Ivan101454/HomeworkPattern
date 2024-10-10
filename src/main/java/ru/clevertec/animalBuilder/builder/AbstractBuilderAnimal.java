package ru.clevertec.animalBuilder.builder;

import lombok.Getter;
import ru.clevertec.animalBuilder.model.Animal;
@Getter
public abstract class AbstractBuilderAnimal {
    private Animal animal;
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public abstract AbstractBuilderAnimal createAnimal();
    public abstract AbstractBuilderAnimal setId(int id);
    public abstract AbstractBuilderAnimal setBread(String bread);
    public abstract AbstractBuilderAnimal setAge(int age);
    public abstract AbstractBuilderAnimal setOrigin(String origin);
    public abstract AbstractBuilderAnimal setGender(String gender);

}
