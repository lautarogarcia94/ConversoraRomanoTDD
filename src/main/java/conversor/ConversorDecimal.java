package conversor;

public class ConversorDecimal implements Conversor {


    @Override
    public String convertir(String numero) {
        numero = numero.toUpperCase();
        return "" + convertirNumero(numero);
    }

    private int convertirNumero(String numero) {
        int num = 0;
        switch (numero) {
            case "IV":
                return 4;
            case "IX":
                return 9;
            case "":
                return 0;
        }

        if (numero.startsWith("XL")) {
            return 40 + convertirNumero(numero.substring(2));
        }

        switch (numero.substring(0, 1)) {
            case "L":
                return 50 + convertirNumero(numero.substring(1));
            case "X":
                return 10 + convertirNumero(numero.substring(1));
            case "V":
                return 5 + convertirNumero(numero.substring(1));
            case "I":
                return 1 + convertirNumero(numero.substring(1));
        }
        return num;
    }
}