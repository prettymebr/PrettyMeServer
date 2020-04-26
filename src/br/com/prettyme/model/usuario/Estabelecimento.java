package br.com.prettyme.model.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;

@Entity
@Table(name="T_PM_ESTABELECIMENTO")
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
	
	public Estabelecimento() {
		super();
	}

	public Estabelecimento(int idEstabelecimento, String nome, String cnpj, String cep,
			VinculoPrestadorEstabelecimento vinculoPrestadorEstabelecimento, int vagas) {
		super();
		this.idEstabelecimento = idEstabelecimento;
		this.nome = nome;
		this.cnpj = cnpj;
		this.cep = cep;
		this.vinculoPrestadorEstabelecimento = vinculoPrestadorEstabelecimento;
		this.vagas = vagas;
	}

	public int getIdEstabelecimento() {
		return idEstabelecimento;
	}

	public void setIdEstabelecimento(int idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public VinculoPrestadorEstabelecimento getVinculoPrestadorEstabelecimento() {
		return vinculoPrestadorEstabelecimento;
	}

	public void setVinculoPrestadorEstabelecimento(VinculoPrestadorEstabelecimento vinculoPrestadorEstabelecimento) {
		this.vinculoPrestadorEstabelecimento = vinculoPrestadorEstabelecimento;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
}
