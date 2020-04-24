package br.com.prettyme.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;

@Entity
@Table(name = "T_PM_SERVICO")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Servico {
	
	@Id
	@Column(name="id_servico")
	private int idServico;
	
	@Column(name="nm_servico")
	private String nome;
	//private Categoria categoria; *** Classe Categoria a ser criada ***
	
	@Column(name="duracao_servico")
	private Date duracao; // Importei o tipo Date do java.util pra esse atributo, porém não sei se é o mais correto
	
	@Column(name="vl_servico")
	private float preco;
	
	@ManyToOne
	private Agendamento agendamento;

	public Servico() {
		super();
	}

	public Servico(int idServico, String nome, Date duracao, float preco, Agendamento agendamento) {
		super();
		this.idServico = idServico;
		this.nome = nome;
		this.duracao = duracao;
		this.preco = preco;
		this.agendamento = agendamento;
	}

	public int getIdServico() {
		return idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDuracao() {
		return duracao;
	}

	public void setDuracao(Date duracao) {
		this.duracao = duracao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}
	
	
}
