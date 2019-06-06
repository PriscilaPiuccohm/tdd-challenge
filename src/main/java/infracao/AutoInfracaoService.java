package infracao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AutoInfracaoService {

    public int calcularAltoInfracao(List<AutoInfracao> autoInfracaos) {


        int acumulador = 0;
        int valor = 0;


        for (int i = 0; i < autoInfracaos.size(); i++) {
            AutoInfracao autoInfracao = autoInfracaos.get(i);
            acumulador = autoInfracao.numeroDePontosGravidade() + acumulador;


        }

        return acumulador;

    }



    public int calcularInfracaosComTresInfracoes (List<AutoInfracao> dataAutuacao ) {
        int acumulador = 0;


        for (int i = 0; i < dataAutuacao.size(); i++) {
            AutoInfracao autoInfracao = dataAutuacao.get(i);
            acumulador = autoInfracao.numeroDePontosGravidade();




        }

        return acumulador;
    }
}


