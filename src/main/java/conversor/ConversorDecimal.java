package conversor;

public class ConversorDecimal implements Conversor {


    @Override
    public String convertir(String numero) {
        numero = numero.toUpperCase();
        return "" + convertirNumero(numero, "");
    }

    private int convertirNumero(String numero, String letraAntes) {

        if (numero.equals("")) {
            return 0;
        }
        switch (numero.substring(0, 1)) {
            case "L":
                if (letraAntes.equals("X")) {
                    return 30 + convertirNumero(numero.substring(1), "L");
                }
                return 50 + convertirNumero(numero.substring(1), "L");
            case "X":
                if (letraAntes.equals("I")) {
                    return 8 + convertirNumero(numero.substring(1), "X");
                }
                return 10 + convertirNumero(numero.substring(1), "X");
            case "V":
                if (letraAntes.equals("I")) {
                    return 3 + convertirNumero(numero.substring(1), "V");
                }
                return 5 + convertirNumero(numero.substring(1), "V");
            case "I":
                return 1 + convertirNumero(numero.substring(1), "I");
        }
        return 0;
    }
}