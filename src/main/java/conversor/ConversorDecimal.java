package conversor;

public class ConversorDecimal implements Conversor {


    @Override
    public String convertir(String numero) {
        numero = numero.toUpperCase();
        switch (numero){
            case "IV":
                return "4";
            case "IX":
                return "9";
            case "XIV":
                return "14";
            case "XIX":
                return "19";
        }
        return ""+convertirDecena(numero);
    }

    private int convertirUnidad(String numero){
        int num = 0;
        if(numero.contains("V")){
            num = 5 + (numero.length()-1);
        }else {
            num = numero.length();
        }

        return num;
    }

    private int convertirDecena(String numero){
        int num = 0;
        if(numero.contains("X")){
            num = convertirUnidad(numero.substring(1));
            return num+10 ;
        }else{
            return convertirUnidad(numero);
        }
    }
}
