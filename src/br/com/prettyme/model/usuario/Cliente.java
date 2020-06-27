package br.com.prettyme.model.usuario;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.com.prettyme.model.servico.Agendamento;
import lombok.EqualsAndHashCode;

@Entity
@PrimaryKeyJoinColumn(name="idUsuario")
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((agendamentos == null) ? 0 : agendamentos.hashCode());
		result = prime * result + Float.floatToIntBits(rate);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (agendamentos == null) {
			if (other.agendamentos != null)
				return false;
		} else if (!agendamentos.equals(other.agendamentos))
			return false;
		if (Float.floatToIntBits(rate) != Float.floatToIntBits(other.rate))
			return false;
		return true;
	}
}
