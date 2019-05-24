package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio4 {

    /**
     * Exercício 4
     *
     * Antecessor e sucessor de um número qualquer
     */


    @Test
    public void antecessorESucessorDeTres() {

        assertEquals(2,antecessor(3));
        assertEquals(4,sucessor(3));
    }


    @Test
    public void antecessorESucessorDeQuatro() {

        assertEquals(3,antecessor(4));
        assertEquals(5,sucessor(4));
    }


    @Test
    public void antecessorESucessorDeVinte() {

        assertEquals(19,antecessor(20));
        assertEquals(21,sucessor(20));
    }

    private int antecessor(int num1) {

        return num1 -1 ;
    }

    private int sucessor(int numero) {


        return numero +1;
    }

}
