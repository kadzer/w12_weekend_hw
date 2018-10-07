package instruments;

import shops.IPlay;
import shops.ISell;

public class Guitar extends Instrument implements IPlay, ISell {
    private String guitarType;
    private int stringcount;
    private String bodyMaterial;

    public Guitar(InstrumentType type, String make, String model, double cost, double price, String guitarType, int stringcount, String bodyMaterial) {
        super(type, make, model, cost, price);
        this.guitarType = guitarType;
        this.stringcount = stringcount;
        this.bodyMaterial = bodyMaterial;
    }
    @Override
    public String play(){
        return "Strum strum, boys and girls";
    }

    public double calculateMarkup() {
        return getPrice() - getCost();
    }
}
