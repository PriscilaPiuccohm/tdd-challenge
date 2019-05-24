package calculadora;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {



    @Test
    public void deveriaSomarDoisValoresPassados() throws Exception {
        int valorA = 1;
        int valorB = 2;
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(valorA, valorB);

        assertEquals(3, soma);
    }

    @Test
    public void deveriaSubtrairDoisValoresPassados() throws Exception {
        Calculadora calculadora = new Calculadora();
        int valorA = 1;
        int valorB = 2;
        int soma = calculadora.subtrai(valorA, valorB);

        assertEquals(-1, soma);
    }

    @Test
    public void deveriaDividirTresValoresPassados() throws Exception {
        int valorA = 6;
        int valorB = 2;
        Calculadora calculadora = new Calculadora();
        int divisao = calculadora.divide(valorA, valorB);

        assertEquals(3, divisao);
    }

    @Test
    public void deveriaDividirDoisValoresPassados() throws Exception {
        int valorA = 6;
        int valorB = 3;
        Calculadora calculadora = new Calculadora();
        int divisao = calculadora.divide(valorA, valorB);

        assertEquals(2, divisao);
    }

    @Test(expected = ArithmeticException.class)
    public void deveriaLancarUmaExcecaoIndicandoFalhaAoDividirUmNumeroPorZero()
            throws Exception {
        int valorA = 6;
        int valorB = 0;
        Calculadora calculadora = new Calculadora();
        calculadora.divide(valorA, valorB);
    }
}



























