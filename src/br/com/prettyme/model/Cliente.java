package br.com.prettyme.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@PrimaryKeyJoinColumn(name="idUsuario")
@Table(name = "T_PM_CLIENTE")
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente extends Usuario{
	
	@Column @Getter @Setter private float rate;
	
	@Column @OneToMany(mappedBy = "cliente") @Getter @Setter private List<Agendamento> agendamentos;

}
