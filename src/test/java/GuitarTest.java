import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(InstrumentType.STRING, "Yamaha", "FG800", "acoustic", 6, "wood");
    }

    @Test
    public void canGetMake() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("Strum strum, boys and girls", guitar.play());
    }
}
