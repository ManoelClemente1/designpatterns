package behaviorals.desconto;

import behaviorals.Orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisCintoItens extends Desconto{

    protected DescontoParaOrcamentoComMaisCintoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deverAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
