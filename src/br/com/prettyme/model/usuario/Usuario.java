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
public class Usuario {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anamnese == null) ? 0 : anamnese.hashCode());
		result = prime * result + ((apelido == null) ? 0 : apelido.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((enderecos == null) ? 0 : enderecos.hashCode());
		result = prime * result + ((estadoCivil == null) ? 0 : estadoCivil.hashCode());
		result = prime * result + idUsuario;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((metodoPagamento == null) ? 0 : metodoPagamento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		result = prime * result + ((telefones == null) ? 0 : telefones.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (anamnese == null) {
			if (other.anamnese != null)
				return false;
		} else if (!anamnese.equals(other.anamnese))
			return false;
		if (apelido == null) {
			if (other.apelido != null)
				return false;
		} else if (!apelido.equals(other.apelido))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (enderecos == null) {
			if (other.enderecos != null)
				return false;
		} else if (!enderecos.equals(other.enderecos))
			return false;
		if (estadoCivil != other.estadoCivil)
			return false;
		if (idUsuario != other.idUsuario)
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (metodoPagamento == null) {
			if (other.metodoPagamento != null)
				return false;
		} else if (!metodoPagamento.equals(other.metodoPagamento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (sexo != other.sexo)
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		if (telefones == null) {
			if (other.telefones != null)
				return false;
		} else if (!telefones.equals(other.telefones))
			return false;
		return true;
	}
}