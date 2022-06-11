<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%
@SuppressWarnings("unchecked")
ArrayList<String> lista = (ArrayList<String>) request.getAttribute("lista");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<!--Import materialize.css-->
<link type="text/css" rel="stylesheet"
	href="materialize-v1.0.0/materialize/css/materialize.min.css"
	media="screen,projection" />
<title>Lista de usuários e seus empréstimos</title>
</head>
<body>
	<h1 class="center">Lista dos Usuários X Empréstimos (JOIN)</h1>

	<div class="container">
		<div class="divider"></div>
		<table id="tabela" border="1" class="responsive-table striped row">
			<thead>
				<tr>
					<th>Id do usuario</th>
					<th>Nome do usuário</th>
					<th>Título do livro</th>
					<th>ID do exemplar</th>
					<th>Data do empréstimo</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<%
					for (int i = 0; i < lista.size(); i++) {
					%>
					<th><%=lista.get(i)%></th>
					<th><%=lista.get(i + 1)%></th>
					<th><%=lista.get(i + 2)%></th>
					<th><%=lista.get(i + 3)%></th>
					<th><%=lista.get(i + 4)%></th>
				</tr>
				<%
				i = i + 4;

				}
				%>
			</tbody>
		</table>
		<a class="waves-effect waves-light btn z-depth-3" href="index.html">Voltar</a>
	</div>

	<script type="text/javascript" src="js/materialize.min.js"></script>
</body>
</html>
