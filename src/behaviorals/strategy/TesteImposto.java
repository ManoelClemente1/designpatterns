package behaviorals.strategy;

import java.math.BigDecimal;

public class TesteImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ISS()));

    }
}