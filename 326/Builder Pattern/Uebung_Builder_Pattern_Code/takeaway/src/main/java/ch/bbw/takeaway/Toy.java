package ch.bbw.takeaway;

public abstract class Toy implements Item{
    @Override
    public Packing packing() {
        return new CartonBox();
    }
}