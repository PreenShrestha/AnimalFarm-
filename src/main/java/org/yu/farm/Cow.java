package org.yu.farm;

public class Cow extends Animal {

    public Cow(String name) {
        this(AnimalType.COW, name);
    }

    private Cow(AnimalType species, String name) {
        super(species, name);
    }


    @Override
    public void eatUnderYonderTree() {
        System.out.println("Moo, Moo, Yummy grass");
    }

    @Override
    public void makeNoise() {
        System.out.println("Tweet tweet tweet!");
        System.out.println("ooops.  I meant \"Moooooo\" ");
    }

}
