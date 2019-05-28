package exerciciosBasicos;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
//Invertendo STRING;
public class Exercicio24 {

 @Test
  public void invertendoString(){
     List<String> nome = Arrays.asList("p","r","i","s","c","i","l","a");


     System.out.println(invertendo(nome));
  }

    private List<String> invertendo(List<String> nome) {

        String invertida = "";

        for(int i = nome.size()- 1;i>=0; i --) {

            invertida += String.valueOf(nome.charAt(i));
        }


        return invertida;
 }

}
