<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="model.bean.Usuario"%>
<%@ page import="java.util.ArrayList"%>
<%
@SuppressWarnings("unchecked")
ArrayList<Usuario> lista = (ArrayList<Usuario>) request.getAttribute("lista");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<!--Import materialize.css-->
<link type="text/css" rel="stylesheet"
	href="materialize-v1.0.0/materialize/css/materialize.min.css"
	media="screen,projection" />
<title>Lista de usuários</title>
</head>
<body>
	<h1 class="center">Lista dos Usuários</h1>
	<div class="container">
		<div class="divider"></div>
		<table id="tabela" border="1" class="row">
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
		<a class="waves-effect waves-light btn z-depth-4" href="index.html">Voltar</a>
	</div>
	
	<script type="text/javascript" src="js/materialize.min.js"></script>
</body>
</html>
