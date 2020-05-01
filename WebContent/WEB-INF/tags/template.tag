<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="titulo" required="true" %>
<%@ attribute name="script" fragment="true"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PrettyMe | ${titulo}</title>
<link rel="stylesheet" type="text/css" 
		href="<c:url value="/resources/css/bootstrap.min.css"/>">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <a class="navbar-brand" href="#">PrettyMe</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	
	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <ul class="navbar-nav mr-auto">
	    <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	          Gerenciamento de Cliente
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
	          <a class="dropdown-item" href="<c:url value="/cliente/cadastrarCliente"/>">Cadastrar Cliente</a>
	          <a class="dropdown-item" href="<c:url value="/cliente/listarClientes"/>">Listar Clientes</a>
	        </div>
	      </li>
	      <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	          Gerenciamento de Prestador
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
	          <a class="dropdown-item" href="<c:url value="/prestador/cadastrarPrestador"/>">Cadastrar Prestador</a>
	          <a class="dropdown-item" href="<c:url value="/prestador/listarPrestador"/>">Listar Prestadores</a>
	        </div>
	      </li>
	    </ul>
	  </div>
	</nav>
	
	<div class="container">
		<jsp:doBody/>
	</div>
	
	<footer class="text-center">
		Todos os direitos reservados &copy; - 2020
	</footer>
	
	<script src="<c:url value="/resources/js/jquery-3.3.1.min.js"/>"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value="/resources/js/prettyJavaScript.js"/>"></script>
	<jsp:invoke fragment="script"></jsp:invoke>
</body>
</html>




