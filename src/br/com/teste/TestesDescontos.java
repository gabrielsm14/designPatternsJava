package br.com.teste;

import java.math.BigDecimal;

import br.com.desconto.CalculadoraDeDescontos;
import br.com.orcamento.ItemOrcamento;
import br.com.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {

		Orcamento primeiro = new Orcamento();
		primeiro.adicionar(new ItemOrcamento(new BigDecimal("200")));
		
		Orcamento segundo = new Orcamento();
		segundo.adicionar(new ItemOrcamento(new BigDecimal("1000")));
		
		Orcamento terceiro = new Orcamento();
		terceiro.adicionar(new ItemOrcamento(new BigDecimal("500")));

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));
		System.out.println(calculadora.calcular(terceiro));
	}

}
