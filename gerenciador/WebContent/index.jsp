<%@ taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
 Bem vindo ao nosso gerenciador de empresas!<br/>

<c:if test="${not empty usuarioLogado}">
	Logado como ${usuarioLogado.email}<br/>
	
</c:if> 



<FORM action="novaEmpresa" method="post">  				      
      Nome: <input type= "text" name="nome">
      <input type="Submit" value="Enviar">
</FORM>

<FORM action="login" method="post">

	Email :<input type= "email" name="email" />
	Senha :<input type= "password" name="senha" />
	<input type="Submit" value="Enviar" />
</FORM>


<form action ="executa" method="post">
	<input type="hidden" name="tarefa" value=""Logout/>
	<input type="Submit" value= "Deslogar" />



</body>
</html>

