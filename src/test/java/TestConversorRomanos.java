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

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversor40_49() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("40").equalsIgnoreCase("XL"));
        assertTrue(conversor.convertir("41").equalsIgnoreCase("XLI"));
        assertTrue(conversor.convertir("42").equalsIgnoreCase("XLII"));
        assertTrue(conversor.convertir("43").equalsIgnoreCase("XLIII"));
        assertTrue(conversor.convertir("44").equalsIgnoreCase("XLIV"));
        assertTrue(conversor.convertir("45").equalsIgnoreCase("XLV"));
        assertTrue(conversor.convertir("46").equalsIgnoreCase("XLVI"));
        assertTrue(conversor.convertir("47").equalsIgnoreCase("XLVII"));
        assertTrue(conversor.convertir("48").equalsIgnoreCase("XLVIII"));
        assertTrue(conversor.convertir("49").equalsIgnoreCase("XLIX"));
    }

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversor50_59() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("50").equalsIgnoreCase("L"));
        assertTrue(conversor.convertir("51").equalsIgnoreCase("LI"));
        assertTrue(conversor.convertir("52").equalsIgnoreCase("LII"));
        assertTrue(conversor.convertir("53").equalsIgnoreCase("LIII"));
        assertTrue(conversor.convertir("54").equalsIgnoreCase("LIV"));
        assertTrue(conversor.convertir("55").equalsIgnoreCase("LV"));
        assertTrue(conversor.convertir("56").equalsIgnoreCase("LVI"));
        assertTrue(conversor.convertir("57").equalsIgnoreCase("LVII"));
        assertTrue(conversor.convertir("58").equalsIgnoreCase("LVIII"));
        assertTrue(conversor.convertir("59").equalsIgnoreCase("LIX"));
    }

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversor60_69() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("60").equalsIgnoreCase("LX"));
        assertTrue(conversor.convertir("61").equalsIgnoreCase("LXI"));
        assertTrue(conversor.convertir("62").equalsIgnoreCase("LXII"));
        assertTrue(conversor.convertir("63").equalsIgnoreCase("LXIII"));
        assertTrue(conversor.convertir("64").equalsIgnoreCase("LXIV"));
        assertTrue(conversor.convertir("65").equalsIgnoreCase("LXV"));
        assertTrue(conversor.convertir("66").equalsIgnoreCase("LXVI"));
        assertTrue(conversor.convertir("67").equalsIgnoreCase("LXVII"));
        assertTrue(conversor.convertir("68").equalsIgnoreCase("LXVIII"));
        assertTrue(conversor.convertir("69").equalsIgnoreCase("LXIX"));
    }

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversor70_79() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("70").equalsIgnoreCase("LXX"));
        assertTrue(conversor.convertir("71").equalsIgnoreCase("LXXI"));
        assertTrue(conversor.convertir("72").equalsIgnoreCase("LXXII"));
        assertTrue(conversor.convertir("73").equalsIgnoreCase("LXXIII"));
        assertTrue(conversor.convertir("74").equalsIgnoreCase("LXXIV"));
        assertTrue(conversor.convertir("75").equalsIgnoreCase("LXXV"));
        assertTrue(conversor.convertir("76").equalsIgnoreCase("LXXVI"));
        assertTrue(conversor.convertir("77").equalsIgnoreCase("LXXVII"));
        assertTrue(conversor.convertir("78").equalsIgnoreCase("LXXVIII"));
        assertTrue(conversor.convertir("79").equalsIgnoreCase("LXXIX"));
    }

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversor80_89() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("80").equalsIgnoreCase("LXXX"));
        assertTrue(conversor.convertir("81").equalsIgnoreCase("LXXXI"));
        assertTrue(conversor.convertir("82").equalsIgnoreCase("LXXXII"));
        assertTrue(conversor.convertir("83").equalsIgnoreCase("LXXXIII"));
        assertTrue(conversor.convertir("84").equalsIgnoreCase("LXXXIV"));
        assertTrue(conversor.convertir("85").equalsIgnoreCase("LXXXV"));
        assertTrue(conversor.convertir("86").equalsIgnoreCase("LXXXVI"));
        assertTrue(conversor.convertir("87").equalsIgnoreCase("LXXXVII"));
        assertTrue(conversor.convertir("88").equalsIgnoreCase("LXXXVIII"));
        assertTrue(conversor.convertir("89").equalsIgnoreCase("LXXXIX"));
    }

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversor90_99() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("90").equalsIgnoreCase("XC"));
        assertTrue(conversor.convertir("91").equalsIgnoreCase("XCI"));
        assertTrue(conversor.convertir("92").equalsIgnoreCase("XCII"));
        assertTrue(conversor.convertir("93").equalsIgnoreCase("XCIII"));
        assertTrue(conversor.convertir("94").equalsIgnoreCase("XCIV"));
        assertTrue(conversor.convertir("95").equalsIgnoreCase("XCV"));
        assertTrue(conversor.convertir("96").equalsIgnoreCase("XCVI"));
        assertTrue(conversor.convertir("97").equalsIgnoreCase("XCVII"));
        assertTrue(conversor.convertir("98").equalsIgnoreCase("XCVIII"));
        assertTrue(conversor.convertir("99").equalsIgnoreCase("XCIX"));
    }

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversor100_199() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("101").equalsIgnoreCase("CI"));
        assertTrue(conversor.convertir("127").equalsIgnoreCase("CXXVII"));
        assertTrue(conversor.convertir("159").equalsIgnoreCase("CLIX"));
        assertTrue(conversor.convertir("163").equalsIgnoreCase("CLXIII"));
        assertTrue(conversor.convertir("184").equalsIgnoreCase("CLXXXIV"));
        assertTrue(conversor.convertir("199").equalsIgnoreCase("CXCIX"));
    }

    //Se juntan los test para mejor lectura del codigo
    @Test
    public void TestConversor200_599() {
        Conversor conversor = new ConversorRomanos();
        assertTrue(conversor.convertir("219").equalsIgnoreCase("CCXIX"));
        assertTrue(conversor.convertir("257").equalsIgnoreCase("CCLVII"));
        assertTrue(conversor.convertir("296").equalsIgnoreCase("CCXCVI"));
        assertTrue(conversor.convertir("329").equalsIgnoreCase("CCCXXIX"));
        assertTrue(conversor.convertir("356").equalsIgnoreCase("CCCLVI"));
        assertTrue(conversor.convertir("381").equalsIgnoreCase("CCCLXXXI"));
        assertTrue(conversor.convertir("406").equalsIgnoreCase("CDVI"));
        assertTrue(conversor.convertir("462").equalsIgnoreCase("CDLXII"));
        assertTrue(conversor.convertir("480").equalsIgnoreCase("CDLXXX"));
        assertTrue(conversor.convertir("531").equalsIgnoreCase("DXXXI"));
        assertTrue(conversor.convertir("583").equalsIgnoreCase("DLXXXIII"));
        assertTrue(conversor.convertir("595").equalsIgnoreCase("DXCV"));
    }

}
