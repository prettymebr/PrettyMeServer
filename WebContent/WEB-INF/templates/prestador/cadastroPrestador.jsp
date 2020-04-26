<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<tags:template titulo="Pagina de teste">


	<h1 class="text-center">Cadastro de Prestador</h1>


	<c:if test="${not empty msg }">
		<div class="alert alert-success">${msg }</div>
	</c:if>

	<c:url value="/usuario/cadastrarCliente" var="acao" />
	<form:form action="#{acao }" method="post" commandName="prestador">

		<div class="form-group">
			<form:label path="nome">Nome</form:label>
			<form:input path="nome" cssClass="form-control" />

		</div>

		<div class="form-group">
			<form:label path="login">Login</form:label>
			<form:input path="login" cssClass="form-control" />

		</div>

		<div class="form-group">
			<form:label path="senha">senha</form:label>
			<form:password path="senha" cssClass="form-control" />

		</div>

		<div class="form-group">
			<form:label path="cpf">CPF</form:label>
			<form:input path="cpf" cssClass="form-control" />

		</div>
		<hr>

		<h2 class="text-center">Cadastro Endereco</h2>


		<div class="form-group">
			<form:label path="enderecos[0].cep">CEP</form:label>
			<form:input path="enderecos[0].cep" cssClass="form-control" />

		</div>
		<hr>

		<h2 class="text-center">Cadastro Estabelecimento</h2>

		<br>
		<input type="submit" value="Cadastrar" class="btn btn-primary">
	</form:form>



</tags:template>