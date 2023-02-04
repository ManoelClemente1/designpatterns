package behaviorals.desconto;

import behaviorals.Orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{

    protected SemDesconto() {

        super(null);
    }

    public BigDecimal calcular (Orcamento orcamento){
        return BigDecimal.ZERO;

    }
}
