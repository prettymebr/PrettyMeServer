package br.com.prettyme.model.usuario;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity	
@Table(name="T_PM_METODO_PAGAMENTO")
public class MetodoPagamento {
	
	@Id
	@Column(name="id_metodo_pagamento")
	private int idMetodoPagamento;
	
	@OneToOne
	private Usuario usuario;

	@OneToMany(mappedBy = "metodoPagamento")
	private List<Cartao> cartoes;
	
	public MetodoPagamento() {
		super();
	}

	public MetodoPagamento(int idMetodoPagamento, Usuario usuario, List<Cartao> cartoes) {
		super();
		this.idMetodoPagamento = idMetodoPagamento;
		this.usuario = usuario;
		this.cartoes = cartoes;
	}

	public int getIdMetodoPagamento() {
		return idMetodoPagamento;
	}

	public void setIdMetodoPagamento(int idMetodoPagamento) {
		this.idMetodoPagamento = idMetodoPagamento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Cartao> getCartoes() {
		return cartoes;
	}

	public void setCartoes(List<Cartao> cartoes) {
		this.cartoes = cartoes;
	}
}
