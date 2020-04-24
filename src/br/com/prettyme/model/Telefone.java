package br.com.prettyme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "T_PM_TELEFONE")
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Telefone {


	@Column(name="id_telefone") @Id private int idTelefone;

	@Column(name="nr_ddd") @Getter @Setter private int ddd;

	@Column(name="nr_ddi") @Getter @Setter private int ddi;

	@Column(name="nr_numero") @Getter @Setter private int numero;

	@Column(name="is_celular") @Getter @Setter private boolean isCelular;

	@JoinColumn(name="nm_usuario") @Getter @Setter @ManyToOne private Usuario usuario;


}
