package br.com.prettyme.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "T_PM_AGENDAMENTO")
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(exclude = {"servicos","descricao","observacoes","rate"},onlyExplicitlyIncluded = true)
public class Agendamento {

	@Id
	private int idAgendamento;

	@Column(name="dt_agendamento")	@DateTimeFormat(pattern="dd/MM/yyyy") @Getter @Setter
	private Date data; // Importei o tipo Date do java.util pra esse atributo, por√©m n√£o sei se √© o mais correto

	@ManyToOne @Getter @Setter
	private Cliente cliente;

	@ManyToOne @Getter @Setter
	private Prestador prestador;

	@OneToMany(mappedBy = "agendamento") @Getter @Setter
	private List<Servico> servicos;

	@Column(name="ds_descriÁ„o") @Getter @Setter
	private String descricao;

	@Column(name="ds_observacoes") @Getter @Setter
	private String observacoes;

	@Column(name="vl_rate") @Getter @Setter
	private float rate;

}
