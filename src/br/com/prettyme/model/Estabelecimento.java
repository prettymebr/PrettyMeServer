package br.com.prettyme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="T_PM_ESTABELECIMENTO")
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Estabelecimento {
	
	@Id
	private int idEstabelecimento;
	
	@Column(name="nm_estabelecimento")
	private String nome;
	
	@Column(name="nr_cnpj")
	private String cnpj;
	
	@Column(name="nr_cep")
	private String cep;
	
	@ManyToOne
	private VinculoPrestadorEstabelecimento vinculoPrestadorEstabelecimento;
	
	
	//private byte logo; // Não sei se ta certo assim o tipo byte, da uma olhada e me fala
	
	
	//private byte banner;
	
	//private Estoque estoque; *** Classe Estoque ainda a ser criada ***
	@Column(name="qtd_vagas")
	private int vagas;
		
}
