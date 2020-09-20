import conversor.Conversor;
import conversor.ConversorRomanos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestConversorRomanos {

    @Test
    public void TestConversorN1() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("1").equalsIgnoreCase("I"));
    }

    @Test
    public void TestConversorN2() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("2").equalsIgnoreCase("II"));
    }

    @Test
    public void TestConversorN3() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("3").equalsIgnoreCase("III"));
    }

    @Test
    public void TestConversorN4() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("4").equalsIgnoreCase("IV"));
    }

    @Test
    public void TestConversorN5() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("5").equalsIgnoreCase("V"));
    }

    @Test
    public void TestConversorN6() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("6").equalsIgnoreCase("VI"));
    }

    @Test
    public void TestConversorN7() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("7").equalsIgnoreCase("VII"));
    }

    @Test
    public void TestConversorN8() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("8").equalsIgnoreCase("VIII"));
    }

    @Test
    public void TestConversorN9() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("9").equalsIgnoreCase("IX"));
    }

    @Test
    public void TestConversorN10() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("10").equalsIgnoreCase("X"));
    }

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversor11_19() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("11").equalsIgnoreCase("XI"));
        assertTrue(conversor.convertir("12").equalsIgnoreCase("XII"));
        assertTrue(conversor.convertir("13").equalsIgnoreCase("XIII"));
        assertTrue(conversor.convertir("14").equalsIgnoreCase("XIV"));
        assertTrue(conversor.convertir("15").equalsIgnoreCase("XV"));
        assertTrue(conversor.convertir("16").equalsIgnoreCase("XVI"));
        assertTrue(conversor.convertir("17").equalsIgnoreCase("XVII"));
        assertTrue(conversor.convertir("18").equalsIgnoreCase("XVIII"));
        assertTrue(conversor.convertir("19").equalsIgnoreCase("XIX"));
    }

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversor20_29() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("20").equalsIgnoreCase("XX"));
        assertTrue(conversor.convertir("21").equalsIgnoreCase("XXI"));
        assertTrue(conversor.convertir("22").equalsIgnoreCase("XXII"));
        assertTrue(conversor.convertir("23").equalsIgnoreCase("XXIII"));
        assertTrue(conversor.convertir("24").equalsIgnoreCase("XXIV"));
        assertTrue(conversor.convertir("25").equalsIgnoreCase("XXV"));
        assertTrue(conversor.convertir("26").equalsIgnoreCase("XXVI"));
        assertTrue(conversor.convertir("27").equalsIgnoreCase("XXVII"));
        assertTrue(conversor.convertir("28").equalsIgnoreCase("XXVIII"));
        assertTrue(conversor.convertir("29").equalsIgnoreCase("XXIX"));
    }

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversor30_39() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("30").equalsIgnoreCase("XXX"));
        assertTrue(conversor.convertir("31").equalsIgnoreCase("XXXI"));
        assertTrue(conversor.convertir("32").equalsIgnoreCase("XXXII"));
        assertTrue(conversor.convertir("33").equalsIgnoreCase("XXXIII"));
        assertTrue(conversor.convertir("34").equalsIgnoreCase("XXXIV"));
        assertTrue(conversor.convertir("35").equalsIgnoreCase("XXXV"));
        assertTrue(conversor.convertir("36").equalsIgnoreCase("XXXVI"));
        assertTrue(conversor.convertir("37").equalsIgnoreCase("XXXVII"));
        assertTrue(conversor.convertir("38").equalsIgnoreCase("XXXVIII"));
        assertTrue(conversor.convertir("39").equalsIgnoreCase("XXXIX"));
    }
}
