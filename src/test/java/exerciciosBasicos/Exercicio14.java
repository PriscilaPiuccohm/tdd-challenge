package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio14 {

    /**
     * Exercício 14
     *
     * Equação de 2 grau
     *
     * Utilizando funções, faça um programa que calcule as raízes da equação do 2 grau conforme a fórmula de Bhaskara.
     *
     * Lembrando:
     *
     * ax(2) + bx + c = 0
     *
     * delta = (Δ = b2 - 4.a.c)
     * x1    = ( (-b + √Δ)/2a)
     * x2    = ( (-b - √Δ)/2a)
     *
     *
     * Dica:
     *
     * Para potência de dois de um numero pode utilizar:
     *
     * Math.pow(numero,2)
     *
     * Para raiz quadrada de um numero utilizar:
     *
     *  Math.sqrt(numero)
     *
     *
     */

    @Test
    public void calcularRaizesDeUmZeroEMenosDezeseis() {

        int a, b, c;

        a = 1; b = 0; c = -16;


        assertEquals(64,delta(a, b, c),0);
        assertEquals(4,raiz1(a, b, c),0);
        assertEquals(-4,raiz2(a, b, c),0);
    }


    @Test
    public void calcularRaizesDeZeroDoisEUm() {

        int a, b, c;

        a = 0; b = 2; c = 1;


        assertEquals(4,delta(a, b, c),0);
        assertEquals(0,raiz1(a, b, c),0);
        assertEquals(0,raiz2(a, b, c),0);
    }


    @Test
    public void calcularRaizes() {

        int a, b, c;

        a = 2; b = 1; c = 0;


        assertEquals(1,delta(a, b, c),0);
        assertEquals(0,raiz1(a, b, c),0);
        assertEquals(-2,raiz2(a, b, c),0);
    }

    // Retorna o valor de delta
    private double delta(int a, int b, int c) {

        return b * b -4 * a * c;

    }

    // Retorna o valor da primeira raiz
    private double raiz1(int a, int b, int c) {

        return (-b + Math.sqrt(delta(a, b, c))) / 2 * a;
    }

    // Retorna o valor da segunda raiz
    private double raiz2(int a, int b, int c) {

        return (-b - Math.sqrt(delta(a, b, c))) / 2 * a;
    }

}
