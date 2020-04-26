package br.com.prettyme.model.usuario;

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

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public Telefone() {
		super();
	}

	public Telefone(int idTelefone, int ddd, int ddi, int numero, boolean isCelular, Usuario usuario) {
		super();
		this.idTelefone = idTelefone;
		this.ddd = ddd;
		this.ddi = ddi;
		this.numero = numero;
		this.isCelular = isCelular;
		this.usuario = usuario;
	}

	public int getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(int idTelefone) {
		this.idTelefone = idTelefone;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getDdi() {
		return ddi;
	}

	public void setDdi(int ddi) {
		this.ddi = ddi;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isCelular() {
		return isCelular;
	}

	public void setCelular(boolean isCelular) {
		this.isCelular = isCelular;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
