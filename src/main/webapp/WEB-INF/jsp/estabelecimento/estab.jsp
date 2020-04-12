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
	aria-pressed="true"href='<c:url value="/estabelecimento/cadastrar"/>'>Novo cadastro</a>
	
	<c:url value="/estabelecimento/listarpornome" var="link"/>
	 <a href="${link}" class="btn btn-secondary btn-sm">Listar por nome</a>
 ${msg}
 <table class="table">
		<tr>
			<th>Nome</th>
			<th>Endereço</th>
			
		</tr>
		<c:forEach items="${estabelecimento }" var="e">
			<tr>
				<td>${e.nomeEstabelecimento }</td>
				<td>${e.categoria }</td>
				
				<td>
					<c:url value="/estacionamento/editar/${e.id }" var="link"/>
					<a href="${link}" class="btn btn-primary btn-sm">Editar</a>
					<button type="button" onclick="codigo.value = ${e.id}" class="btn btn-danger btn-sm" data-toggle="modal" data-target="#excluirModal">
	 					Excluir
					</button>
				</td>
			</tr>
		</c:forEach>
	</table>
 
 
 
 
 
 
 
</body>
</html>