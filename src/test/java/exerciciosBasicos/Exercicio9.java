package exerciciosBasicos;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio9 {

    /**
     * Exercício 9
     *
     * Reajustando o salário
     *
     * Levando em conta que o reajuste de salário se calcula com a segunte equação:
     *
     * reajuste = salario * reajustePercentual
     *
     * Faça um algoritmo que calcule o reajuste de um salário
     *
     */

    @Test
    public void calcularreajusteDeSalarioMilPercentualQuinte() {

        assertEquals(150,calcularReajuste(1000,.15),0);
    }

    @Ignore
    @Test
    public void calcularreajusteDeSalarioMilEQuinhentosPercentualTreze() {

        assertEquals(195,calcularReajuste(1500,.13),0);
    }

    @Ignore
    @Test
    public void calcularreajusteDeSalarioCincoMilPercentualDois() {

        assertEquals(100,calcularReajuste(5000,.02),0);
    }

    private double calcularReajuste(double salario, double percentualReajuste) {

        return  salario * percentualReajuste;



    }

}
