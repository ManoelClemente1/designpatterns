package behaviorals.pedido.acao;

import behaviorals.pedido.AcaoAposGerarPedido;
import behaviorals.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){

        System.out.println("Salvando pedido no banco de dados...");

    }
}
