package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio1 {

    /**
     *  Exercício 1
     *
     *  Trocar o valor de duas variáveis
     *
     *  Escreva um algoritmo que armazene o valor 999 na variável a e o valor 555 na variável b.
     *
     *  A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o valor que está em a passe para b e vice-versa.
     */

    @Test
    public void trocarOValorDeDuasVariaveis() {

        int a = 999;
        int b = 555;

        int armazenador = a;
        a = b;
        b = armazenador;

        assertEquals(555,a);
        assertEquals(999,b);
    }

}
