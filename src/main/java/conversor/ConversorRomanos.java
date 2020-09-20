package conversor;

public class ConversorRomanos implements Conversor {

    private static final String[] letras = {"", "I", "V", "X", "L", "C", "D"};

    public String convertir(String numero) {
        int num = Integer.parseInt(numero);
        String numeroRomano = "";
        int n = 0; //cuenta de digitos del numero (empieza la cuenta del digito en 0)
        do {
            numeroRomano = convertirTodo(num % 10, (n * 2) + 1) + numeroRomano;
            n++;
            num = num / 10;
        } while (num > 0);
        return numeroRomano;
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

