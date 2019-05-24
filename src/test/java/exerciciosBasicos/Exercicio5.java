package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio5 {

    /**
     * Exercício 5
     *
     * Média simples de 3 números
     *
     * Faça um programa que calcule a média simples (aritmética) de 3 valores quaisquer.
     */

    @Test
    public void mediaDeSeisSeteEOito() {
        assertEquals(7,media(6,7,8));
    }


    @Test
    public void mediaDeDoisSeteEDez() {
        assertEquals(6,media(2,7,10));
    }


    @Test
    public void mediaDeVinteQuatroENove() {
        assertEquals(11,media(20,4,9));
    }

    private int media(int valor1, int valor2, int valor3) {
        return (valor1 +  valor2 + valor3) / 3;




    }

}
