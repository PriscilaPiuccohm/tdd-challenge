package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercicio20 {
//menor e maior indice do vetor;

    @Test
    public void verificaIndice() {

        int maiorVetor = 0;
        int menorVetor = 0;

        int[] vetor = {0,1, 2, 3, 4, 5};

        int maiorvalor = maiorVetor(vetor);

        assertEquals(5, maiorvalor);

        int menorvalor = menorVetor(vetor);

        assertEquals(0, menorvalor);
    }

    @Test
    public void verificaIndice2() {

        int maiorVetor = 0;
        int menorVetor = 0;

        int[] vetor = {7,10, 5, 9, 20, 4};

        int maiorvalor = maiorVetor(vetor);

        assertEquals(4, maiorvalor);

        int menorvalor = menorVetor(vetor);

        assertEquals(5, menorvalor);
    }

    @Test
    public void verificaIndice3() {

        int maiorVetor = 0;
        int menorVetor = 0;

        int[] vetor = {6, 10, 4, 21, 9};

        int maiorvalor = maiorVetor(vetor);

        assertEquals(3, maiorvalor);

        int menorvalor = menorVetor(vetor);

        assertEquals(2, menorvalor);
    }

    private int menorVetor(int[] vetor) {

        int menor = vetor[0];
        int menorIndice = 0;

        for(int i = 0; i < vetor.length; i++){

            if (menor > vetor[i]) {
                menor = vetor[i];
                menorIndice = i;
            }
        }

        return menorIndice;
    }

    private int maiorVetor(int[] vetor) {

        int maior = vetor[0];
        int meaiorIndice = 0;

        for (int i = 0; i < vetor.length; i++) {



        if (maior < vetor[i]) {
            maior = vetor[i];
            meaiorIndice = i;
        }
    }

        return meaiorIndice;
    }

}






