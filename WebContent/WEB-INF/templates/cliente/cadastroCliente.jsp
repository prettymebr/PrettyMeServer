<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<tags:template titulo="Pagina de teste">

	<h1 class="text-center">Cadastro de Cliente</h1>

	<c:if test="${not empty msg }">
		<div class="alert alert-success">${msg }</div>
	</c:if>

	<c:url value="/usuario/cadastrarCliente" var="acao" />
	<form:form action="#{acao }" method="post" modelAttribute="cliente">

		<div class="row">
			<div class="form-group col-sm-12 col-md-12 col-lg-6 col-xl-6 ">
				<form:label path="nome">Primeiro Nome</form:label>
				<form:input path="nome" cssClass="form-control" />
			</div>

			<div class="form-group col-sm-12 col-md-12 col-lg-6 col-xl-6">
				<form:label path="sobrenome">Sobrenome Completo</form:label>
				<form:input path="sobrenome" cssClass="form-control" />
			</div>

			<div class="form-group col-sm-6 col-md-6 col-lg-3 col-xl-3">
				<form:label path="dataNascimento">Data de Nascimento</form:label>
				<form:input path="dataNascimento" cssClass="form-control data" />
			</div>

			<div class="form-group col-sm-6 col-md-6 col-lg-3 col-xl-3">
				<form:label path="cpf">CPF</form:label>
				<form:input path="cpf" cssClass="form-control cpf" />
			</div>

			<div class="form-group col-sm-6 col-md-6 col-lg-3 col-xl-3">
				<form:label path="rg">RG</form:label>
				<form:input path="rg" cssClass="form-control" />
			</div>

			<div class="form-group col-sm-6 col-md-6 col-lg-3 col-xl-3">
				<form:label path="apelido">Apelido</form:label>
				<form:input path="apelido" cssClass="form-control" />
			</div>

			<div class="form-group col-6">
				<form:label path="estadoCivil">Estado Cívil</form:label>
				<form:select path="estadoCivil" cssClass="form-control">
					<option>Selecione</option>
					<form:options items="${estados }" itemLabel="label" />
				</form:select>
			</div>

			<div class="form-group col-6">
				<form:label path="sexo">Sexo</form:label>
				<form:select path="sexo" cssClass="form-control">
					<option>Selecione</option>
					<form:options items="${sexos }" itemLabel="label" />
				</form:select>
			</div>

			<div class="form-group  col-12">
				<form:label path="email">E-mail</form:label>
				<form:input path="email" cssClass="form-control" />

			</div>

			<div class="form-group  col-6">
				<form:label path="login">login</form:label>
				<form:input path="login" cssClass="form-control" />

			</div>

			<div class="form-group col-6">
				<form:label path="senha">senha</form:label>
				<form:password path="senha" cssClass="form-control" />
			</div>
		</div>

		<hr>
		<h2 class="text-center">Endereço</h2>

		<div class="row">
			<div class="form-group col-4">
				<form:label path="enderecos[0].cep">CEP</form:label>
				<form:input path="enderecos[0].cep" cssClass="form-control cep" id="cep" />
			</div>
			<div class="form-group col-4">
				<form:label path="enderecos[0].logradouro">Logradouro</form:label>
				<form:input path="enderecos[0].logradouro" cssClass="form-control"
					id="logradouro" />
			</div>
				<div class="form-group col-4">
				<form:label path="enderecos[0].numero">Número</form:label>
				<form:input path="enderecos[0].numero" cssClass="form-control"
					id="complemento" />
			</div>
			<div class="form-group col-4">
				<form:label path="enderecos[0].complemento">Complemento</form:label>
				<form:input path="enderecos[0].complemento" cssClass="form-control"
					id="complemento" />
			</div>
			<div class="form-group col-4">
				<form:label path="enderecos[0].bairro">Bairro</form:label>
				<form:input path="enderecos[0].bairro" cssClass="form-control"
					id="bairro" />
			</div>
			<div class="form-group col-4">
				<form:label path="enderecos[0].localidade">Cidade</form:label>
				<form:input path="enderecos[0].localidade" cssClass="form-control"
					id="cidade" />
			</div>
			<div class="form-group col-4">
				<form:label path="enderecos[0].uf">Estado</form:label>
				<form:input path="enderecos[0].uf" cssClass="form-control" id="uf" />
			</div>
		</div>
		<input type="submit" value="Cadastrar"
			class="btn form-control btn-primary">
	</form:form>
	<br />
	<br />
		<div class="fb-login-button" data-size="large"	data-button-type="continue_with" data-layout="default" data-auto-logout-link="false" data-use-continue-as="false"
		data-width="400px"></div>
	<br />
	<br />
	<div id="my-signin2" class="g-signin2" data-width="300" data-height="200" data-longtitle="true" data-width="400px"></div>
	<br />
	<br />
	<script src="https://apis.google.com/js/platform.js?onload=renderButton" async defer></script>
</tags:template>