import infracao.AutoInfracao;

import java.time.LocalDate;
import java.util.Date;

public class MainApplication {
    public static void main (String[] args) {

        AutoInfracao a = new AutoInfracao();
        a.setDataAutuacao(LocalDate.of(2018,01,03));
        a.setPontos("4-MÉDIA");

        //ld = ld.plusYears(5);


    }
}
