package br.com.teste;

import java.math.BigDecimal;

import br.com.orcamento.ItemOrcamento;
import br.com.orcamento.Orcamento;
import br.com.orcamento.OrcamentoProxy;

public class TesteComposicao {

	public static void main(String[] args) {
		Orcamento antigo = new Orcamento();
		antigo.adicionar(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.adicionar(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionar(antigo);
		
		OrcamentoProxy proxy = new OrcamentoProxy(novo);
		
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
	}
}
