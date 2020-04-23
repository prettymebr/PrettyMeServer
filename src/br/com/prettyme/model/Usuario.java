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
import javax.persistence.UniqueConstraint;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//JPA
//Nota��o JPA Para idenficar que esta classe ser� uma entidade
@Entity
//Nota��o JPA para mapear os dados da entidade no banco como nome entre outros
@Table(name = "T_PM_USUARIO",  uniqueConstraints= @UniqueConstraint(columnNames={"cpf_usuario,usr_usuario,email_usuario"}))
//aplica heran�a gerando uma tabela a parte para usu�rio
@Inheritance(strategy = InheritanceType.JOINED)

//definque o campo que identifica o tipo de usu�rio na heran�a
@DiscriminatorColumn(name = "TIPO_USUARIO")

//lombok 
//gerando automaticamente construtor cheio e vazio.
@NoArgsConstructor @AllArgsConstructor
/*Equals e Hascode s�o metodos do Java Object de compara��o que conseguem verificar se os objedos s�o iguais, devem ser sobrescritas se quiser precis�o na pesquisa.
 * o equals compara apenas se � a mesma instancia , se voc� n�o define o que quer comparar ele cria automaticamente e isso gera um uma instancia nova sempre e nunca conseguir� comparar nada.
 * Hash tamb�m compara algum etributo da classe, se n�o definir qual, ele cria por default um hash e tamb�m nucna ser� o mesmo.*/
@EqualsAndHashCode(exclude = {"senha","nome","sobrenome","apelido","sexo","dataNascimento","endereco","telefone"},onlyExplicitlyIncluded = true)

public class Usuario {

	@EqualsAndHashCode.Include @Id @Column(name = "id_usuario") @Getter 
	private int idUsuario;

	@Column(name = "usr_usuario") @Getter @Setter private String usuario;

	@Column(name = "senha_usuario")	@Getter @Setter private String senha;

	@Column(name = "cpf_usuario") @Getter @Setter private int cpf;

	@Column(name = "nome_usuario") @Getter @Setter private String nome;

	@Column(name = "sobrenome_usuario")	@Getter @Setter private String sobrenome;

	@Column(name = "apelido_usuario") @Getter @Setter private String apelido;

	@Column(name = "sexo_usuario") @Getter @Setter private Sexo sexo;

	@DateTimeFormat(pattern = "dd/MM/yyyy")	@Getter @Setter private Calendar dataNascimento;

	@Column(name = "email_usuario")	@Getter @Setter private String email;

	@Column(name = "endereco_usuario") @OneToMany(mappedBy = "usuario")	@Getter @Setter private Endereco endereco;

	@Column(name = "telefone_usuario") @OneToMany(mappedBy = "usuario")	@Getter @Setter private List<Telefone> telefone;
}