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
            return agregaLetra(num, "", "I");
        }
        if (num <= 8) {
            return agregaLetra(num-5,"V","I");
        }
        return "";
    }

    private String convertirDecena(int num) {
        if(num == 4){
            return "XL";
        }
        return agregaLetra(num, "", "X");
    }

    private String agregaLetra(int num,String numeroInicial, String numeroAgregar) {
        for (int i = 1; i <= num; i++) {
            numeroInicial += numeroAgregar;
        }
        return numeroInicial;
    }

}

