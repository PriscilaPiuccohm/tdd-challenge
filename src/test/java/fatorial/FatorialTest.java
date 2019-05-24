package fatorial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class FatorialTest {

    protected Fatorial fatorial;


    @Test
    public void calcularFatorialDeZero() throws FatorialNumeroNegativoException {
        assertEquals(1, fatorial.calcularFatorial(0));
    }

    @Test
    public void calcularFatorialDeUm() throws FatorialNumeroNegativoException {
        assertEquals(1, fatorial.calcularFatorial(1));
    }

    @Test
    public void calcularFatorialDeDois() throws FatorialNumeroNegativoException {
        assertEquals(2, fatorial.calcularFatorial(2));
    }


    @Test
    public void calcularFatorialDeTres() throws FatorialNumeroNegativoException {
        assertEquals(6, fatorial.calcularFatorial(3));
    }


    @Test
    public void calcularFatorialDeQuatro() throws FatorialNumeroNegativoException {
        assertEquals(24, fatorial.calcularFatorial(4));
    }


    @Test
    public void calcularFatorialDeCinco() throws FatorialNumeroNegativoException {
        assertEquals(120, fatorial.calcularFatorial(5));
    }


    @Test
    public void calcularFatorialDeSeis() throws FatorialNumeroNegativoException {
        assertEquals(720, fatorial.calcularFatorial(6));
    }


    @Test
    public void calcularFatorialDeSete() throws FatorialNumeroNegativoException {
        assertEquals(5040, fatorial.calcularFatorial(7));
    }


    @Test(expected = FatorialNumeroNegativoException.class)
    public void calcularFatorialDeNumeroNegativo() throws FatorialNumeroNegativoException {
        fatorial.calcularFatorial(-2);
    }
}