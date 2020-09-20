import conversor.Conversor;
import conversor.ConversorDecimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestConversorDecimal {

    private Conversor conversor = new ConversorDecimal();

    @Test
    public void TestConversorN1() {
        assertTrue(conversor.convertir("I").equalsIgnoreCase("1"));
    }
    @Test
    public void TestConversorN2() {
        assertTrue(conversor.convertir("II").equalsIgnoreCase("2"));
    }

    @Test
    public void TestConversorN3() {
        assertTrue(conversor.convertir("III").equalsIgnoreCase("3"));
    }

    @Test
    public void TestConversorN4() {
        assertTrue(conversor.convertir("IV").equalsIgnoreCase("4"));
    }

    @Test
    public void TestConversorN5() {
        assertTrue(conversor.convertir("V").equalsIgnoreCase("5"));
    }

    @Test
    public void TestConversorN6() {
        assertTrue(conversor.convertir("VI").equalsIgnoreCase("6"));
    }
}
