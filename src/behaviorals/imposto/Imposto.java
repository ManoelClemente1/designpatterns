package behaviorals.imposto;

import behaviorals.Orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular (Orcamento orcamento);
}
