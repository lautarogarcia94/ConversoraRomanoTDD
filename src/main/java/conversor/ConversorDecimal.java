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
            case "X":
                return "10";
            case"XI":
                return "11";
            case"XII":
                return "12";
        }

        return convertirUnidad(numero);
    }

    public String convertirUnidad(String numero){
        int num = 0;
        if(numero.contains("V")){
            num = 5 + (numero.length()-1);
        }else {
            num = numero.length();
        }

        return ""+num;
    }
}
