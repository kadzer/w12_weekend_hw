public class Piano extends Instrument implements IPlay{
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
}
