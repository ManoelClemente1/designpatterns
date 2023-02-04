package behaviorals;

import behaviorals.Orcamento.Orcamento;
import behaviorals.desconto.CalculadoraDeDescontos;
import behaviorals.imposto.CalculadoraDeImpostos;
import behaviorals.imposto.ISS;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento primeroOrcamento = new Orcamento(new BigDecimal("200"), 6);

        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(primeroOrcamento));
        System.out.println(calculadora.calcular(segundoOrcamento));

    }
}
