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


	

	<a class="btn btn-lg btn-info btn-block " role="button" 
	aria-pressed="true"href='<c:url value="/animal/cadastro"/>'>Novo cadastro</a>
	
	<c:url value="/animal/listarPornome" var="link"/>
	 <a href="${link}" class="btn btn-secondary btn-sm">Listar por nome</a>
 ${msg}
 <table class="table">
		<tr>
			<th>Nome</th>
			<th>Especie</th>
			<th>Raça</th>
			
		</tr>
		<c:forEach items="${animal }" var="a">
			<tr>
				<td>${a.nome }</td>
				<td>${a.especie }</td>
				<td>${a.raca }</td>
				
				<td>
					<c:url value="/animal/editar/${a.idUsuario }" var="link"/>
					<a href="${link}" class="btn btn-primary btn-sm">Editar</a>
					<button type="button" onclick="codigo.value = ${a.idUsuario}" class="btn btn-danger btn-sm" data-toggle="modal" data-target="#excluirModal">
	 					Excluir
					</button>
				</td>
			</tr>
		</c:forEach>
	</table>
 
 
 
 
 
 
 
</body>
</html>