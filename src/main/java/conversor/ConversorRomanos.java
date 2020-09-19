package conversor;

import java.time.LocalDate;

public class ConversorRomanos implements Conversor {


    public String convertir(String numero) {
        String numeroRomano = "";
        switch(numero) {
            case "1":
                numeroRomano = "I";
                break;
            case "2":
                numeroRomano = "II";
                break;
        }
        return numeroRomano;
    }
}
