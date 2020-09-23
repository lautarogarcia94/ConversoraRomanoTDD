package conversor;

/**
 * Clase que implementa la interfaz Conversor, para convertir un numero decimal en un
 * numero romano. El numero decimal a convertir debe ser ingresado como String. El
 * numero romano devuelto siempre estara en mayusculas.
 * El numero mas grande que esta clase puede devolver es el 3999.
 */
public class ConversorRomanos implements Conversor {

    private static final String[] letras = {"", "I", "V", "X", "L", "C", "D", "M"};

    /**
     * Metodo que recorre el numero decimal a convertir, digito por digito, de derecha
     * a izquierda. La o las letras correspondientes a cada digito decimal, las concatena
     * a la izquierda del String que arma el numero romano.
     *
     * @param paramConvertir parametro del tipo String
     * @return String que contiene el numero romano correspondiente
     * @throws NumberFormatException Cuando no sea posible trasnformar el String
     *                               paramConvertir a un int.
     */
    public String convertir(String paramConvertir) throws NumberFormatException {
        int num;
        try {
            num = Integer.parseInt(paramConvertir.trim());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Dato ingresado no valido");
        }
        String numeroRomano = "";
        int n = 0; //cuenta de digitos del numero (empieza la cuenta del digito en 0)
        do {
            numeroRomano = convertirDigito(num % 10, (n * 2) + 1) + numeroRomano;
            n++;
            num = num / 10;
        } while (num > 0);
        return numeroRomano;
    }

    /**
     * Retorna la/s letra/s correspondientes al digito pasado como parametro, teniendo en
     * cuenta el indice del Array letras[]. Si el digito es 4, y el indice es 1, el valor
     * retornado sera:
     * *  letras[1] + letras[2] = IV
     * <p>
     * Si el digito no es 4 o 9 (casos especiales), se deja la logica de la asignacion al
     * metodo agregaLetra().
     *
     * @param digito digito a convertir
     * @param index  indice del Array letras[] que se toma como referencia para agregar la letra,
     *               tiene relacion con la posicion del digito en el numero decimal (Unidad,
     *               Decena, etc)
     * @return String que contiene la/s letra/s correspondientes al numero romano
     */
    private String convertirDigito(int digito, int index) {
        switch (digito) {
            case 4:
                return letras[index] + letras[index + 1];
            case 9:
                return letras[index] + letras[index + 2];
        }
        if (digito <= 3) {
            return agregaLetra(digito, 0, index);
        }
        if (digito <= 8) {
            return agregaLetra(digito - 5, index + 1, index);
        }
        return "";
    }

    /**
     * Tomando como referencia el Array letras[], y los indices pasados por parametros,
     * forma el String correspondiente al numero romano.
     *
     * @param digito       numero a convertir
     * @param indexInicial indice de la letra que inicia el numero romano
     * @param indexAgregar indice de la letra que se "suma" para formar el numero romano
     * @return String con las letras correspondientes al digito pasado por parametro
     */
    private String agregaLetra(int digito, int indexInicial, int indexAgregar) {
        String numeroRomano = letras[indexInicial];
        for (int i = 1; i <= digito; i++) {
            numeroRomano += letras[indexAgregar];
        }
        return numeroRomano;
    }

}

