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

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "T_PM_USUARIO")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TIPO_USUARIO")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode(exclude = {"senha","nome","sobrenome","apelido","sexo","dataNascimento","endereco","telefone"},onlyExplicitlyIncluded = true)
public class Usuario {

	@EqualsAndHashCode.Include @Id @Column(name = "id_usuario") 
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

	@DateTimeFormat(pattern = "dd/MM/yyyy") @Column(name = "dt_nascimento_usuario") 
	private Calendar dataNascimento;

	@Column(name = "email_usuario")	
	private String email;

	@Column(name = "endereco_usuario") @OneToMany(mappedBy = "usuario")
	private List<Endereco> endereco;

	@Column(name = "telefone_usuario") @OneToMany(mappedBy = "usuario")	
	private List<Telefone> telefone;
}