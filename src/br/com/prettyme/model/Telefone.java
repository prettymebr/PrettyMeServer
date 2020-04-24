package br.com.prettyme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;

@Entity
@Table(name = "T_PM_TELEFONE")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Telefone {

	@Column(name = "id_telefone")
	@Id
	private int idTelefone;

	@Column(name = "nr_ddd")
	private int ddd;

	@Column(name = "nr_ddi")
	private int ddi;

	@Column(name = "nr_numero")
	private int numero;

	@Column(name = "is_celular")
	private boolean isCelular;

	@JoinColumn(name = "nm_usuario")
	@ManyToOne
	private Usuario usuario;

}
