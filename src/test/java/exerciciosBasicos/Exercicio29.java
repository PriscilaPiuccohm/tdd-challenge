package exerciciosBasicos;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Exercicio29 {

    @Test
    public void contandoVogal() {
        String nome = "filipe";

        System.out.println(vogal(nome));
        assertEquals(3,vogal(nome));

    }

    @Test
    public void contandoVogalComMaiusculo() {

        String nomes = "assertEquals";
        System.out.println(nomes);
        assertEquals(5, vogal(nomes));

    }

    private int vogal(String nomes) {
        int contador = 0;
        final String vogais = "aeiou";

        for (int indice = 0; indice < nomes.length(); indice++) {

            String caracterAtual = String.valueOf(nomes.charAt(indice));

            if (vogais.contains(caracterAtual.toLowerCase())) {
                contador++;
            }
        }

        return contador;
    }
}

