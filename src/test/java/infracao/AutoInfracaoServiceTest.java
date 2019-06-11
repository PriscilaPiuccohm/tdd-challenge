package infracao;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

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

    public void somarPontosPessoaPorAno() {
        AutoInfracao autoinfracao3 = new AutoInfracao();
        autoinfracao3.setDataAutuacao(LocalDate.of(2017, 01, 01));
        autoinfracao3.setPontos("4- Média");
        System.out.println(autoinfracao3.numeroDePontosGravidade());

        AutoInfracao autoinfracao4 = new AutoInfracao();
        autoinfracao4.setDataAutuacao(LocalDate.of(2017, 12, 31));
        autoinfracao4.setPontos("5- Grave");
        System.out.println(autoinfracao4.numeroDePontosGravidade());

        AutoInfracao autoinfracao5 = new AutoInfracao();
        autoinfracao4.setDataAutuacao(LocalDate.of(2017, 05, 1));
        autoinfracao4.setPontos("4- Media");
        System.out.println(autoinfracao5.numeroDePontosGravidade());

        AutoInfracao autoinfracao6 = new AutoInfracao();
        autoinfracao6.setDataAutuacao(LocalDate.of(2017,05,15));
        autoinfracao6.setPontos("5- Grave");
        System.out.println(autoinfracao6.numeroDePontosGravidade());


        AutoInfracao autoinfracao7 = new AutoInfracao();
        autoinfracao7.setDataAutuacao(LocalDate.of(2018,01,01));
        autoinfracao7.setPontos("4 - Média");
        System.out.println(autoinfracao7.numeroDePontosGravidade());


        AutoInfracao autoInfracao8 = new AutoInfracao();
        autoInfracao8.setDataAutuacao(LocalDate.of(2018,8,11));
        autoInfracao8.setPontos("7 - Gravissima");
        System.out.println(autoInfracao8.numeroDePontosGravidade());



        List<AutoInfracao> infracao = new ArrayList<>();
        infracao.add(autoinfracao3);
        infracao.add(autoinfracao4);
        infracao.add(autoinfracao5);
        infracao.add(autoinfracao6);
        infracao.add(autoinfracao7);
        infracao.add(autoInfracao8);

        AutoInfracaoService autoinfracaoService1 = new AutoInfracaoService();
        int totalPontos = autoinfracaoService1.somarPontosPessoaPorAno(infracao, LocalDate.of(2017, 05, 01));
        assertEquals(9, totalPontos);
        AutoInfracaoService autoinfracaoService2 = new AutoInfracaoService();
        int totalPonto = autoinfracaoService2.somarPontosPessoaPorAno(infracao,LocalDate.of(20107,05,01));
        assertEquals(13,totalPontos);
        AutoInfracaoService autoinfracaoService3 = new AutoInfracaoService();
        int totalPonto3 = autoinfracaoService3.somarPontosPessoaPorAno(infracao, LocalDate.of(2017,9,01));
        assertEquals(11,totalPontos);
    }


    }




