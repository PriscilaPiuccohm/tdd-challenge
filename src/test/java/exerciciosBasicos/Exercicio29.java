package exerciciosBasicos;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Exercicio29 {

    @Test
    public void contandoVogal() {
        String nome = "aeiou";

        List<String> nomes = Arrays.asList("aeiou");

        System.out.println(vogal(nome));

    }

    @Test
    public void contandoVogalComMaiusculo() {

        String nomes = "aeiou";
        System.out.println(nomes);
      //  assertEquals(3, vogal(nome));

    }

    private int vogal(String nomes) {
        int contador = 0;
        String vogais = "aeiou";

        for (int indice = 0; indice < nomes.length(); indice++) {

            String caracterAtual = String.valueOf(nomes.charAt(indice));

            if (vogais.contains(caracterAtual.toLowerCase())) {
                contador++;
            }
        }

        return contador;
    }
}

