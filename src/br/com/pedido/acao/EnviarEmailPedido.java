package br.com.pedido.acao;

import br.com.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Salavendo pedido no banco de dados");
	}
	
}
