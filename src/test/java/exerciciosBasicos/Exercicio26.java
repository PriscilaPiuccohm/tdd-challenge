package exerciciosBasicos;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Exercicio26 {


    @Test
    public void verificaAsoma() {


        List<Integer> vetor = Arrays.asList(1,2,3,4,5,6);

        int soma = calculaSoma(vetor);

        System.out.println(soma); // igual.saida mensagem do usuario

        assertEquals(21,soma); //igual.saida mensagem do usuario
    }

    @Test
    public void verificaAsoma2() {


        List<Integer> vetor = Arrays.asList(1,2,3);
        assertEquals(6,calculaSoma(vetor));
    }

    private int calculaSoma(List<Integer> vetor) {

        int acumulado = 0;
        for(Integer valor : vetor)
            acumulado = valor + acumulado;
        return acumulado;

        //return vetor.stream().reduce((a,b) -> a+b).get();
    }

}