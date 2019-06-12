package fatorial;

public class FatorialComLoop implements Fatorial {

    @Override
    public int calcularFatorial(int valor) throws FatorialNumeroNegativoException {
        if(valor < 0)
            throw new FatorialNumeroNegativoException();
        int acumulador = 1;
        while ( valor > 0 ){
            acumulador *= valor --;

        }

        return acumulador;
    }
}












