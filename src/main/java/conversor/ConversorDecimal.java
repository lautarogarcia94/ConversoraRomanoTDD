package conversor;

public class ConversorDecimal implements Conversor {

    private static final String[] letras = {"", "I", "V", "X", "L", "C", "D"};

    @Override
    public String convertir(String numero) {
        return "" + convertirNumero(numero, 0);
    }

    private int convertirNumero(String numero, int indexAntes) {
        int num;
        if (numero.equals("")) {
            return 0;
        }
        for (int i = 0; i < letras.length; i++) {
            if (numero.substring(0, 1).equalsIgnoreCase(letras[i])) {
                if (indexAntes < i && indexAntes != 0) {//verifica si el numero anterior era menor que el actual, por ej: IV, XL
                    num = numeroSuma(i) - 2 * numeroSuma(indexAntes); //resta 2*anterior en caso de ser necesario (para formar el numero real)
                } else {
                    num = numeroSuma(i);
                }
                return num + convertirNumero(numero.substring(1), i);
            }
        }
        return 0;
    }

    private int numeroSuma(int index) {
        int num;
        if (index % 2 == 0) {
            num = 5;
        } else {
            num = 1;
        }
        while (index > 2) {
            num *= 10;
            index -= 2;
        }
        return num;
    }

}