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
}
