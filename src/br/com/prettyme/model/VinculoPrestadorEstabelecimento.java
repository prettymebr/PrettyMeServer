package br.com.prettyme.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="T_PM_VINCULO_PRESTADOR_ESTABELECIMENTO")
public class VinculoPrestadorEstabelecimento {

	
	@Id
	private int idVinculo;
	
	@Column(name="is_dono")
	private boolean isDono;
	
	@Column(name="dt_inicio_vinculo")
	private Date dataInicio;
	
	@Column(name="dt_fim_vinculo")
	private Date dataFim;
	
	@OneToMany(mappedBy = "vinculoPrestadorEstabelecimento") @Getter @Setter
	private List<Prestador> prestadores;
	
	@OneToMany(mappedBy = "vinculoPrestadorEstabelecimento") @Getter @Setter
	private List<Estabelecimento> estabelecimentos;
	
}
