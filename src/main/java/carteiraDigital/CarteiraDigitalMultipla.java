package carteiraDigital;

import java.util.ArrayList;
import java.util.List;

public class CarteiraDigitalMultipla extends CarteiraDigital {

    private List<CarteiraDigital> subcarteiras;

    public CarteiraDigitalMultipla() {
        subcarteiras = new ArrayList<CarteiraDigital>();
    }

    @Override
    public void creditar(Double valor) {}

    @Override
    public void debitar(Double valor) throws SaldoInsuficienteException {

    }

    @Override
    public Double getSaldo() {
        return super.getSaldo();
    }

    public int getQuantidadeSubCarteiras() {
        return 0;
    }

}
