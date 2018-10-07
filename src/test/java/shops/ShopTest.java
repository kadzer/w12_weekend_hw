package shops;

import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Piano;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {
    Shop shop;
    Guitar guitar;
    Piano piano;
    Trumpet trumpet;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(InstrumentType.STRING, "Yamaha", "BBP34", 950.00, 1350.00, "Bass", 4, "wood");
        trumpet = new Trumpet(InstrumentType.BRASS, "Yamaha", "YTR6335", 1020.00, 1455.00,"Bb");
        piano = new Piano(InstrumentType.STRING, "Yamaha", "GC1", 10000.00, 13000.00, "Upright grand piano");
        shop = new Shop("Bottom dollar blowhard emporium");
    }

    @Test
    public void countStock() {
        assertEquals(0, shop.countStock());
    }

    @Test
    public void addStockItem() {
        shop.addStockItem(piano);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void removeStockItem() {
        shop.addStockItem(piano);
        assertNotNull(shop.removeStockItem(0));
    }
}