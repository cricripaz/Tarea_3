package ejercicio3_static;

public class CambioStatic {


    private String msg ;


    public String cambioMoneda(int value , String from , String to){

        if (value < 0){
            msg = "Cantidad Incorrecta";
        }else if (from.contentEquals("dolares")  && to.contentEquals("bs")){

            msg = value * ConvertirMonedaStatic.convert(from, to) + " " + to;

        }else if (from.contentEquals("bs") && to.contentEquals("dolares")){

            msg = value / ConvertirMonedaStatic.convert(from, to) + " " + to;

        }

        return msg;

    }
}
