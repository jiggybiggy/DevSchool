package ch.axa.start;


public class Doppelburger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Doppel Burger";
    }
}