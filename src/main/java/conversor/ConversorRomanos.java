package conversor;

public class ConversorRomanos implements Conversor {

    private static final String[] letras = {"", "I", "V", "X", "L"};

    public String convertir(String numero) {
        int num = Integer.parseInt(numero);
        String unidad = convertirTodo(num % 10, 1);
        String decena = convertirTodo(num / 10, 3);
        return decena + unidad;
    }

    private String convertirTodo(int num, int index) {
        switch (num) {
            case 4:
                return letras[index] + letras[index + 1];
            case 9:
                return letras[index] + letras[index + 2];
        }
        if (num <= 3) {
            return agregaLetra(num, 0, index);
        }
        if (num <= 8) {
            return agregaLetra(num - 5, index + 1, index);
        }
        return "";
    }

    private String agregaLetra(int num, int indexInicial, int indexAgregar) {
        String numeroRomano = letras[indexInicial];
        for (int i = 1; i <= num; i++) {
            numeroRomano += letras[indexAgregar];
        }
        return numeroRomano;
    }

}

