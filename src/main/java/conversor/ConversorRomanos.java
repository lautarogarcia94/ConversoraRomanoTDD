package conversor;

public class ConversorRomanos implements Conversor {


    public String convertir(String numero) {
        int num = Integer.parseInt(numero);
        String unidad = convertirUnidad(num % 10);
        String decena = convertirDecena(num / 10);

        return decena + unidad;
    }

    private String convertirUnidad(int num) {
        switch (num) {
            case 4:
                return "IV";
            case 9:
                return "IX";
        }
        if (num <= 3) {
            return agregaUnidad(num, "");
        }
        if (num <= 8) {
            return agregaUnidad(num-5,"V");
        }
        return "";
    }

    private String convertirDecena(int num) {
        switch (num){
            case 1:
                return"X";
            case 2:
                return "XX";
        }
        return "";
    }

    private String agregaUnidad(int num,String numeroRomano) {
        for (int i = 1; i <= num; i++) {
            numeroRomano += "I";
        }
        return numeroRomano;
    }

}

