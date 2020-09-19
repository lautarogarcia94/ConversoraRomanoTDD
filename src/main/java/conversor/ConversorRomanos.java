package conversor;

public class ConversorRomanos implements Conversor {


    public String convertir(String numero) {
        int num = Integer.parseInt(numero);
        if(num==4){
            return "IV";
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

