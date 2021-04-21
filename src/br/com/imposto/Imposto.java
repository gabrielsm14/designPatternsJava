package br.com.imposto;

import java.math.BigDecimal;

import br.com.orcamento.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);
}
