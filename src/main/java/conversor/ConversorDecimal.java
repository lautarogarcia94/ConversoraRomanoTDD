package conversor;

public class ConversorDecimal implements Conversor {


    @Override
    public String convertir(String numero) {
        switch (numero){
            case "IV":
                return "4";
            case "V":
                return "5";
            case "VI":
                return "6";
        }

        return ""+numero.length();
    }
}
