package banco;

import org.junit.Assert;
import org.junit.Test;

public class ContaCorrenteTest {

    @Test
    public void testInicializacao1() {
        ContaCorrente conta;
        try {
            conta = new ContaCorrente(null, null);
            assert (false);
        } catch (Exception ex) {
            assert (true);
        }
    }

    @Test
    public void testInicializacao2() {
        ContaCorrente conta;
        try {
            conta = new ContaCorrente(null, 0.0);
            assert (false);
        } catch (Exception ex) {
            assert (true);
        }
    }

    @Test
    public void testInicializacao3() {
        ContaCorrente conta;
        try {
            conta = new ContaCorrente(0.0, null);
            assert (false);
        } catch (Exception ex) {
            assert (true);
        }
    }

    @Test
    public void testInicializacao4() {
        ContaCorrente conta;
        try {
            conta = new ContaCorrente(0.0, -100.0);
            assert (false);
        } catch (Exception ex) {
            assert (true);
        }
    }

    @Test
    public void testAjusteLimite() {
        ContaCorrente conta;
        try {
            conta = new ContaCorrente(0.0, 0.0);
            conta.setLimite(-100.0);
            assert (false);
        } catch (Exception ex) {
            assert (true);
        }
    }

    @Test
    public void testAjusteLimite2() {
        ContaCorrente conta;
        try {
            conta = new ContaCorrente(-50.0, 100.0);
            conta.setLimite(30.0);
            assert (false);
        } catch (Exception ex) {
            assert (true);
        }
    }

    //Testes para impedir limite negativo
    @Test
    public void testDeposito() {
        ContaCorrente conta;
        conta = new ContaCorrente(10.0, 0.0);
        conta.deposito(100.0);
        Assert.assertEquals(110.0, conta.getSaldo(), 0.0001);
    }
    @Test
    public void testDepositosConsecutivos() {
        ContaCorrente conta;
        conta = new ContaCorrente(10.0, 0.0);
        conta.deposito(100.0);
        conta.deposito(50.0);
        conta.deposito(30.0);
        Assert.assertEquals(190.0, conta.getSaldo(), 0.0001);
    }
    
    //Teste de depósito negativo
    
    @Test
    public void testSaque1() {
        ContaCorrente conta;
        conta = new ContaCorrente(100.0, 10.0);
        conta.saque(10.0);
        Assert.assertEquals(90.0, conta.getSaldo(), 0.0001);
    }
    
    @Test
    public void testSaqueQueUsaOLimite() {
        ContaCorrente conta;
        conta = new ContaCorrente(100.0, 50.0);
        conta.saque(110.0);
        Assert.assertEquals(-10.0, conta.getSaldo(), 0.0001);
    }
    
    @Test
    public void testSaqueDepositoLimite() {
        ContaCorrente conta;
        conta = new ContaCorrente(100.0, 50.0);
        conta.saque(110.0);
        conta.deposito(100.0);
        conta.saque(40.0);
        Assert.assertEquals(50.0, conta.getSaldo(), 0.0001);
    }
    
    
    
    

}
