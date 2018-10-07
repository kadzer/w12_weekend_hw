import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(InstrumentType.STRING, "Yamaha", "FG800",100, 135, "acoustic", 6, "wood");
    }

    @Test
    public void canGetMake() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("Strum strum, boys and girls", guitar.play());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(35.00, guitar.calculateMarkup(), 0.01);
    }
}
