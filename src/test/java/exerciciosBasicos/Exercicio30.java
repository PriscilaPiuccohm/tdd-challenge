package exerciciosBasicos;

import org.junit.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Exercicio30 {


    public void MostrarDate(List<Integer> dadev) {


        for (int i = 0; i < dadev.size(); i++) {

            Calendar cal = Calendar.getInstance();
            cal.set(2020, 1, 5, 13, 30, 0);

            Date e = cal.getTime();
            System.out.println(e);

        }
    }
    }


