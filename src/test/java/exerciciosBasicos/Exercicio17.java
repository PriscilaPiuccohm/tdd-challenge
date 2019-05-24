package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Exercicio17 {

    @Test
    public void verificaAsequencia() {

        int[] vetor = carregarVetor(5);

        assertEquals(1, vetor[0]);
        assertEquals(2, vetor[1]);
        assertEquals(3, vetor[2]);
        assertEquals(4, vetor[3]);
        assertEquals(5, vetor[5]);
    }

    private int[] carregarVetor(int numeroMaximo) {


        int[] vetorres = new int[numeroMaximo];


        for (int i = 0; i < vetorres.length; i++) {

            vetorres[i] = i+1;

        }

        return vetorres;
    }

}












