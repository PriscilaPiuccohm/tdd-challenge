package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio7 {

    /**
     * Exercício 7
     * <p>
     * Custo de fabricação de um carro
     * <p>
     * O custo de um carro novo ao consumidor é obtido com a seguinte fórmula:
     * <p>
     * custo final = custo de fábrica +
     * (custo de fábrica * percentual do distribuidor) +
     * (custo de fábrica * percentual de impostos)
     * <p>
     * Implemente uma função que calcule o custo final do carro
     */

    @Test
    public void carroDeDezMil() {
        assertEquals(17300, custoFinalDoCarro(10000, .28, .45), 0);
    }


    @Test
    public void carroDeQuarentaECincoMilMil() {
        assertEquals(77850, custoFinalDoCarro(45000, .28, .45), 0);
    }


    @Test
    public void carroDeTrintaESeteMil() {
        assertEquals(64010, custoFinalDoCarro(37000, .28, .45), 0);
    }

    private double custoFinalDoCarro(double custoDeFabrica, double percentualDistribuidor, double percentualDeImpostos) {

        double custoFinal = custoDeFabrica + (custoDeFabrica * percentualDistribuidor) + (custoDeFabrica * percentualDeImpostos);

        return  custoFinal;

    }


}
