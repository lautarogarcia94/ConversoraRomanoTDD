package conversor;

public class ConversorDecimal implements Conversor {


    @Override
    public String convertir(String numero) {

        return ""+numero.length();
    }
}
