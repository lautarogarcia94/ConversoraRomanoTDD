package conversor;

import java.time.LocalDate;

public class ConversorRomanos implements Conversor {


    public String convertir(String numero) {
        int num = Integer.parseInt(numero);
        return agregarI(num);
    }

    public String agregarI(int num) {
        String numeroRomano = "";
        for (int i = 1; i <= num; i++) {
            numeroRomano += "I";
        }
        return numeroRomano;
    }
}

