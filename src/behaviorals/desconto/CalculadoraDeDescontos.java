package behaviorals.desconto;

import behaviorals.Orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular (Orcamento orcamento){

        Desconto desconto = new DescontoParaOrcamentoComValorQuinhentos(
                new DescontoParaOrcamentoComValorQuinhentos(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
