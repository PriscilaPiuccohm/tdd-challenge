package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// contando vogal
public class Exercicio22 {

    @Test
    public void contandoVogal(){

        String nome = "priscila";
        assertEquals (3,vogal(nome));
    }

    @Test
    public void contandoVogalComMaiusculo(){

        String nome = "prIscilA";
        assertEquals (3,vogal(nome));
    }

    private int vogal(String nome) {
        int contador = 0;
        String vogais = "aeiou";

        for(int indice  = 0; indice < nome.length();indice++){

            String caracterAtual = String.valueOf(nome.charAt(indice));

            if(vogais.contains(caracterAtual.toLowerCase())) {
                contador++;
            }
        }

        return contador;
    }


}

