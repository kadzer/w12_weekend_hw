public class Trumpet extends Instrument implements IPlay{
    private String trumpetType;

    public Trumpet(InstrumentType type, String make, String model, double cost, double price, String trumpetType) {
        super(type, make, model, cost, price);
        this.trumpetType = trumpetType;
    }

    @Override
    public String play() {
        return "Doot!";
    }

    public String getTrumpetType() {
        return trumpetType;
    }
}
