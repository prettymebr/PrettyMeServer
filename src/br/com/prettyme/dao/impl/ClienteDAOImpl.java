package br.com.prettyme.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.prettyme.dao.ClienteDAO;
import br.com.prettyme.model.usuario.Cliente;

@Repository
public class ClienteDAOImpl extends GenericDAOImpl<Cliente,Integer> implements ClienteDAO{

	@Override
	public boolean buscarPorCPF(String cpf) {
		Cliente cli = new Cliente();
		 cli= em.createQuery("from T_PM_CLIENTE where cpf like :cpf_usuario",Cliente.class)
				.setParameter("cpf","%"+cpf+"%").getSingleResult();
		  if(cli.getCpf() != null) {
			  return true;
		  }else {
			  return false;
		  }
		 
	}
}
