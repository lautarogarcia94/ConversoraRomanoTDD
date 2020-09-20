package conversor;

public class ConversorDecimal implements Conversor {


    @Override
    public String convertir(String numero) {
        switch (numero){
            case "I":
                return "1";
            case "II":
                return "2";
        }
        return "0";
    }
}
