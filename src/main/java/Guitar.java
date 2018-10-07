public class Guitar extends Instrument implements IPlay {
    private String guitarType;
    private int stringcount;
    private String bodyMaterial;

    public Guitar(InstrumentType type, String make, String model, String guitarType, int stringCount, String bodyMaterial) {
        super(type, make, model);
        this.guitarType = guitarType;
        this.stringcount = stringCount;
        this.bodyMaterial = bodyMaterial;
    }

    public String play(){
        return "Strum strum, boys and girls";
    }
}
