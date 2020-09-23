package conversor;

/**
 * Clase que implementa la interfaz Conversor, para convertir un numero romano transformarlo en un
 * numero decimal. El numero romano a convertir puede estar indistintamente en mayusculas,
 * minusculas o ambas. El numero mas grande que esta clase puede devolver es el 3999.
 */
public class ConversorDecimal implements Conversor {

    private static final String[] letras = {"", "I", "V", "X", "L", "C", "D", "M"};
    
    @Override
    public String convertir(String paramConvertir) {
        return "" + convertirNumero(paramConvertir, 0);
    }

    /**
     * Metodo con llamada recursiva para trasnformar cada letra en el valor correspondiente, y sumarlos
     * para generar el valor decimal correspondiente. En caso de encontrar una letra de mayor
     * denominacion luego de una de menor denominacion (por ej. "IV", "XL", "XC", etc) realiza un flujo
     * paralelo que realiza la suma que corresponda.
     * Por ejemplo, para convertir el numero XL el algoritmo, en una primera iteracion, genera el numero
     * 10 correspondiente a la X. En la segunda iteracion como sigue una letra de mayor denominacion ("L")
     * que la anterior ("X"), genera el valor 50 correspondiente a la L y le resta 2 veces el valor de X,
     * para generar el numero 30 que sumado al 10 de la primera iteracion da como resultado 40:
     *
     * 1ra iteracion: primera letra es X, e indexAntes apunta a ""  ---> numero = 10
     * 2da iteracion: primera letra es L, e indexAntes apunta a X   ---> numero = 30
     * Resultado:  XL = 10 + 30 = 40
     *
     * IMPORTANTE: En la primera llamada a este metodo se debe colocar como indexAntes el valor 0, que
     *             corresponde al valor letras[0] = ""
     *
     * @param numero String que contiene todas las letras que falta por convertir
     * @param indexAntes indice del Array letras correspondiente a la letra analizada anteriormente
     * @return int numero decimal correspondiente al numero romano
     */
    private int convertirNumero(String numero, int indexAntes) {
        int num;
        if (numero.equals("")) {
            return 0;
        }
        for (int i = 0; i < letras.length; i++) {
            if (numero.substring(0, 1).equalsIgnoreCase(letras[i])) {
                if (indexAntes < i && indexAntes != 0) {
                    num = numeroSuma(i) - 2 * numeroSuma(indexAntes);
                } else {
                    num = numeroSuma(i);
                }
                return num + convertirNumero(numero.substring(1), i);
            }
        }
        return 0;
    }

    /**
     * Metodo que calcula el numero decimal que representa cada letra, tomando como parametro el indice de
     * la posicion en el Array letras[] que ocupa. Para realizar esto, se toma en cuenta las siguientes
     * condiciones:
     *  1) Si el indice es multiplo de 2, entonces el valor a retornar sera un multiplo de 5, sino sera 1
     *     o multiplo de 10.
     *  2) Cada 2 posiciones en el Array, a partir del indice 2, el valor a retornar debe multiplicarse
     *     por 10. Las posiciones 1 y 2 no aplican ninguna multiplicacion; las posiciones 3 y 4 multiplican
     *     por 10. Las posiciones 5 y 6 multiplican por 100; y la posicion 7 multiplica por 1000
     *
     * Por ejemplo:
     * Para el indice 2 correspondiente a la letra V, tenemos que el indice es multiplo de 2,
     * por lo que el valor a retornar sera un multiplo de 5, y como el indice no es mayor que 2, el valor
     * retornado será 5.
     * Para el indice 5 correspondiente a la letra C, el valor retornado no sera multiplo de 5, luego por la
     * segunda condicion será 100.
     *
     *
     * @param index indice del Array letras[] a convertir
     * @return valor equivalente a la letra romana, en numeros decimales
     */
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