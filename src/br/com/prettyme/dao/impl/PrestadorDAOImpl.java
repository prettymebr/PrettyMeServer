package br.com.prettyme.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.prettyme.dao.PrestadorDAO;
import br.com.prettyme.model.usuario.Prestador;

@Repository
public class PrestadorDAOImpl extends GenericDAOImpl<Prestador,Integer> implements PrestadorDAO{

}
