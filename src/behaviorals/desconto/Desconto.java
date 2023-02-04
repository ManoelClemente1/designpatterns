package behaviorals.desconto;

import behaviorals.Orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;


    protected Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento){
        if (deverAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }

        return proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    public abstract boolean deverAplicar(Orcamento orcamento);

}
