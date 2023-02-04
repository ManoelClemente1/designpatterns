package behaviorals.desconto;

import behaviorals.Orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular (Orcamento orcamento){

        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComValorQuinhentos(
                new DescontoParaOrcamentoComValorQuinhentos(
                        new SemDesconto()));

        return cadeiaDeDescontos.efetuarCalculo(orcamento);
    }
}
