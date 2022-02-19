package cambioTest;

import ejercicio3.Cambio;
import ejercicio3.ConvertirMoneda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CambioMonedaTest {


    ConvertirMoneda convertirMoneda = Mockito.mock(ConvertirMoneda.class);



    // 100 Dolares ----> 700 bs
    @Test
    public void verifyCambioA(){
        Mockito.when(convertirMoneda.convert("dolares","bs")).thenReturn(7);

        Cambio cambio = new Cambio(convertirMoneda);

        String actualResult = cambio.cambioMoneda(100,"dolares","bs");

        String expectedResult = "700 bs";

        Assertions.assertEquals(expectedResult,actualResult,"ERROR");

        Mockito.verify(convertirMoneda).convert("dolares","bs");

    }



    // 350 bs ---> 50 dolares
    @Test
    public void verifyCambioB(){
        Mockito.when(convertirMoneda.convert("bs","dolares")).thenReturn(7);

        Cambio cambio = new Cambio(convertirMoneda);

        String actualResult = cambio.cambioMoneda(350,"bs","dolares");

        String expectedResult = "50 dolares";

        Assertions.assertEquals(expectedResult,actualResult,"ERROR");

        Mockito.verify(convertirMoneda).convert("bs","dolares");

    }


    // Valores Negativos

    @Test
    public void verifyCambioC(){
        Mockito.when(convertirMoneda.convert("bs","dolares")).thenReturn(7);

        Cambio cambio = new Cambio(convertirMoneda);

        String actualResult = cambio.cambioMoneda(-1,"bs","dolares");

        String expectedResult = "Cantidad Incorrecta";

        Assertions.assertEquals(expectedResult,actualResult,"ERROR");

        Mockito.verify(convertirMoneda).convert("bs","dolares");

    }










}
