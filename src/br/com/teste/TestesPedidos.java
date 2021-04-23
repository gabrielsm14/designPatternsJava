package br.com.teste;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.pedido.GeraPedido;
import br.com.pedido.GeraPedidoHandler;
import br.com.pedido.acao.CriarPedidoNoBancoDeDados;
import br.com.pedido.acao.EnviarPedidoPorEmail;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Gabriel";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
				new EnviarPedidoPorEmail(),
				new CriarPedidoNoBancoDeDados()));
		handler.executar(gerador);
	}

}
