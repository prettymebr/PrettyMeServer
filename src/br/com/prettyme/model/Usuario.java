package br.com.prettyme.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.EqualsAndHashCode;

@Entity
@Table(name = "T_PM_USUARIO")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TIPO_USUARIO")
@EqualsAndHashCode(exclude = { "senha", "nome", "sobrenome", "apelido", "sexo", "dataNascimento", "endereco",
		"telefone" }, onlyExplicitlyIncluded = true)
public class Usuario {

	@EqualsAndHashCode.Include
	@Id
	@Column(name = "id_usuario")
	private int idUsuario;

	@Column(name = "usr_usuario")
	private String usuario;

	@Column(name = "senha_usuario")
	private String senha;

	@Column(name = "cpf_usuario")
	private int cpf;

	@Column(name = "nome_usuario")
	private String nome;

	@Column(name = "sobrenome_usuario")
	private String sobrenome;

	@Column(name = "apelido_usuario")
	private String apelido;

	@Column(name = "sexo_usuario")
	private Sexo sexo;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "dt_nascimento_usuario")
	private Calendar dataNascimento;

	@Column(name = "email_usuario")
	private String email;

	@Column(name = "endereco_usuario")
	@OneToMany(mappedBy = "usuario")
	private List<Endereco> endereco;

	@Column(name = "telefone_usuario")
	@OneToMany(mappedBy = "usuario")
	private List<Telefone> telefone;

	public Usuario() {
		super();
	}

	public Usuario(int idUsuario, String usuario, String senha, int cpf, String nome, String sobrenome, String apelido,
			Sexo sexo, Calendar dataNascimento, String email, List<Endereco> endereco, List<Telefone> telefone) {
		super();
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.senha = senha;
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.apelido = apelido;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}
}