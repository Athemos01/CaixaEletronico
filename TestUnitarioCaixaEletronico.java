import org.junit.Test;
import static org.junit.Assert.*;

public class TestUnitarioCaixaEletronico {
    
    @Test
    public void testSenhaCorreta() {
        CaixaEletronico caixa = new CaixaEletronico();
        assertTrue(caixa.validar(5562));
    }
    @Test
    public void testSenhaIncorreta(){
        CaixaEletronico caixa = new CaixaEletronico();
        assertFalse(caixa.validar(1234));
    }
    @Test
    public void testretirarSucce(){;
        CaixaEletronico caixa = new CaixaEletronico();
        caixa.depositar(500);
        assertTrue(caixa.retirar(100));
        assertEquals(400,caixa.getSaldo(),0.01);
    }
    @Test
    public void testretirarerro(){
        CaixaEletronico caixa = new CaixaEletronico();
        assertFalse(CaixaEletronico.retirar(500));
        assertEquals(0,caixa.getSaldo(),0.01);
    }
    @Test
    public void testdepositarSucce(){
        CaixaEletronico caixa = new CaixaEletronico();
        assertTrue(caixa.depositar(100));
        assertEquals(100,caixa.getSaldo(),0.01);

    }
}
