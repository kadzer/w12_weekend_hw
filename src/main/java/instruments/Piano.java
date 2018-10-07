package instruments;

import shops.IPlay;
import shops.ISell;

public class Piano extends Instrument implements IPlay, ISell {
    private String pianoType;


    public Piano(InstrumentType type, String make, String model, double cost, double price, String pianoType) {
        super(type, make, model, cost, price);
        this.pianoType = pianoType;
    }

    public String getPianoType() {
        return pianoType;
    }

    @Override
    public String play() {
        return "Chopin away";
    }

    public double calculateMarkup() {
        return getPrice() - getCost();
    }
}
