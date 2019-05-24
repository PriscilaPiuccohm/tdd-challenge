package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio13 {

    /**
     * Exercício 13
     * <p>
     * Maior que 10
     * <p>
     * Crie uma função que descubra se um valor é maior ou menor que 10.
     */

    @Test
    public void verificaSeDoisEhMaiorQueDez() {

        assertFalse(ehMaiorQueDez(2));
    }


    @Test
    public void verificaSeTrinteEhMaiorQueDez() {

        assertTrue(ehMaiorQueDez(30));
    }


    @Test
    public void verificaSeDozeEhMaiorQueDez() {

        assertTrue(ehMaiorQueDez(12));
    }


    @Test
    public void verificaSeDezEhMaiorQueDez() {

        assertFalse(ehMaiorQueDez(10));
    }

    private boolean ehMaiorQueDez(int numero) {

        if (numero > 10) {
            return true;
        } else {
            return false;

        }

    }
}
