package infracao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AutoInfracaoService {

    public int somarPontosPessoa(List<AutoInfracao> autoInfracaos) {


        int acumulador = 0;
        int valor = 0;


        for (int i = 0; i < autoInfracaos.size(); i++) {
            AutoInfracao autoInfracao = autoInfracaos.get(i);
            acumulador = autoInfracao.numeroDePontosGravidade() + acumulador;


        }

        return acumulador;

    }



    public int somarPontosPessoaPorAno (List<AutoInfracao> autoInfracoes){

        LocalDate dataAutuacao;
        int acumulador = 0;


        for (int i = 0; i < autoInfracoes.size(); i++) {

         Calendar cal = Calendar.getInstance();
         cal.set(Calendar.YEAR,2020);
         cal.set(Calendar.MONDAY, 1); // mes fevereiro  06:35


        }

        return acumulador;
    }
}


