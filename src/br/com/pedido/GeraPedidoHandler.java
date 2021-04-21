package br.com.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.orcamento.Orcamento;
import br.com.pedido.acao.AcaoAposGerarPedido;
import br.com.pedido.acao.EnviarEmailPedido;
import br.com.pedido.acao.SalvarPedidoNoBancoDeDados;

public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> acoes;

	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void exeute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		EnviarEmailPedido email = new EnviarEmailPedido();
		SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();

		acoes.forEach(a -> a.executarAcao(pedido));
	}
}
