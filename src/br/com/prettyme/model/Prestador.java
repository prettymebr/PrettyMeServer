package br.com.prettyme.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T_PM_PRESTADOR")
@PrimaryKeyJoinColumn(name="idUsuario")
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Prestador extends Usuario{

	@ManyToOne
	private VinculoPrestadorEstabelecimento vinculoPrestadorEstabelecimento;
	
	
	
	
}
