package oi.ylondono.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperacionesTest {

    private Operaciones op;

    @Before
    public void setup() {
        op = new Operaciones();
    }

    @Test
    public void sumaTest() {
        Assert.assertEquals("la suma no es igual", 11, op.sumar(5,6));

    }
    @Test
    public void restaTest() {
        Assert.assertEquals("la resta no es igual", 1, op.resta(6,5));

    }
    @Test
    public void divicionTest() {
        Assert.assertEquals("la suma no es igual", 5, op.dividir(10,2));

    }
    @Test
    public void multiTest() {
        Assert.assertEquals("la suma no es igual", 10, op.multiplicar(5,2));

    }

}
