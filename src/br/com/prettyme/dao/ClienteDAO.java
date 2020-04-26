package br.com.prettyme.dao;

import br.com.prettyme.model.usuario.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente, Integer>{

	boolean buscarPorCPF(String cpf);
}
