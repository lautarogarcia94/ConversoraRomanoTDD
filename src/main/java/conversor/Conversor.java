package conversor;

/**
 * Interfaz generada para crear diversas clases que conviertan un dato de tipo String en otro. Inicialmente
 * fue pensada para crear un conversor de numeros decimales a numeros romanos. Luego, se agrego otro conversor
 * de numeros romanos a numeros decimales.
 * Dado que se utiliza la Estructura de estas clases y la interfaz como un patron Strategy, se puede generar
 * cualquier otra clase que tenga como tarea principal realizar una conversion de un valor en otro.
 */
public interface Conversor {

    /**
     * Metodo encargado de realizar la conversion en cuestion.
     *
     * @param paramConvertir parametro del tipo String
     * @return parametro convertido. El tipo retornado es String
     */
    String convertir(String paramConvertir);
}
