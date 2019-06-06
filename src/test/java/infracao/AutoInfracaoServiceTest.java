package infracao;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AutoInfracaoServiceTest {

    @Test
    public void somarPontosPessoa() {

        AutoInfracao autoinfracao1 = new AutoInfracao();
        autoinfracao1.setDataAutuacao(LocalDate.of(2018, 01, 03));
        autoinfracao1.setPontos("4-Média");
        System.out.println(autoinfracao1.numeroDePontosGravidade());
        AutoInfracao autoinfracao2 = new AutoInfracao();
        autoinfracao2.setPontos("7-grave");
        autoinfracao2.setDataAutuacao(LocalDate.of(2019, 05, 01));


        List<AutoInfracao> infracao = new ArrayList<>();
        infracao.add(autoinfracao1);
        infracao.add(autoinfracao2);
        AutoInfracaoService autoinfracaoService1 = new AutoInfracaoService();
        int totalPontos = autoinfracaoService1.somarPontosPessoa(infracao);
        assertEquals(11, totalPontos);


    }

    @Test

    public void somarPontosPessoaPorAno(){
        AutoInfracao autoinfracao3 = new AutoInfracao();
        autoinfracao3.setDataAutuacao(LocalDate.of(2018, 01, 03));
        autoinfracao3.setPontos("4-Média");
        System.out.println(autoinfracao3.numeroDePontosGravidade());
        AutoInfracao autoinfracao4 = new AutoInfracao();
        autoinfracao4.setPontos("5-grave");
        autoinfracao4.setDataAutuacao(LocalDate.of(2019,05,01));

        List<AutoInfracao> infracao  = new ArrayList<>();
        infracao.add(autoinfracao3);
        infracao.add(autoinfracao4);
        AutoInfracaoService autoinfracaoService1 = new AutoInfracaoService();
        int totalPontos = autoinfracaoService1.somarPontosPessoaPorAno(infracao);
        assertEquals(9,totalPontos);
    }


}

