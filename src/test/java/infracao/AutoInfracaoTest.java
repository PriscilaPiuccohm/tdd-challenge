package infracao;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class AutoInfracaoTest {

    @Test
    public void numeroDePontosGravidade_Media() {
        AutoInfracao a = new AutoInfracao();
        a.setDataAutuacao(LocalDate.of(2018,01,03));
        a.setPontos("4-Média");

        assertEquals(4,a.numeroDePontosGravidade());
    }

    @Test
    public void numeroDePontosGravidade_Gravissima() {
        AutoInfracao a = new AutoInfracao();
        a.setDataAutuacao(LocalDate.of(2018,01,03));
        a.setPontos("7-Gravissima");

        assertEquals(7,a.numeroDePontosGravidade());
    }

    @Test
    public void numeroDePontosGravidade_Grave() {
        AutoInfracao a = new AutoInfracao();
        a.setDataAutuacao(LocalDate.of(2018, 01, 03));
        a.setPontos("5-Grave");

        assertEquals(5, a.numeroDePontosGravidade());
    }

}
