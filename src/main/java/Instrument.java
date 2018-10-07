public abstract class Instrument {
    private InstrumentType type;
    private String make;
    private String model;

    public Instrument(InstrumentType type, String make, String model) {
        this.type = type;
        this.make = make;
        this.model = model;
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
}
