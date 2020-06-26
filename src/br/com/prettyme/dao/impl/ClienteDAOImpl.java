package br.com.prettyme.dao.impl;

import java.util.List;

import javax.persistence.Query;

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

	@Override
	public boolean validaLogin(String login, String senha) {
		System.out.println(login + "-" + senha);
		Query q = em.createNativeQuery("select * from t_pm_cliente CLI join t_pm_usuario US "
				+ "on US.id_usuario = CLI.idUsuario where US.login_usuario like '" + login + "';" , Cliente.class);
		System.out.println(q);
		Cliente cli =(Cliente) q.getSingleResult();
		if(cli != null) {
			if(cli.getLogin().equals(login) && cli.getLogin().equals(senha)) {
				return true;
			} 
		}
		return false; 
	}
	
}
