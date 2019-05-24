package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercicio19 {


    @Test
    public void verificaAsoma() {

        int[] vetor = {1,2,3,4,5,6};

        int soma = somaVetor(vetor);

        assertEquals(21, soma);
    }

    private int somaVetor(int[] vetor) {

        int acumulado = 0;
        /*for(int i = 0; i < vetor.length; i++){
            acumulado = vetor[i] + acumulado;
        }*/

        //foreach

        for(int valor : vetor) {
            acumulado += valor;
        }

        return acumulado;
    }

}

