package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio16 {

    /**
     * Exercício 16
     * <p>
     * Número primo
     * <p>
     * Faça um programa para identificar se um número é primo.
     * <p>
     * Lembre-se que número primo, é um número natural, maior que 1, apenas divisível por si próprio e pela unidade.
     * <p>
     * Dica: Implementar primeiro a função que descobre se é divisão exata e utilizar essa função para descobrir se um número é primo ou não
     */

    @Test
    public void verificaSeTresDivididoPorUmEhExato() {

        assertTrue(ehDivisaoExata(3, 1));
    }


    @Test
    public void verificaSeTresDivididoPorTresEhExato() {

        assertTrue(ehDivisaoExata(3, 3));
    }


    @Test
    public void verificaSeTresDivididoPorDoisEhExato() {

        assertFalse(ehDivisaoExata(3, 2));
    }


    @Test
    public void doisEhPrimo() {

        assertTrue(ehPrimo(2));
    }


    @Test
    public void tresEhPrimo() {

        assertTrue(ehPrimo(3));
    }


    @Test
    public void quatroEhPrimo() {

        assertFalse(ehPrimo(4));
    }


    @Test
    public void cincoEhPrimo() {

        assertTrue(ehPrimo(5));
    }


    @Test
    public void seisEhPrimo() {

        assertFalse(ehPrimo(6));
    }


    @Test
    public void seteEhPrimo() {

        assertTrue(ehPrimo(7));
    }

    @Test
    public void oitoEhPrimo() {

        assertFalse(ehPrimo(8));
    }


    @Test
    public void noveEhPrimo() {

        assertFalse(ehPrimo(9));
    }


    @Test
    public void dezEhPrimo() {

        assertFalse(ehPrimo(10));
    }


    @Test
    public void onzeEhPrimo() {

        assertTrue(ehPrimo(11));
    }


    @Test
    public void dozeEhPrimo() {

        assertFalse(ehPrimo(12));
    }

    @Test
    public void trezeEhPrimo() {

        assertTrue(ehPrimo(13));
    }

    // Função que descobre se o número é ou não primo.
    private boolean ehPrimo(int num) {
        /*int i, quantDivi = 0;

        for(i = 1; i <= num; i++) {
            if (ehDivisaoExata(num, i)) {
                quantDivi++;
            }
        }

        if (quantDivi == 2) {
            return true;
        } else {
            return false;
        }*/

        for (int i = (num -1); i > 1 ; i--) {
            if (ehDivisaoExata(num,i)) {
                return false;
            }
        }
        return true;
    }

        // Função que descobre se dois números possuem divisão exata.
        private boolean ehDivisaoExata ( int dividendo, int divisor){
            return (dividendo % divisor) == 0;


        }

    }




