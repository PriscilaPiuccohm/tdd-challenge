package exerciciosBasicos;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Exercicio32 {

    @Test
    public void DataEscrita() {
    List<LocalDate> hoje = Arrays.asList(
            LocalDate.of(2019, 06, 07));

    LocalDate dia = LocalDate.now();


    for(int i = 0; i < hoje.size(); i++) {
    LocalDate dataNoIndice = hoje.get(i);

        if (dataNoIndice.isAfter(dia)){
            System.out.println("Data de um ano é " + dataNoIndice);
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hojeFormatado = hoje.toString();

        System.out.println("Data mais um ano " + dataNoIndice.plusMonths(12)+ hojeFormatado);



    }
}
}