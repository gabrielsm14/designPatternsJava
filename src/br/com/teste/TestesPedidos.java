package br.com.teste;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.pedido.GeraPedido;
import br.com.pedido.GeraPedidoHandler;
import br.com.pedido.acao.EnviarEmailPedido;
import br.com.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Gabriel";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoNoBancoDeDados(), new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido()));
		
		handler.exeute(gerador);
	}

}
