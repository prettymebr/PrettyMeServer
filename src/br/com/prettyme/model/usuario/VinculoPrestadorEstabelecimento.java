package br.com.prettyme.model.usuario;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_PM_VINCULO_PRESTADOR_ESTABELECIMENTO")
public class VinculoPrestadorEstabelecimento {

	@Id
	private int idVinculo;

	@Column(name = "is_dono")
	private boolean isDono;

	@Column(name = "dt_inicio_vinculo")
	private Date dataInicio;

	@Column(name = "dt_fim_vinculo")
	private Date dataFim;

	@OneToMany(mappedBy = "vinculoPrestadorEstabelecimento")
	private List<Prestador> prestadores;

	@OneToMany(mappedBy = "vinculoPrestadorEstabelecimento")
	private List<Estabelecimento> estabelecimentos;
	
	public VinculoPrestadorEstabelecimento() {
		super();
	}

	public VinculoPrestadorEstabelecimento(int idVinculo, boolean isDono, Date dataInicio, Date dataFim,
			List<Prestador> prestadores, List<Estabelecimento> estabelecimentos) {
		super();
		this.idVinculo = idVinculo;
		this.isDono = isDono;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.prestadores = prestadores;
		this.estabelecimentos = estabelecimentos;
	}

	public int getIdVinculo() {
		return idVinculo;
	}

	public void setIdVinculo(int idVinculo) {
		this.idVinculo = idVinculo;
	}

	public boolean isDono() {
		return isDono;
	}

	public void setDono(boolean isDono) {
		this.isDono = isDono;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public List<Prestador> getPrestadores() {
		return prestadores;
	}

	public void setPrestadores(List<Prestador> prestadores) {
		this.prestadores = prestadores;
	}

	public List<Estabelecimento> getEstabelecimentos() {
		return estabelecimentos;
	}

	public void setEstabelecimentos(List<Estabelecimento> estabelecimentos) {
		this.estabelecimentos = estabelecimentos;
	}
}
