package br.com.alessanderleite;

public class ICMS {

	public double calculaICMS(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
}
