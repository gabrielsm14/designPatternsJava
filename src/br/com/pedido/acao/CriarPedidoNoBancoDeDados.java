package br.com.pedido.acao;

import br.com.pedido.Pedido;

public class CriarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados");
	}
	
}
