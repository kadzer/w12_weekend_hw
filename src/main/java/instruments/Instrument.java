package instruments;

public abstract class Instrument {
    private InstrumentType type;
    private String make;
    private String model;
    private double cost;
    private double price;

    public Instrument(InstrumentType type, String make, String model, double cost, double price) {
        this.type = type;
        this.make = make;
        this.model = model;
        this.cost = cost;
        this.price = price;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getCost() {
        return cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
