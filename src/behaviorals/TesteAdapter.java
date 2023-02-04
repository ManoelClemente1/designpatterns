package behaviorals;

import behaviorals.Orcamento.Orcamento;
import behaviorals.Orcamento.RegistroDeOrcamento;
import behaviorals.http.JavaHttpClient;

import java.math.BigDecimal;

public class TesteAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
        registroDeOrcamento.registrar(orcamento);

    }
}
