package br.com.prettyme.dao;

import java.util.List;

import br.com.prettyme.model.usuario.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente, Integer>{

	
	List<Cliente> buscarPorNome(String nome);
	
	boolean buscarPorCPFCheck(String cpf);
	
	List<Cliente> buscarPorCPF(String cpf);
	
	boolean validaLogin(String login, String senha);
	
}
