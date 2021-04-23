package br.com.teste;

import java.math.BigDecimal;

import br.com.imposto.CalculadoraDeImpostos;
import br.com.imposto.ICMS;
import br.com.imposto.ISS;
import br.com.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1) ;
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
	}

}
