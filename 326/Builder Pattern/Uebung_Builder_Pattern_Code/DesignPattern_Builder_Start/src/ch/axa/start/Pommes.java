package ch.axa.start;

public class Pommes extends SideDish{
    @Override
    public String name() {
        return "Pommes";
    }

    @Override
    public Packing packing() {
        return new PommesBox();
    }

    @Override
    public float price() {
        return 1;
    }
}
