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

	<h1>Cadastro de estabelecimento</h1>
	
	
	<c:url value="/estabelecimento/cadastrarestab" var="action" />
	<form:form action="${action }" method="POST" commandName="estabelecimento">
		
		   <div class="form-group">
          		<label for="nomeEstabelecimento">Nome do Estabelecimento:</label><span>*</span>
        		<input type="text"name="nomeEstabelecimento" id="nomeEstabelecimento" class="form-control" placeholder="Insira o nome do estabelecimento"required>
		<div class="form-group">
              <label for="categoria">Categoria:</label><span>*</span>
              <input type="text"name="categoria" id="categoria" class="form-control" placeholder="Insira a categoria"required>
		</div>
		<input type="submit" value="Salvar" class="btn btn-primary">
	</form:form>

</body>
</html>