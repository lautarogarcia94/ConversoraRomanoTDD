package conversor;

public class ConversorDecimal implements Conversor {


    @Override
    public String convertir(String numero) {
        numero = numero.toUpperCase();

        return "" + convertirDecena(numero);
    }

    private int convertirUnidad(String numero) {
        int num = 0;
        switch (numero) {
            case "IV":
                return 4;
            case "IX":
                return 9;
            case "":
                return 0;
        }

        switch (numero.substring(0, 1)) {
            case "V":
                return 5 + convertirUnidad(numero.substring(1));
            case "I":
                return 1 + convertirUnidad(numero.substring(1));
        }
        return num;
    }

    private int convertirDecena(String numero) {
        int num = 0;
        boolean bandera = true;


        if (numero.startsWith("XL")) {
            numero = numero.substring(2);
            return 40 + convertirUnidad(numero);
        } else if (numero.equalsIgnoreCase("")) {
            return 0;
        }

        switch (numero.substring(0, 1)) {
            case "L":
                return 50 + convertirDecena(numero.substring(1));
            case "X":
                return 10 + convertirDecena(numero.substring(1));
            default:
                return convertirUnidad(numero);
        }
       /* do {
            if (numero.startsWith("X")) {
                numero = numero.substring(1);
                num += 10;
            } else {
                bandera = false;
            }
        } while (bandera);
      return num + convertirUnidad(numero);*/
    }
}