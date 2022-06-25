package model;

public class FelidaeFamily extends Animal{

    public FelidaeFamily(byte age, float weight) {
        super(age, weight);
    }

    public void sounding() {
        System.out.println("producing the meowing meowing sound");
    }
}
