package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio15 {

    /**
     * Exercício 15
     * <p>
     * Somar dígitos
     * <p>
     * Faça um programa para somar os dígitos de um inteiro
     * <p>
     * Sem utilizar recursos de string, ou seja, trabalhe apenas com tipos numéricos.
     * <p>
     * Somar dígitos significa que dados um número qualquer, exemplo, 2015, devemos somar seus dígitos:
     * <p>
     * 2  +  0 +  1 +  5
     * O resultado esperado para o número acima seria 8.
     * <p>
     * <p>
     * Dica1: Você pode utilizar o operador módulo (%) de 10 para pegar o algarismo mais à direita de um número
     * Dica2: Treinar operador de loop neste exercício
     */

    @Test
    public void somarDigitosDeUm() {

        assertEquals(1, somarDigitos(1));
    }


    @Test
    public void somarDigitosDeVinteEDois() {

        assertEquals(4, somarDigitos(22));
    }


    @Test
    public void somarDigitosDeQuarentaEUm() {

        assertEquals(5, somarDigitos(41));
    }


    @Test
    public void somarDigitosDeCentoENoventaEQuatro() {

        assertEquals(14, somarDigitos(194));
    }


    @Test
    public void somarDigitosDeDoisMilEQuinze() {

        assertEquals(8, somarDigitos(2015));
    }

    private int somarDigitos(int numero) {
   int soma = 0;
        while (numero != 0) {
            soma += numero % 10;
            numero  = (numero / 10);


        }

        return soma;
    }

}