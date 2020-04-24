<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<tags:template titulo="Pagina de teste">

<h1>Cadastro de Cliente</h1>

<c:if test="${not empty msg }">
		<div class="alert alert-success">${msg }</div>
	</c:if>

	<c:url value="/usuario/cadastrarCliente" var="acao" />
	<form:form action="#{acao }" method="post" commandName="cliente">
		
		<div class="form-group">
			<form:label path="nome">Nome</form:label>
			<form:input path="nome" cssClass="form-control" />
			
		</div>
		
		<div class="form-group">
			<form:label path="usuario">usuario</form:label>
			<form:input path="usuario" cssClass="form-control" />
			
		</div>
		
		<div class="form-group">
			<form:label path="senha">senha</form:label>
			<form:password path="senha" cssClass="form-control" />
			
		</div>
		
		<div class="form-group">
			<form:label path="cpf">CPF</form:label>
			<form:input path="cpf" cssClass="form-control" />
			
		</div>
		
		<div class="form-group">
			<form:label path="endereco">CEP</form:label>
			<form:input path="endereco" cssClass="form-control" />
			
		</div>
		
		
		
		<div class="form-group">
			<form:label path="agendamentos">Agendamento</form:label>
			<form:input path="agendamentos" cssClass="form-control" />
			
		</div>
		<div class="form-group">
			<form:label path="rate">Rate</form:label>
			<form:input path="rate" cssClass="form-control" />
		</div>
				<input type="submit" value="Cadastrar" class="btn btn-primary">
	</form:form>


</tags:template>