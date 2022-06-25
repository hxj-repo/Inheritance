package model;

public class Tiger extends FelidaeFamily{
    public Tiger(byte age, float weight) {
        super(age, weight);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger((byte) 3, 200.0f);
        tiger.sounding();
        tiger.running();
    }
}
