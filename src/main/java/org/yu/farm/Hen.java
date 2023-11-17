package org.yu.farm;

public class Hen extends Animal {

    public Hen(String name) {
        this(AnimalType.HEN, name);
    }

    private Hen(AnimalType species, String name) {
        super(species, name);
    }

    @Override
    public void eatUnderYonderTree() {

        System.out.println("Hen is eating under Younder Tree");
    }

    @Override
    public void makeNoise() {
        System.out.println("Shimmy-Shack!");
    }

}
