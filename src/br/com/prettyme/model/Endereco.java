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
@Table(name = "T_PM_ENDERECO")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Endereco {

	@Id
	@Column(name = "id_endereco")
	private String cep;

	@Column(name = "rua_endereco")
	private String logradouro;

	@Column(name = "complemento_endereco")
	private String complemento;

	@Column(name = "bairro_endereco")
	private String bairro;

	@Column(name = "localidade_endereco")
	private String localidade;

	@Column(name = "uf_endereco")
	private String uf;

	@Column(name = "is_principal_endereco")
	private boolean principal;

	@JoinColumn(name = "ds_endereco_alternativo")
	@ManyToOne
	private Usuario usuario;

}
