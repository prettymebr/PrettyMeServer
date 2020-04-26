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

import br.com.prettyme.dao.PrestadorDAO;
import br.com.prettyme.exception.RegistroNaoEncontradoException;
import br.com.prettyme.model.usuario.Prestador;
import br.com.prettyme.model.usuario.Sexo;

@Controller
@RequestMapping("prestador")
public class PrestadorController {

	@Autowired
	private PrestadorDAO prestadorDao;

	@GetMapping("cadastrarPrestador")
	public ModelAndView cadastrarPrestador(Prestador prestador) {
		return new ModelAndView("prestador/cadastroPrestador").addObject("sexo", Sexo.values());
	}

	@Transactional
	@PostMapping("cadastrarPrestador")
	public ModelAndView cadastrarPrestador(@Valid Prestador prestador, BindingResult result, RedirectAttributes r) {
		if (result.hasErrors()) {
			cadastrarPrestador(prestador);
		}

		prestadorDao.cadastrar(prestador);
		r.addFlashAttribute("msg", "Cadastrado com sucesso");
		return new ModelAndView("redirect:cadastrarPrestador");
	}

	@GetMapping("listarPrestador")
	public ModelAndView listarPrestador() {
		return new ModelAndView("prestador/listaPrestador").addObject("prestadores", prestadorDao.listar());
	}

	@GetMapping("editarPrestador/{id}")
	public ModelAndView editarPrestador(@PathVariable("id") int codigo) {
		return new ModelAndView("prestador/edicaoPrestador").addObject("prestador", prestadorDao.buscar(codigo));
	}

	@Transactional
	@PostMapping("editarPrestador")
	public ModelAndView editarPrestador(@Valid Prestador prestador, BindingResult result, RedirectAttributes r) {
		if (result.hasErrors()) {
			new ModelAndView("prestador/edicaoPrestador").addObject("prestador", prestador);
		}
		prestadorDao.atualizar(prestador);
		r.addFlashAttribute("msg", "Atualizado com sucesso");
		return new ModelAndView("redirect:/prestador/listarPrestador");
	}

	@Transactional
	@PostMapping("removerPrestador")
	public String remover(int codigo, RedirectAttributes r) {
		try {
			prestadorDao.excluir(codigo);
			r.addFlashAttribute("msg", "Removido com sucesso!");
		} catch (RegistroNaoEncontradoException e) {
			e.printStackTrace();
		}
		return "redirect:/prestador/listarPrestador";
	}
}
