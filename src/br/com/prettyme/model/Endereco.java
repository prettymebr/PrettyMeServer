package br.com.prettyme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;

@Entity
@Table(name = "T_PM_ENDERECO")
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

	
	public Endereco() {
		super();
	}

	public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf,
			boolean principal, Usuario usuario) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
		this.principal = principal;
		this.usuario = usuario;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public boolean isPrincipal() {
		return principal;
	}

	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
