
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html>
<html lang="pt-br">

<head>
<%@include file="head.jsp"%>
</head>

<body class="Xindex-custom d-flex flex-column h-100">

	<%@include file="menu.jsp"%>

${msg}
	<main class="container-fluid d-flex flex-wrap align-content-center justify-content-center">

		<div class="login w-25 h-50">
			<div class="login-form w-100 m-auto">
				<div class="login-form-wrapper">
					<form action="dashboard" method="post">
						<div class="form-group">
							<label for="input-email">Email</label> 
							<input type="text" id="input-email" name="email" class="form-control" placeholder="Digite seu email">
						</div>
						<div class="form-group">
							<label for="input-senha">Senha</label> 
							<input type="password" id="input-senha" name="senha" class="form-control" placeholder="Password">
						</div>
						<div class=" d-flex justify-content-center">
							<div class="w-100">
								<button type="submit" class="btn btn-lg btn-primary btn-block ">Login</button>
							</div>
<!-- 							
							<div class="w-50">
								<p class="text-right mt-4"> <a href="/cadastro/cadastrar">Faça o seu Registro</a> </p>
							</div>
 -->							
						</div>
					</form>
					
							<div class="w-100">
								<a class="btn btn-lg btn-info btn-block " role="button" aria-pressed="true"href='<c:url value="/cadastro/cadastrar"/>'>Novo cadastro</a>
							</div>
<!-- 							
						
 -->							
						</div>
				</div>
			</div>
		</div>
	
	</main>

	<!-- JavaScript -->
	<%@include file="scripts.jsp"%>
	
</body>

</html>