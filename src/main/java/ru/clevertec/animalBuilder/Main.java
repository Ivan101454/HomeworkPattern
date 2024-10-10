package ru.clevertec.animalBuilder;

import ru.clevertec.animalBuilder.builder.PredatorBuilding;
import ru.clevertec.animalBuilder.model.Animal;
import ru.clevertec.animalBuilder.util.Util;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        //Создаем новое животное и доавляем в список
        Animal animalNew = new PredatorBuilding().createAnimal().setAge(5).setBread("Lion").setOrigin("Africa")
                .setGender("Female").getAnimal();
        System.out.println(animalNew.toString());


        List<Animal> animals = Util.getAnimals();
        animals.add(animalNew);

        animals.stream()
                .filter(animal -> (animal.getAge() >= 10 && animal.getAge() < 20))
                .sorted(Comparator.comparing(Animal::getAge))
                .skip(2).limit(7)
                .forEach(System.out::println);
    }
}
