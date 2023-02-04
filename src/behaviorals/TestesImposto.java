package behaviorals;

import behaviorals.Orcamento.Orcamento;
import behaviorals.imposto.CalculadoraDeImpostos;
import behaviorals.imposto.ICMS;
import behaviorals.imposto.ISS;

import java.math.BigDecimal;

public class TestesImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS(new ISS(null))));
    }
}
