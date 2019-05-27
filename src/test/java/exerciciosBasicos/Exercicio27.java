package exerciciosBasicos;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Exercicio27 {

    @Test
    public void verificaIndice() {


        int maiorVetor = 0;
        int menorVetor = 0;


        List<Integer> vetor = Arrays.asList(7,4,2,9,1,6);


        int maiorindice = maiorVetor(vetor);

      // System.out.println(maiorindice);
        assertEquals(3,maiorindice);




        int menorindice = menorVetor(vetor);

        //System.out.println(menorindice);
        assertEquals(4,menorindice);


    }

    private int menorVetor(List<Integer> vetor) {

        int menor = vetor.get(0);
        int menorIndice = 0;

        for (int i = 0; i < vetor.size(); i++) {

            if (menor > vetor.get(i)) {
                menor = vetor.get(i);
                menorIndice = i;
            }
        }
        return menorIndice;

    }
    private int maiorVetor(List<Integer> vetor) {

        int maior = vetor.get(0);
        int maiorIndice = 0;

        for (int i = 0; i < vetor.size(); i++) {



            if (maior < vetor.get(i)) {
                maior = vetor.get(i);
                maiorIndice = i;
            }
        }

        return maiorIndice;
    }

}











