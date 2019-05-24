package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// contar String
public class Exercicio21 {

    @Test
    public void contandoLetras() {

        String nome = "priscila";

        char[] letras = {'p', 'r', 'i', 's', 'c', 'i', 'l', 'a'};

        assertEquals(8, contando(letras));
        assertEquals(8, contando(nome));
    }

    private int contando(String letras) {
        int contador = 0;

        for (int i = 0; i < letras.length(); i++) {
            contador++;
        }

        return contador;

        //return letras.length();
    }

    private int contando(char[] letra) {

        /*int contador = 0;

        for (int i = 0; i < letra.length; i++) {
            contador++;
        }

        return contador;*/

        return letra.length;
    }

}

