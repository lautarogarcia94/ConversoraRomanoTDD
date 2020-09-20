package conversor;

public class ConversorDecimal implements Conversor {


    @Override
    public String convertir(String numero) {
        switch (numero){
            case "IV":
                return "4";
            case "IX":
                return "9";
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
