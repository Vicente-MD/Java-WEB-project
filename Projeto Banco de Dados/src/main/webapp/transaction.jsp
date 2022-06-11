<%@page import="model.bean.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
@SuppressWarnings("unchecked")
ArrayList<Usuario> lista = (ArrayList<Usuario>) request.getAttribute("lista");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet"
	href="materialize-v1.0.0/materialize/css/materialize.min.css"
	media="screen,projection" />
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<title>Alterar dados</title>
</head>
<body>
	<h1 class="center">Transaction</h1>

	<div class="container">
		<h3 class="center">Atual Lista de Usuários:</h3>
		<div class="divider"></div>
		<table id="tabela" border="1" class="striped row responsive-table">
			<thead>
				<tr>
					<th>ID do Usuário</th>
					<th>Nome</th>
					<th>CPF</th>
					<th>Número de telefone</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<%
					for (int i = 0; i < lista.size(); i++) {
					%>
					<th><%=lista.get(i).getId_usuario()%></th>
					<th><%=lista.get(i).getNome()%></th>
					<th><%=lista.get(i).getCpf()%></th>
					<th><%=lista.get(i).getTelefone()%></th>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
		<form name="formTransaction" action="transacao">
			<span>ID:</span> <input type="text" name="id" value="206"
				readonly="readonly"> <span>Insira o novo nome:</span> <input
				type="text" name="nome"> <span>Insira o novo CPF:</span> <input
				type="text" name="cpf"
				onkeypress="return event.charCode >= 48 && event.charCode <= 57">
			<span>Insira o novo telefone:</span> <input type="text"
				name="telefone"
				onkeypress="return event.charCode >= 48 && event.charCode <= 57">
			<button type="button" onclick="validarTransaction()"
				class="waves-effect waves-light btn">
				<i class="material-icons left">library_add</i>Alterar
			</button>
		</form>
		<a class="waves-effect waves-light btn z-depth-4" href="index.html">Voltar</a>
	</div>


	<script src="scripts/validador.js"></script>
	<script type="text/javascript" src="js/materialize.min.js"></script>
</body>
<style>
a {
	margin-top: 2%;
	margin-bottom: 5%;
}
</style>
</html>