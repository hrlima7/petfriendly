<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="../home/head.jsp"%>
</head>
<body>
<%@include file="../home/menu.jsp"%>

	<h1>Cadastro do Animal</h1>
	
	
	<c:url value="/animal/cadastrar" var="action" />
	<form:form action="${action }" method="POST" commandName="animal">
		
		   <div class="form-group">
          		<label for="nome">Nome do Animal:</label><span>*</span>
        		<input type="text"name="nome" id="nome" class="form-control" placeholder="Insira o nome do animal"required>
		<div class="form-group">
              <label for="especie">Especie:</label><span>*</span>
              <input type="text"name="especie" id="especie" class="form-control" placeholder="Insira a especie"required>
		</div>
		<div class="form-group">
              <label for="raca">Raça :</label><span>*</span>
              <input type="text"name="raca" id="raca" class="form-control" placeholder="Insira a Raça"required>
		</div>
		<input type="submit" value="Salvar" class="btn btn-primary">
	</form:form>

</body>
</html>