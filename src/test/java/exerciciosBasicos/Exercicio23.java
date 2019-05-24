package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Exercicio23 {


    @Test
    public void compara() {

        String nome = "filipe";
        String nome2 = "filipe";

        assertTrue(comparaStrings(nome,nome2));

    }

    public boolean comparaStrings(String string1,String string2) {

        //string1.equals(string2);
        return string1.equals(string2);
    }
}
