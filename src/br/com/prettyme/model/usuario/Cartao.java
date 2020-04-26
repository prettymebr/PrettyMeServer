package br.com.prettyme.model.usuario;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="T_PM_CARTOES")
public class Cartao {

	@Id
	private int idCartao;
	
	@Column(name="numero_cartao")
	private int numeroCartao;
	
	@DateTimeFormat(pattern = "MM/yy")
	@Column(name="validade_cartao")
	private Calendar validade;
	
	@Column(name="bandeira_cartao")
	private String bandeira;

	@Column(name="tipo_cartao")
	private String tipoCartao;
	
	@ManyToOne
	@JoinColumn(name = "id_metodo_pagamento")
	private MetodoPagamento metodoPagamento;

	public Cartao() {
		super();
	}

	public Cartao(int idCartao, int numeroCartao, Calendar validade, String bandeira, String tipoCartao,
			MetodoPagamento metodoPagamento) {
		super();
		this.idCartao = idCartao;
		this.numeroCartao = numeroCartao;
		this.validade = validade;
		this.bandeira = bandeira;
		this.tipoCartao = tipoCartao;
		this.metodoPagamento = metodoPagamento;
	}

	public int getIdCartao() {
		return idCartao;
	}

	public void setIdCartao(int idCartao) {
		this.idCartao = idCartao;
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public Calendar getValidade() {
		return validade;
	}

	public void setValidade(Calendar validade) {
		this.validade = validade;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getTipoCartao() {
		return tipoCartao;
	}

	public void setTipoCartao(String tipoCartao) {
		this.tipoCartao = tipoCartao;
	}

	public MetodoPagamento getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
}
