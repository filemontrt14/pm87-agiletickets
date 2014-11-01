package br.com.caelum.agiletickets.models;

public class EspetaculoBuilder {

	private Espetaculo espetaculo;
	private String nome;
	private String descricao;
	private TipoDeEspetaculo tipo;

	public EspetaculoBuilder(){
		espetaculo=new Espetaculo();
	}

	public EspetaculoBuilder chamado(String string) {
		espetaculo.setNome(nome);
		return this;
	}

	public EspetaculoBuilder queEh(String string) {
		espetaculo.setDescricao(descricao);
		return this;
	}

	public EspetaculoBuilder doTipo(TipoDeEspetaculo teatro) {
		espetaculo.setTipo(tipo);
		return this;
	}

	public Espetaculo cria() {
		return espetaculo;
	}

}
