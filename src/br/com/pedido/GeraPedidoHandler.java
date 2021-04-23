package br.com.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.orcamento.ItemOrcamento;
import br.com.orcamento.Orcamento;
import br.com.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> acoesAposGerarPedido;

	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoesAposGerarPedido) {
		this.acoesAposGerarPedido = acoesAposGerarPedido;
	}

	public void executar(GeraPedido dados) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionar(new ItemOrcamento(new BigDecimal("200")));
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		this.acoesAposGerarPedido.forEach(a -> a.executarAcao(pedido));
	}
}
