package br.com.pedido.acao;

import br.com.pedido.Pedido;

public class EnviarPedidoPorEmail implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Salavendo pedido no banco de dados");
	}
	
}
