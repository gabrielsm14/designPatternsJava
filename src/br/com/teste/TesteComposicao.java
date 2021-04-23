package br.com.teste;

import java.math.BigDecimal;

import br.com.orcamento.ItemOrcamento;
import br.com.orcamento.Orcamento;

public class TesteComposicao {

	public static void main(String[] args) {
		Orcamento antigo = new Orcamento();
		antigo.adicionar(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.adicionar(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionar(antigo);
		
		System.out.println(novo.getValor());
	}
}
