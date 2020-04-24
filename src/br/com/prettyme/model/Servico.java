package br.com.prettyme.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T_PM_SERVICO")
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Servico {
	
	@Id
	@Column(name="id_servico")
	private int idServico;
	
	@Column(name="nm_servico")
	private String nome;
	//private Categoria categoria; *** Classe Categoria a ser criada ***
	
	@Column(name="duracao_servico")
	private Date duracao; // Importei o tipo Date do java.util pra esse atributo, porém não sei se é o mais correto
	
	@Column(name="vl_servico")
	private float preco;
	
	@ManyToOne
	private Agendamento agendamento;
	
}
