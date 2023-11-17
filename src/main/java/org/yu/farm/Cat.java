package org.yu.farm;

public class Cat extends Animal {

    public Cat(String name) {
        super(AnimalType.CAT, name);
    }

    @Override
    public void eatUnderYonderTree() {
        System.out.println("Meow Meow, I am eating!!");
    }

    @Override
    public void makeNoise() {
        System.out.println("Mrrrowwrr prrt");
    }

}
