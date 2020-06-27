package br.com.prettyme.model.usuario;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.com.prettyme.model.servico.Agendamento;
import lombok.EqualsAndHashCode;

@Entity
@PrimaryKeyJoinColumn(name="id_usuario")
@Table(name = "T_PM_CLIENTE")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente extends Usuario{
	
	
	
	private float rate;
	
	@OneToMany(mappedBy = "cliente") 
	private List<Agendamento> agendamentos;
	
	public Cliente() {
		super();
	}

	public Cliente(float rate, List<Agendamento> agendamentos) {
		super();
		this.rate = rate;
		this.agendamentos = agendamentos;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public List<Agendamento> getAgendamentos() {
		return agendamentos;
	}

	public void setAgendamentos(List<Agendamento> agendamentos) {
		this.agendamentos = agendamentos;
	}
}
