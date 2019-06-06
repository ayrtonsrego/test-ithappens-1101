package br.com.ithappens.entity;

public class PedidoEstoque {
	private String fifial;
	private Usuario usuario;
	private Cliente cliente;
	private String observacao;

	public PedidoEstoque(String filial, Usuario usuario, Cliente cliente, String observacao) {
		this.fifial = filial;
		this.usuario = usuario;
		this.cliente = cliente;
		this.observacao = observacao;
	}

	public String getFifial() {
		return fifial;
	}

	public void setFifial(String fifial) {
		this.fifial = fifial;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
