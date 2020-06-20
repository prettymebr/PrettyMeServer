<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<tags:template titulo="Pagina de teste">



	<h1 class="text-center">Lista de Clientes</h1>


	<c:if test="${not empty msg }">
		<div class="alert alert-success">${msg }</div>
	</c:if>
	<br> 
	<div class="row">
		<div class="col-6">
			<h4>Pesquisar Por CPF</h4>
			<form class="form-inline" action="<c:url value="/cliente/buscarPorCpf"/>">
				<input name="cpf" class="form-control">
				<button class="btn btn-outline-success" type="submit">Pesquisar</button>
			</form>
		</div>
	</div>
	<br>
	
		<table class="table">
		<tr>
			<th>Id Cliente</th>
			<th>Nome</th>
			<th>Sobrenome</th>
			<th>CPF</th>
			<th>Data de Nascimento</th>
			<th>E-mail</th>
			
			<th>Funções</th>
		</tr>
		<c:forEach items="${prestadores }" var="prestador">
			<tr>
				<td>${prestador.idUsuario }</td>
				<td>${prestador.nome }</td>
				<td>${prestador.sobrenome }</td>
				<td>${prestador.cpf }</td>
				<td><fmt:formatDate value="${prestador.dataNascimento.time }" pattern="dd/MM/yyyy" /></td>
				<td>${prestador.email }</td>
				
				<td>
						<a href="<c:url value="/cliente/editarCliente/${cli.idUsuario}"/>" class="btn btn-outline-primary btn-sm">Editar</a>
						<button onclick="codigoRemover.value = ${cli.idUsuario}" type="button" class="btn btn-outline-danger btn-sm" data-toggle="modal" data-target="#modalRemover">
						  Remover
						</button>
						<a href="<c:url value="/cliente/redefinirSenha/${cli.idUsuario }"/>" class="btn btn-outline-primary btn-sm">Redefinir Senha</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</tags:template>