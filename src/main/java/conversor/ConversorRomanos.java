package conversor;

public class ConversorRomanos implements Conversor {


    public String convertir(String numero) {
        int num = Integer.parseInt(numero);

        switch (num) {
            case 4:
                return "IV";
        }
        if (num <= 3) {
            return convertir1a3(num);
        }
        if (num <= 8) {
            return convertir5a8(num);
        }

        return "";
    }

    private String convertir1a3(int num) {
        String numeroRomano = "";
        for (int i = 1; i <= num; i++) {
            numeroRomano += "I";
        }
        return numeroRomano;
    }

    private String convertir5a8(int num) {
        String numeroRomano ="V";
        return numeroRomano + convertir1a3(num-5);
    }

}

