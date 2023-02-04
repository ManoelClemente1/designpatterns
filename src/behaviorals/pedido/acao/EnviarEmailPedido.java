package behaviorals.pedido.acao;

import behaviorals.pedido.AcaoAposGerarPedido;
import behaviorals.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){

        System.out.println("Enviando email pedido...");

    }
}
