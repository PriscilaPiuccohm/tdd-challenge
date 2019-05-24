package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio2 {

    /**
     * Exercício 2
     * <p>
     * O dobro de um número qualquer
     * <p>
     * Faça uma função para calcular o dobro de um número qualquer.
     */

    @Test
    public void oDobroDeUm() {


        assertEquals(2, dobro(1));
    }




    @Test
    public void oDobroDeDois() {

        assertEquals(4, dobro(2));
    }


    @Test
    public void oDobroDeTres() {

        assertEquals(6, dobro(3));
    }


    @Test
    public void oDobroDeNove() {

        assertEquals(18, dobro(9));
    }


    @Test
    public void oDobroDeQuarenta() {

        assertEquals(80, dobro(40));
    }

    private int dobro( int nume2) {

        return  nume2 * 2;

    }
}
