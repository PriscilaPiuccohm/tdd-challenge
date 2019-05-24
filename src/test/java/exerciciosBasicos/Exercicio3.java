package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio3 {

    /**
     * Exercício 3
     *
     * Área de um retângulo
     *
     * Sabendo que a área de um retângulo é base x altura, faço uma função que calcule a área de um retângulo
     */


    @Test
    public void calcularAreaDoRetanguloTresPorNove() {

        assertEquals(27, calcularArea(3,9));
    }


    @Test
    public void calcularAreaDoRetanguloTresPorTres() {

        assertEquals(9, calcularArea(3,3));
    }


    @Test
    public void calcularAreaDoRetanguloDoisPorNove() {

        assertEquals(18, calcularArea(2,9));
    }


    @Test
    public void calcularAreaDoRetanguloQuatroPorCinco() {

        assertEquals(20, calcularArea(4,5));
    }

    private int calcularArea(int base, int altura) {



        return  base * altura;


    }


}
