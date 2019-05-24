package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio10 {

    /**
     * Exercício 10
     *
     * Juros simples
     *
     * Faça um programa para calcular o juros simples segundo a fórmula abaixo.
     *
     * J = C.i.n
     *
     * Onde:
     *
     * J = juros,
     * C = capital,
     * i = taxa de empréstimo
     * n = períodos
     *
     */

    @Test
    public void calcularJuroSimplesDeDezeseisMil() {

        assertEquals(2560,calcularJurosSimples(16000,.04,4),0);
    }


    @Test
    public void calcularJuroSimplesDeCincoMil() {

        assertEquals(800,calcularJurosSimples(5000,.04,4),0);
    }


    @Test
    public void calcularJuroSimplesDeQuarentaMil() {

        assertEquals(6400,calcularJurosSimples(40000,.04,4),0);
    }

    private double calcularJurosSimples(double capital, double taxa, int quantidadeDePeriodos) {
       double juros;

        juros = capital*taxa*quantidadeDePeriodos;

        return juros;
    }

}
