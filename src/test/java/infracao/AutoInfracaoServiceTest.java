package infracao;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AutoInfracaoServiceTest {

    @Test
    public void calcularAlgumaCoisa() {

        List<AutoInfracao> autos = new ArrayList<>();

        AutoInfracaoService autoInfracaoService = new AutoInfracaoService();
        autoInfracaoService.calcularAlgumaCoisa(autos);

    }
}