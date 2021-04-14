package ch.axa.start;

public abstract class Toy implements Item{
    @Override
    public Packing packing() {
        return new CartonBox();
    }
}