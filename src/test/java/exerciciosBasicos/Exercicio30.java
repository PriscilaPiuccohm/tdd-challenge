package exerciciosBasicos;

import org.junit.Test;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Exercicio30 {

    @Test
    public void MostrarDate() {
        List<LocalDate> dadev = Arrays.asList(
                LocalDate.of(2018,05,11),
                LocalDate.of(2020,07,11)
        );

        LocalDate hoje = LocalDate.now();

        for (int i = 0; i < dadev.size(); i++) {
            LocalDate dataNoIndice = dadev.get(i);

            if (dataNoIndice.isAfter(hoje)) {
                System.out.println("Data é dois de hoje "+dataNoIndice);
            } else {
                System.out.println("Data é antes de hoje "+dataNoIndice);
            }

            System.out.println("Data mais um ano "+ dataNoIndice.plusYears(1));

        }
    }

    public void metodo() {

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now();

        boolean after = date1.isAfter(date2); // depois ?
        boolean before = date1.isBefore(date2); // antes ?

    }
}


