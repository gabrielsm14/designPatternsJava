package br.com.teste;

import java.math.BigDecimal;

import br.com.imposto.ICMS;
import br.com.imposto.ISS;
import br.com.imposto.Imposto;
import br.com.orcamento.ItemOrcamento;
import br.com.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionar(new ItemOrcamento(new BigDecimal("200")));

		Imposto imposto = new ICMS(new ISS(null));
		System.out.println(imposto.calcular(orcamento));
	}

}
