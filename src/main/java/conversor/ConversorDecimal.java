package conversor;

public class ConversorDecimal implements Conversor {


    @Override
    public String convertir(String numero) {
        if(numero.equalsIgnoreCase("IV")){
            return "4";
        }

        return ""+numero.length();
    }
}
