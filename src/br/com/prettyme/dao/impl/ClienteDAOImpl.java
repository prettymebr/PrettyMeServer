package br.com.prettyme.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.prettyme.dao.ClienteDAO;
import br.com.prettyme.model.usuario.Cliente;

@Repository
public class ClienteDAOImpl extends GenericDAOImpl<Cliente, Integer> implements ClienteDAO {

	@Override
	public boolean buscarPorCPFCheck(String cpf) {
		Cliente cli = new Cliente();
		cli = em.createQuery("from Cliente where cpf like :cpf_usuario", Cliente.class)
				.setParameter("cpf_usuario", "%" + cpf + "%").getSingleResult();
		if (cli.getCpf() != null) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public List<Cliente> buscarPorCPF(String cpf) {
		return em.createQuery("from Cliente where cpf like :cpf_usuario", Cliente.class)
				.setParameter("cpf_usuario", "%" + cpf + "%").getResultList();
		
	}
	
	@Override
	public List<Cliente> buscarPorNome(String nome) {
		return em.createQuery("from Cliente where nome like :nome_usuario", Cliente.class)
				.setParameter("nome_usuario", "%" + nome + "%").getResultList();
		
	}
	
}
