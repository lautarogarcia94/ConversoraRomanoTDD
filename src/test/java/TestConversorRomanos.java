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

    @Test
    public void TestConversorN4(){
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("4").equalsIgnoreCase("IV"));
    }

    @Test
    public void TestConversorN5(){
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("5").equalsIgnoreCase("V"));
    }

    @Test
    public void TestConversorN6(){
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("6").equalsIgnoreCase("VI"));
    }

    @Test
    public void TestConversorN7(){
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("7").equalsIgnoreCase("VII"));
    }

    @Test
    public void TestConversorN8(){
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("8").equalsIgnoreCase("VIII"));
    }

    @Test
    public void TestConversorN9(){
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("9").equalsIgnoreCase("IX"));
    }

    @Test
    public void TestConversorN10(){
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("10").equalsIgnoreCase("X"));
    }

    @Test
    public void TestConversorN11(){
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("11").equalsIgnoreCase("XI"));
    }

    @Test
    public void TestConversorN12(){
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("12").equalsIgnoreCase("XII"));
    }

    @Test
    public void TestConversorN13(){
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("13").equalsIgnoreCase("XIII"));
    }
}
