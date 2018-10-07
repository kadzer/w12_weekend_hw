import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(InstrumentType.STRING, "Yamaha", "GC1", 10000.00, 13000.00, "Upright grand piano");
    }

    @Test
    public void canPlay() {
        assertEquals("Chopin away", piano.play());
    }

    @Test
    public void canSetPrice() {
        piano.setPrice(13500.00);
        assertEquals(13500.00, piano.getPrice(), 0.01);
    }

    @Test
    public void canGetMarkup() {
        assertEquals(3000.00, piano.calculateMarkup(), 0.01);
    }
}
