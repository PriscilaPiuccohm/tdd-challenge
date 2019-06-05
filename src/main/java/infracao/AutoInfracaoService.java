package infracao;

import java.util.ArrayList;
import java.util.List;

public class AutoInfracaoService {

    public int calcularAltoInfracao(List<AutoInfracao> autoInfracaos) {


        int acumulador = 0;
        int valor = 0;


        for (int i = 0; i < autoInfracaos.size(); i++) {
           AutoInfracao autoInfracao =  autoInfracaos.get(i);
           acumulador = autoInfracao.numeroDePontosGravidade() + acumulador * 12;


        }

        return acumulador;
    }

}

