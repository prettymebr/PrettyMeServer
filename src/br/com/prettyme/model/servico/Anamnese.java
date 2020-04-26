package br.com.prettyme.model.servico;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.prettyme.model.usuario.Usuario;

@Entity
@Table(name ="T_PM_ANAMNESE")
public class Anamnese {

	@Id
	private int idAnamnese;
	
	@OneToOne
	private Usuario usuario;
	
	private int temperatura;
	
	//tamanho dos linfonos
	private double linfonodo;
	
	
	
	
	
}
