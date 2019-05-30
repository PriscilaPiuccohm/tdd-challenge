package exerciciosBasicos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
//Invertendo STRING;
public class Exercicio24 {

    @Test
    public void invertendoString() {
        List<String> nome = Arrays.asList("p", "r", "i", "s", "c", "i", "l", "a");
        System.out.println(invertendo(nome));

        String nomeStr = "priscila";
        System.out.println(inverteString(nomeStr));

        assertEquals("alicsirp",inverteString(nomeStr));
    }
        private List<String> invertendo(List<String> nome) {

            List<String> valor = new ArrayList<>();

           for(int i = nome.size()- 1;i >=0; i --) {

            valor.add(String.valueOf( nome.get(i)));
         }
         return valor;
    }

    private String inverteString(String nome) {
        String valor = "";

        for(int i = nome.length()- 1;i >=0; i --) {

            valor += String.valueOf( nome.charAt(i));
        }
        return valor;
    }



}

