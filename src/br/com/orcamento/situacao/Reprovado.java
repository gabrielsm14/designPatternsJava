package br.com.orcamento.situacao;

import br.com.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());;
	}
}
