package br.com.prettyme.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.EqualsAndHashCode;


@Entity
@Table(name = "T_PM_AGENDAMENTO")
@EqualsAndHashCode(exclude = {"servicos","descricao","observacoes","rate"},onlyExplicitlyIncluded = true)
public class Agendamento {

	@Id
	private int idAgendamento;

	@Column(name="dt_agendamento")	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date data; // Importei o tipo Date do java.util pra esse atributo, por√©m n√£o sei se √© o mais correto

	@ManyToOne
	private Cliente cliente;

	@ManyToOne
	private Prestador prestador;

	@OneToMany(mappedBy = "agendamento")
	private List<Servico> servicos;

	@Column(name="ds_descriÁ„o")
	private String descricao;

	@Column(name="ds_observacoes")
	private String observacoes;

	@Column(name="vl_rate")
	private float rate;


	public Agendamento() {
		super();
	}

	public Agendamento(int idAgendamento, Date data, Cliente cliente, Prestador prestador, List<Servico> servicos,
			String descricao, String observacoes, float rate) {
		super();
		this.idAgendamento = idAgendamento;
		this.data = data;
		this.cliente = cliente;
		this.prestador = prestador;
		this.servicos = servicos;
		this.descricao = descricao;
		this.observacoes = observacoes;
		this.rate = rate;
	}

	public int getIdAgendamento() {
		return idAgendamento;
	}

	public void setIdAgendamento(int idAgendamento) {
		this.idAgendamento = idAgendamento;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Prestador getPrestador() {
		return prestador;
	}

	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}
	
	

}
