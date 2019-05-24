package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio8 {

    /**
     * Exercício 8
     *
     * Funções para as 4 operações aritméticas
     *
     * Escreva uma função para cada uma das quatro operações matemáticas simples:
     *
     * adição,
     * subtração,
     * multiplicação e
     * dividisão
     *
     */

    @Test
    public void quatroOperacoesSobreDezEDois() {

        assertEquals(12,somar(10,2));
        assertEquals(8,subtrair(10,2));
        assertEquals(20,multiplicar(10,2));
        assertEquals(5,dividir(10,2));
    }


    @Test
    public void quatroOperacoesSobreDozeESete() {

        assertEquals(21,somar(14,7));
        assertEquals(7,subtrair(14,7));
        assertEquals(98,multiplicar(14,7));
        assertEquals(2,dividir(14,7));
    }

    private int somar(int valor1, int valor2) {



        return valor1 + valor2;
    }

    private int subtrair(int valor1, int valor2) {

        return  valor1 - valor2;
    }

    private int multiplicar(int valor1, int valor2) {

        return valor1 *  valor2;
    }

    private int dividir(int valor1, int valor2) {

        return valor1 / valor2;
    }

}
