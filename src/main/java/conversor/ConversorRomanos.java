package conversor;

public class ConversorRomanos implements Conversor {


    public String convertir(String numero) {
        int num = Integer.parseInt(numero);
        switch (num){
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
        }
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

