package conversor;

public class ConversorDecimal implements Conversor {


    @Override
    public String convertir(String numero) {
        numero = numero.toUpperCase();

        return ""+convertirDecena(numero);
    }

    private int convertirUnidad(String numero){
        int num = 0;
        switch (numero) {
            case "IV":
                return 4;
            case "IX":
                return 9;
        }
        if(numero.contains("V")){
            num = 5 + (numero.length()-1);
        }else {
            num = numero.length();
        }

        return num;
    }

    private int convertirDecena(String numero) {
        int num = 0;
        boolean bandera = true;

        if(numero.startsWith("XL")){
            numero = numero.substring(2);
            return 40 + convertirUnidad(numero);
        }
        do {
            if (numero.startsWith("X")) {
                numero = numero.substring(1);
                num += 10;
            } else {
                bandera = false;
            }
        } while (bandera);
      return num + convertirUnidad(numero);


    }


}
