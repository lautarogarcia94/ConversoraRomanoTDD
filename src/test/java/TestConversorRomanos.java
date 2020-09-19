import conversor.Conversor;
import conversor.ConversorRomanos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestConversorRomanos {

    @Test
    public void TestConversorN1(){
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("1").equalsIgnoreCase("I"));
    }

    @Test
    public void TestConversorN2(){
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("2").equalsIgnoreCase("II"));
    }

    @Test
    public void TestConversorN3(){
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("3").equalsIgnoreCase("III"));
    }
}
