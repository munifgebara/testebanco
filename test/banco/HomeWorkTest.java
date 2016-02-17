/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import org.junit.Assert;
import org.junit.Test;

public class HomeWorkTest {

    @Test
    public void test5431() {
        ContaCorrente conta;
        conta = new ContaCorrente(5431.21, 0.0);
        Assert.assertEquals("cinco mil, quatrocentos e trinta e um", conta.metodoX());
    }

    @Test
    public void test1000() {
        ContaCorrente conta;
        conta = new ContaCorrente(1000.00, 0.0);
        Assert.assertEquals("hum mil", conta.metodoX());
    }

}
