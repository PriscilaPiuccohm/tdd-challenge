package exerciciosBasicos;

import org.junit.Test;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Exercicio31 {


    @Test
    public void MostrarDate() {
        List<LocalDate> dadev = Arrays.asList(
                LocalDate.of(2019, 06, 07));

        LocalDate hoje = LocalDate.now();

        for (int i = 0; i < dadev.size(); i++) {
            LocalDate dataNoIndice = dadev.get(i);

            if (dataNoIndice.isAfter(hoje)) {
                System.out.println("Data de um ano é " + dataNoIndice);
            }


            System.out.println("Data mais um ano " + dataNoIndice.plusMonths(12));

        }
    }
}
