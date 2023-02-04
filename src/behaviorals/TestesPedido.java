package behaviorals;

import behaviorals.Orcamento.Orcamento;
import behaviorals.pedido.GeraPedido;
import behaviorals.pedido.GeraPedidoHandler;
import behaviorals.pedido.Pedido;
import behaviorals.pedido.acao.EnviarEmailPedido;
import behaviorals.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestesPedido {

    public static void main(String[] args) {
        String cliente = "Maneco";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente,valorOrcamento,quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(
                        new SalvarPedidoNoBancoDeDados(),
                        new EnviarEmailPedido()
                )
        );

        handler.execute(gerador);

    }
}
