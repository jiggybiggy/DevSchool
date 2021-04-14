package ch.axa.start;

public abstract class Salad implements Item{

    @Override
    public Packing packing() {
        return new PlasticBowl();
    }
}
