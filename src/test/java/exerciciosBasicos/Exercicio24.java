package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
//Invertendo STRING;
public class Exercicio24 {

 @Test
  public void invertendoString(){
     String nome = "priscila";
     assertEquals("alicsirp",invertendo(nome));
  }

    @Test
    public void invertendoString2(){
        String nome = "filipe";
        assertEquals("epilif",invertendo(nome));
    }

    private String invertendo(String nome) {

        String invertida = "";

        for(int i = nome.length()- 1;i>=0; i --) {

            invertida += String.valueOf(nome.charAt(i));
        }


        return invertida;
 }

}
