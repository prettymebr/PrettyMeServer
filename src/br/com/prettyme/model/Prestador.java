package br.com.prettyme.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;

@Entity
@Table(name = "T_PM_PRESTADOR")
@PrimaryKeyJoinColumn(name="idUsuario")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Prestador extends Usuario{
	
	

	@ManyToOne
	private VinculoPrestadorEstabelecimento vinculoPrestadorEstabelecimento;

	
	public Prestador() {
		super();
	}

	public Prestador(VinculoPrestadorEstabelecimento vinculoPrestadorEstabelecimento) {
		super();
		this.vinculoPrestadorEstabelecimento = vinculoPrestadorEstabelecimento;
	}

	public VinculoPrestadorEstabelecimento getVinculoPrestadorEstabelecimento() {
		return vinculoPrestadorEstabelecimento;
	}

	public void setVinculoPrestadorEstabelecimento(VinculoPrestadorEstabelecimento vinculoPrestadorEstabelecimento) {
		this.vinculoPrestadorEstabelecimento = vinculoPrestadorEstabelecimento;
	}
}
