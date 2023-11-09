import org.junit.Test;
import static org.junit.Assert.*;

public class TestUnitarioCaixa {

    @Test
    public void testSenhaCorreta() {
        assertTrue(CaixaEletronico.validar(5562));
    }
    @Test
    public void testSenhaIncorreta(){
        assertFalse(CaixaEletronico.validar(1234));
    }
    @Test
    public void testretirarvalorinsuf(){
        CaixaEletronico.retirar(500);
        assertEquals(0,0);
    }
}
