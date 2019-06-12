package infracao;

import java.time.LocalDate;
import java.util.List;

public class AutoInfracaoService {

    public int somarPontosPessoa(List<AutoInfracao> autoInfracoes) {


        int acumulador = 0;


        for (AutoInfracao autoInfracao : autoInfracoes) {
            acumulador += autoInfracao.numeroDePontosGravidade();


        }

        return acumulador;

    }

    public int somarPontosPessoaPorAno(List<AutoInfracao> autoInfracoes, LocalDate dataInicial) {

        int acumuladores = 0;

        for(AutoInfracao autoInfracao : autoInfracoes){
            acumuladores +=autoInfracao.somarPontoss();

        }


        return acumuladores;
    }


}




