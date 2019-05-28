package exerciciosBasicos;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class exercicio28 {

    @Test
    public void contandoLetras() {


        String nome = "Priscila";

        List<String> nomes = Arrays.asList("p", "r", "i", "s", "c", "i", "l", "a");

       // System.out.println(nome);
        assertEquals(8,contandos(nomes));

       // System.out.println(contandos(nomes));

    }


    private int contando(List<String> nomes) {

        int contador = 0;

        for (int i = 0; i < nomes.size(); i++) {
            contador++;
        }

        return contador;
    }

    private int contandos(List<String> nome) {

        int contador = 0;

        for (int i = 0; i < nome.size(); i++) {
            contador++;
        }

        return contador;

    }
}
