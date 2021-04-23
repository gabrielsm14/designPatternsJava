package br.com.teste;

import java.math.BigDecimal;

import br.com.http.JavaHttpClient;
import br.com.orcamento.ItemOrcamento;
import br.com.orcamento.Orcamento;
import br.com.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento();
		orcamento.adicionar(new ItemOrcamento(BigDecimal.TEN));
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		registro.registrar(orcamento);
	}

}
