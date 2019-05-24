package fatorial;

public class FatorialComRecursividade implements Fatorial {

    @Override
    public int calcularFatorial(int valor) throws FatorialNumeroNegativoException {
        if (valor < 0) {
            throw new FatorialNumeroNegativoException();
        }
        if(valor == 0){
                return 1;
        }
        return valor*calcularFatorial(valor - 1);

    }



}




