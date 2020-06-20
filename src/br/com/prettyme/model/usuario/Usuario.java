package br.com.prettyme.model.usuario;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.prettyme.model.servico.Anamnese;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "T_PM_USUARIO")
@Inheritance(strategy = InheritanceType.JOINED)
@EqualsAndHashCode(exclude = { "senha", "nome", "sobrenome", "apelido", "sexo", "dataNascimento", "endereco",
		"telefone" }, onlyExplicitlyIncluded = true)
public class Usuario {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private int idUsuario;
	
	@Column(name = "nome_usuario")
	private String nome;
	
	@Column(name = "sobrenome_usuario")
	private String sobrenome;
	
	@Column(name = "apelido_usuario")
	private String apelido;
	
	@Column(name = "cpf_usuario")
	private String cpf;
	
	@Column(name = "rg_usuario")
	private String rg;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "dt_nascimento_usuario")
	private Calendar dataNascimento;
	
	@Column(name = "sexo_usuario")
	private Sexo sexo;
	
	@Column(name = "estado_civil_usuario")
	private EstadoCivil estadoCivil;
	
	@Column(name = "email_usuario")
	private String email;
	
	@Column(name = "login_usuario")
	private String login;

	@Column(name = "senha_usuario")
	private String senha;
	
	@OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Endereco> enderecos;

	@OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Telefone> telefones;
	
	@OneToOne
	private Anamnese anamnese;
	
	@OneToOne
	private MetodoPagamento metodoPagamento;
	
	
	public void addEndereco(Endereco enderecoNovo) {
		//lembre-se que a associação bidirecional
		enderecoNovo.setUsuario(this);
		this.enderecos.add(enderecoNovo);
		}

	public void addTelefone(Telefone telefoneNovo) {
		//lembre-se que a associaçãobidirecional
		telefoneNovo.setUsuario(this);
		this.telefones.add(telefoneNovo);
		}

	public Usuario() {
		super();
	}

	public Usuario(int idUsuario, String nome, String sobrenome, String apelido, String cpf, String rg,
			Calendar dataNascimento, Sexo sexo, EstadoCivil estadoCivil, String email, String login, String senha,
			List<Endereco> enderecos, List<Telefone> telefones, Anamnese anamnese, MetodoPagamento metodoPagamento) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.apelido = apelido;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.enderecos = enderecos;
		this.telefones = telefones;
		this.anamnese = anamnese;
		this.metodoPagamento = metodoPagamento;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Anamnese getAnamnese() {
		return anamnese;
	}

	public void setAnamnese(Anamnese anamnese) {
		this.anamnese = anamnese;
	}

	public MetodoPagamento getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	
	
}