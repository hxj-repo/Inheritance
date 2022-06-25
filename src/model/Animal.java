package model;

public class Animal {
    private byte age;
    private float weight;

    public Animal(byte age, float weight) {
        this.age = age;
        this.weight = weight;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void running() {
        System.out.println("动物奔跑");
    }

    public void eating() {
        System.out.println("动物进食");
    }
}
