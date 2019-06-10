package exerciciosBasicos;

import org.junit.Test;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Exercicio32 {

    @Test
    public void DataFormato() {
    List<LocalDate> hoje = Arrays.asList(
            LocalDate.of(2019, 06, 07));




    LocalDate dia = LocalDate.now();


        for (LocalDate dataNoIndice : hoje) {
            if (dataNoIndice.isAfter(dia)) {
                System.out.println("Data de um ano é " + dataNoIndice);
            }

            //  DateFormat dataNoindice = DateFormat.getDateInstance(); erro
            DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println(formatadorData.format(dia));
            //System.out.println("Data atual com formatação: "+  dataNoIndice.format()); erro


            System.out.println("Data mais um ano " + dataNoIndice.plusMonths(12));


        }
}
}