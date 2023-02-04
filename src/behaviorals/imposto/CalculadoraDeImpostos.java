package behaviorals.imposto;

import behaviorals.Orcamento.Orcamento;
import behaviorals.imposto.Imposto;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){

        return imposto.calcular(orcamento);
    }
}
