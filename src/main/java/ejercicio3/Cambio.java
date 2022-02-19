package ejercicio3;

public class Cambio {

    private String msg;

    ConvertirMoneda convertirMoneda;

    public Cambio(){
        convertirMoneda = new ConvertirMoneda();
    }

    public Cambio(ConvertirMoneda objectMockeado){
        convertirMoneda = objectMockeado;
    }

    public String cambioMoneda(int value , String from , String to){

        if (value < 0){
            msg = "Cantidad Incorrecta";
        }else if (from.contentEquals("dolares")  && to.contentEquals("bs")){

            msg = value * convertirMoneda.convert(from, to) + " " + to;

        }else if (from.contentEquals("bs") && to.contentEquals("dolares")){

            msg = value / convertirMoneda.convert(from, to) + " " + to;

        }

        return msg;

    }



}
