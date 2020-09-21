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

    @Test
    public void TestConversorN7() {
        assertTrue(conversor.convertir("VII").equalsIgnoreCase("7"));
    }

    @Test
    public void TestConversorN8() {
        assertTrue(conversor.convertir("VIII").equalsIgnoreCase("8"));
    }

    @Test
    public void TestConversorN9() {
        assertTrue(conversor.convertir("IX").equalsIgnoreCase("9"));
    }

    @Test
    public void TestConversorN10() {
        assertTrue(conversor.convertir("X").equalsIgnoreCase("10"));
    }

    @Test
    public void TestConversorN11() {
        assertTrue(conversor.convertir("XI").equalsIgnoreCase("11"));
    }

    @Test
    public void TestConversorN12() {
        assertTrue(conversor.convertir("XII").equalsIgnoreCase("12"));
    }

    @Test
    public void TestConversorN13() {
        assertTrue(conversor.convertir("XIII").equalsIgnoreCase("13"));
    }

    @Test
    public void TestConversorN14() {
        assertTrue(conversor.convertir("XIV").equalsIgnoreCase("14"));
    }

    @Test
    public void TestConversorN15() {
        assertTrue(conversor.convertir("XV").equalsIgnoreCase("15"));
    }

    @Test
    public void TestConversorN16() {
        assertTrue(conversor.convertir("XVI").equalsIgnoreCase("16"));
    }

    @Test
    public void TestConversorN17() {
        assertTrue(conversor.convertir("XVII").equalsIgnoreCase("17"));
    }

    @Test
    public void TestConversorN18() {
        assertTrue(conversor.convertir("XVIII").equalsIgnoreCase("18"));
    }

    @Test
    public void TestConversorN19() {
        assertTrue(conversor.convertir("XIX").equalsIgnoreCase("19"));
    }

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversorN20_N29() {
        assertTrue(conversor.convertir("XX").equalsIgnoreCase("20"));
        assertTrue(conversor.convertir("XXI").equalsIgnoreCase("21"));
        assertTrue(conversor.convertir("XXII").equalsIgnoreCase("22"));
        assertTrue(conversor.convertir("XXIII").equalsIgnoreCase("23"));
        assertTrue(conversor.convertir("XXIV").equalsIgnoreCase("24"));
        assertTrue(conversor.convertir("XXV").equalsIgnoreCase("25"));
        assertTrue(conversor.convertir("XXVI").equalsIgnoreCase("26"));
        assertTrue(conversor.convertir("XXVII").equalsIgnoreCase("27"));
        assertTrue(conversor.convertir("XXVIII").equalsIgnoreCase("28"));
        assertTrue(conversor.convertir("XXIX").equalsIgnoreCase("29"));
    }

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversorN30_N39() {
        assertTrue(conversor.convertir("XXX").equalsIgnoreCase("30"));
        assertTrue(conversor.convertir("XXXI").equalsIgnoreCase("31"));
        assertTrue(conversor.convertir("XXXII").equalsIgnoreCase("32"));
        assertTrue(conversor.convertir("XXXIII").equalsIgnoreCase("33"));
        assertTrue(conversor.convertir("XXXIV").equalsIgnoreCase("34"));
        assertTrue(conversor.convertir("XXXV").equalsIgnoreCase("35"));
        assertTrue(conversor.convertir("XXXVI").equalsIgnoreCase("36"));
        assertTrue(conversor.convertir("XXXVII").equalsIgnoreCase("37"));
        assertTrue(conversor.convertir("XXXVIII").equalsIgnoreCase("38"));
        assertTrue(conversor.convertir("XXXIX").equalsIgnoreCase("39"));
    }

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversorN40_N49() {
        assertTrue(conversor.convertir("XL").equalsIgnoreCase("40"));
        assertTrue(conversor.convertir("XLI").equalsIgnoreCase("41"));
        assertTrue(conversor.convertir("XLII").equalsIgnoreCase("42"));
        assertTrue(conversor.convertir("XLIII").equalsIgnoreCase("43"));
        assertTrue(conversor.convertir("XLIV").equalsIgnoreCase("44"));
        assertTrue(conversor.convertir("XLV").equalsIgnoreCase("45"));
        assertTrue(conversor.convertir("XLVI").equalsIgnoreCase("46"));
        assertTrue(conversor.convertir("XLVII").equalsIgnoreCase("47"));
        assertTrue(conversor.convertir("XLVIII").equalsIgnoreCase("48"));
        assertTrue(conversor.convertir("XLIX").equalsIgnoreCase("49"));
    }

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversorN50_N59() {
        assertTrue(conversor.convertir("L").equalsIgnoreCase("50"));
        assertTrue(conversor.convertir("LI").equalsIgnoreCase("51"));
        assertTrue(conversor.convertir("LII").equalsIgnoreCase("52"));
        assertTrue(conversor.convertir("LIII").equalsIgnoreCase("53"));
        assertTrue(conversor.convertir("LIV").equalsIgnoreCase("54"));
        assertTrue(conversor.convertir("LV").equalsIgnoreCase("55"));
        assertTrue(conversor.convertir("LVI").equalsIgnoreCase("56"));
        assertTrue(conversor.convertir("LVII").equalsIgnoreCase("57"));
        assertTrue(conversor.convertir("LVIII").equalsIgnoreCase("58"));
        assertTrue(conversor.convertir("LIX").equalsIgnoreCase("59"));
    }

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversorN60_N99() {
        assertTrue(conversor.convertir("LXVI").equalsIgnoreCase("66"));
        assertTrue(conversor.convertir("LXXI").equalsIgnoreCase("71"));
        assertTrue(conversor.convertir("LXXXIX").equalsIgnoreCase("89"));
        assertTrue(conversor.convertir("XCIII").equalsIgnoreCase("93"));
    }

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversor100_199() {
        assertTrue(conversor.convertir("CI").equalsIgnoreCase("101"));
        assertTrue(conversor.convertir("CXXVII").equalsIgnoreCase("127"));
        assertTrue(conversor.convertir("CLIX").equalsIgnoreCase("159"));
        assertTrue(conversor.convertir("CLXIII").equalsIgnoreCase("163"));
        assertTrue(conversor.convertir("CLXXXIV").equalsIgnoreCase("184"));
        assertTrue(conversor.convertir("CXCIX").equalsIgnoreCase("199"));
    }
}
