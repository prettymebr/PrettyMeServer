<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap.min.css"/>">
<title>Login</title>
</head>
<body>
	<c:if test="${not empty msg }">
		<div class="alert alert-success">${msg }</div>
	</c:if>

	<h1 class="text-center">Pretty Me</h1>

	<main class="container">
		
		
		<form:form action="${ s:mvcUrl('CC#logarCliente').build() }" method="post" commandName="cliente">

			<div class="row">
				<div class="form-group col-6 offset-3">
					<form:input type="text" path="login" placeholder="CPF, E-mail ou Usuário"
						cssClass="form-control" />
				</div>

				<div class="form-group col-6 offset-3">
					<form:input type="password" path="senha" placeholder="Senha" cssClass="form-control" />
				</div>
			</div>
			<br>
			<div class="row">
				<a class="offset-3 col-9" href="https://www.google.com.br/">Esqueci minha senha</a>
				<br><input type="submit" value="Login" class="btn btn-primary offset-5 col-3" />
			</div>

		</form:form>
	</main>
	<script src="<c:url value="/resources/js/jquery-3.3.1.min.js"/>"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
</body>
</html>