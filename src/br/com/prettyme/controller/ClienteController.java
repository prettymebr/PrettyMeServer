package br.com.prettyme.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.prettyme.dao.ClienteDAO;
import br.com.prettyme.exception.RegistroNaoEncontradoException;
import br.com.prettyme.model.usuario.Cliente;
import br.com.prettyme.model.usuario.EstadoCivil;
import br.com.prettyme.model.usuario.Sexo;

@Controller
@RequestMapping("cliente")
public class ClienteController {

	@Autowired
	private ClienteDAO clienteDao;
	
	@GetMapping("loginCliente")
	public ModelAndView loginCliente(Cliente cliente) {
		return new ModelAndView("cliente/loginCliente");
	}

	@GetMapping("cadastrarCliente")
	public ModelAndView cadastrarCliente(Cliente cliente) {
		return new ModelAndView("cliente/cadastroCliente")
				.addObject("sexo", Sexo.values())
				.addObject("estadoCivil", EstadoCivil.values());
	}

	@Transactional
	@PostMapping("cadastrarCliente")
	public ModelAndView cadastrarCliente(@Valid Cliente cliente, BindingResult result, RedirectAttributes r) {
		if (result.hasErrors()) {
			cadastrarCliente(cliente);	
		}
		cliente.addEndereco(cliente.getEnderecos().get(0));
		clienteDao.cadastrar(cliente);
		/*
		if (clienteDao.buscarPorCPFCheck(cliente.getCpf())) {
			
		} else {
			cadastrarCliente(cliente);
		}*/
		r.addFlashAttribute("msg", "Cadastrado com sucesso");
		return new ModelAndView("redirect:cadastrarCliente");
	}

	@GetMapping("editarCliente/{id}")
	public ModelAndView editarCliente(@PathVariable("id") int codigo) {
		return new ModelAndView("cliente/edicaoCliente").addObject("cliente", clienteDao.buscar(codigo));
	}

	@Transactional
	@PostMapping("editarCliente")
	public ModelAndView editarCliente(@Valid Cliente cliente, BindingResult result, RedirectAttributes r) {
		if (result.hasErrors()) {
			new ModelAndView("cliente/edicaoCliente").addObject("cliente", cliente);
		}
		clienteDao.atualizar(cliente);
		r.addFlashAttribute("msg", "Atualizado com sucesso");
		return new ModelAndView("redirect:/cliente/listarCliente");
	}

	@Transactional
	@PostMapping("removerCliente")
	public String removerCliente(int codigo, RedirectAttributes r) {
		try {
			clienteDao.excluir(codigo);
			r.addFlashAttribute("msg", "Removido com sucesso!");
		} catch (RegistroNaoEncontradoException e) {
			e.printStackTrace();
		}
		return "redirect:/cliente/listarCliente";
	}
	
	@GetMapping("listarClientes")
	public ModelAndView listarCliente() {
		return new ModelAndView("cliente/listarClientes").addObject("clientes", clienteDao.listar());
	}
	
	@GetMapping("buscarPorNome")
	public ModelAndView bucsarPorNome(String nome) {
		if(nome == null) {
			return new ModelAndView("cliente/listarClientes")
					.addObject("clientes", clienteDao.listar());	
		}else {
			return new ModelAndView("cliente/listarClientes")
					.addObject("clientes", clienteDao.buscarPorNome(nome));
		}
	}
	
	@GetMapping("buscarPorCpf")
	public ModelAndView buscarPorCpf(String cpf) {
		if(cpf == null) {
			return new ModelAndView("cliente/listarClientes")
					.addObject("clientes", clienteDao.listar());	
		}else {
			return new ModelAndView("cliente/listarClientes")
					.addObject("clientes", clienteDao.buscarPorCPF(cpf));
		}
	}
}
