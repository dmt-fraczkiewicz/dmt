import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class TestApp {
    private PoprawnyKalkulator kalkulator;

    @Before
    public void setUp() {
        kalkulator = new PoprawnyKalkulator();
        assertNotNull(kalkulator);
    }

    @Test
    public void testDodaj() {
        kalkulator = new PoprawnyKalkulator();
        assertEquals(0, kalkulator.dodaj(0, 0));
        assertEquals(3, kalkulator.dodaj(1, 2));
        assertEquals(-3, kalkulator.dodaj(-1, -2));
    }

    @Test
    public void testOdejmij() {
        kalkulator = new PoprawnyKalkulator();
        assertEquals(0, kalkulator.odejmij(0, 0));
        assertEquals(-1, kalkulator.odejmij(1, 2));
        assertEquals(1, kalkulator.odejmij(-1, -2));
    }

    @Test
    public void testPomnoz() {
        kalkulator = new PoprawnyKalkulator();
        assertEquals(0, kalkulator.pomnoz(0, 0));
        assertEquals(2, kalkulator.pomnoz(1, 2));
        assertEquals(2, kalkulator.pomnoz(-1, -2));
    }

    @Test
    public void testPodziel() {
        assertEquals(0, kalkulator.podziel(0, 1));
        assertEquals(2, kalkulator.podziel(4, 2));
        assertEquals(-2, kalkulator.podziel(4, -2));
        assertEquals(-2, kalkulator.podziel(-4, 2));
        assertEquals(2, kalkulator.podziel(-4, -2));
        try {
            kalkulator.podziel(4, 0);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Division by zero", e.getMessage());
        }
    }

    
}
