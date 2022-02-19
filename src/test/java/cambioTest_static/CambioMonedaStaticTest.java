package cambioTest_static;

import ejercicio3_static.CambioStatic;
import ejercicio3_static.ConvertirMonedaStatic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class CambioMonedaStaticTest {


    CambioStatic cambioStatic = new CambioStatic();

    @BeforeAll
    public static void before(){
        MockedStatic<ConvertirMonedaStatic> mocked = Mockito.mockStatic(ConvertirMonedaStatic.class);
        mocked.when(()-> ConvertirMonedaStatic.convert("dolares","bs")).thenReturn(7);
        mocked.when(()-> ConvertirMonedaStatic.convert("bs","dolares")).thenReturn(7);
        mocked.when(()-> ConvertirMonedaStatic.convert("dolares","bs")).thenReturn(7);


    }



    @Test
    public void verifyCambioA(){
        Assertions.assertEquals("700 bs",cambioStatic.cambioMoneda(100,"dolares","bs"),"ERROR");
    }

    @Test
    public void verifyCambioB(){
        Assertions.assertEquals("50 dolares",cambioStatic.cambioMoneda(350,"bs","dolares"),"ERROR");
    }

    @Test
    public void verifyCambioC(){
        Assertions.assertEquals("Cantidad Incorrecta",cambioStatic.cambioMoneda(-100,"dolares","bs"),"ERROR");
    }
}
