package exerciciosBasicos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class Exercicio18 {

    @Test
    public void verificaAsequencia() {

        List<Integer> vetor = carregarVetor(5);

        assertEquals(1, vetor.get(0).intValue());
        assertEquals(2, vetor.get(1).intValue());
        assertEquals(3, vetor.get(2).intValue());
        assertEquals(4, vetor.get(3).intValue());
        assertEquals(5, vetor.get(4).intValue());
    }

    private List<Integer> carregarVetor(int tamanhoMaximo) {


        List<Integer> vetorres = new ArrayList<>();

        for (int i = 0; i < tamanhoMaximo; i++) {

            vetorres.add(i+1);

        }

        return vetorres;

    }

}












