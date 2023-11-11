import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestFuncional {
    @Test
    public void testFuncional(){
        CaixaEletronico caixa = new CaixaEletronico();

        //teste senha incorreta
        assertFalse(caixa.validar(1234));
        
        //teste validação correta
        assertTrue(caixa.validar(5562));

        //teste depositar
        assertTrue(caixa.validar(5562));
        assertTrue(caixa.depositar(500));
        assertEquals(500,caixa.getSaldo(),0.01);
        
        //teste retirada insuficiente
        assertTrue(caixa.validar(5562));
        assertFalse(caixa.retirar(800));
        assertEquals(500,caixa.getSaldo(),0.01);

        //teste retirada concluida
        assertTrue(caixa.validar(5562));
        assertTrue(caixa.retirar(200));
        assertEquals(300,caixa.getSaldo(), 0.01);

        //teste saldo
        assertEquals(300,caixa.getSaldo(),0.01);

    }
}
