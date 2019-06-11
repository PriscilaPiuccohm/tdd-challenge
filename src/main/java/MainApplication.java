import calculadora.Calculadora;
import infracao.AutoInfracao;
import infracao.AutoInfracaoService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {

        AutoInfracao autoinfracao1 = new AutoInfracao();
        autoinfracao1.setDataAutuacao(LocalDate.of(2018, 01, 03));
        autoinfracao1.setPontos("4-Média");
        System.out.println(autoinfracao1.numeroDePontosGravidade());
        AutoInfracao autoinfracao2 = new AutoInfracao();
        autoinfracao2.setPontos("7");
        autoinfracao2.setDataAutuacao(LocalDate.of(2019,05,01));

        List<AutoInfracao> infracao  = new ArrayList<>();
        infracao.add(autoinfracao1);
        infracao.add(autoinfracao2);

        AutoInfracaoService autoinfracaoService1 = new AutoInfracaoService();
        int totalPontos = autoinfracaoService1.somarPontosPessoa(infracao);
        System.out.println(totalPontos);



    }
}









        //ld = ld.plusYears(5);



// extrair o 4, depois converter Integer.parseInt();
