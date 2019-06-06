package br.com.ithappens.entity;

public class Produto {
	private int sequencial;
	private int codigoBarras;
	private String descricao;

	public Produto(int sequencial, int codigoBarras, String descricao) {
		this.sequencial = sequencial;
		this.codigoBarras = codigoBarras;
		this.descricao = descricao;
	}

	public int getSequencial() {
		return sequencial;
	}

	public void setSequencial(int sequencial) {
		this.sequencial = sequencial;
	}

	public int getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
