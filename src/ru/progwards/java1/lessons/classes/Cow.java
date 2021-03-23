package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {

    static double foodCoeff = 0.05;

    Cow() {
        super(AnimalKind.COW, FoodKind.HAY, 0d, foodCoeff);
    }

    Cow(double weight) {
        super(AnimalKind.COW, FoodKind.HAY, weight, foodCoeff);
    }

    //public AnimalKind getKind()
    //public FoodKind getFoodKind()
    //Извеняюсь, что не реализовал, но мне кажется, что мой вариант реализации того же функционала интересней
    //А применение @Override есть в родительском классе :)

    public static void main(String[] args) {
        Cow animal = new Cow(250);
        System.out.println(animal);
        System.out.println(animal.getFoodCoeff());
        System.out.println(animal.getCoeff());
    }

}