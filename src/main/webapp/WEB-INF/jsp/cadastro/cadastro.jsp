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


	<c:url value="/cadastro/cadastrar" var="action" />
	<form:form action="${action }" method="POST" commandName="proprietario">
		<div class="cadastro">
                        <h3>Novo Cadastro</h3>
                  
                                <div class="form-group">
                                    <label for="nome">Nome:</label><span>*</span>
                                    <input type="text"name="nome" id="nome"   class="form-control" placeholder="Insira seu Nome"required>
                                </div>
                                <div class="form-group">
                                    <label for="sobrenome">Sobre Nome:</label><span>*</span>
                                    <input type="text"id="sobrenome" name="sobreNome"  Class="form-control" placeholder="Sobre Nome" required>
                                </div>
                                <div class="form-group">
                                        <label for="email">Email:</label><span>*</span>
                                        <input type="email"id="email" name="email"  Class="form-control" placeholder="Sobre Nome" required>
                                
                                    </div>
                                    <legends class="col-form-label" >Sexo:</legends><span>*</span>
                                <div class="form-check">
                                        <input type="radio"id="sexo" class="form-check-input" name="sexo" value="m">
                                        <label  class="form-check-label" for="sexo">Masculino</label>
                                </div>
                                    <div class="form-check">
                                
                                            <input type="radio"id="feminino" class="form-check-input" name="sexo" value="f">
                                            <label  class="form-check-label" for="feminino">Feminino</label>
                                    </div>
                                    <div class="form-group data">
                                        <label for="idade">Data de Nascmento:</label><span>*</span>
                                        <input type="date" name="data" class="form-control" required>
                                    </div>
                                 
							            <label for="animal">Animal:</label>
							         
								           <div class="form-group col-md-4">
								           
		                        <label for="animal">Animal</label>
		                        
	                  		  </div>
							            <div class="form-group">
                                        <label for="senha">Senha:</label><span>*</span>
                                        <input type="password"id="senha" name="senha" class="form-control" required>
                                
                                    </div>
                                    
                                    <input type="submit"  value="cadastrar" class="btn btn-success">
                                    
      
	</form:form>
</body>
</html>