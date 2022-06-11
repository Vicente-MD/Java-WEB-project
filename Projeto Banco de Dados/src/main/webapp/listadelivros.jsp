<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.bean.Livro"%>
<%@ page import="model.bean.Autor"%>
<%@ page import="java.util.ArrayList"%>
<%
@SuppressWarnings("unchecked")
ArrayList<Livro> lista = (ArrayList<Livro>) request.getAttribute("lista");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<!--Import materialize.css-->
<link type="text/css" rel="stylesheet"
	href="materialize-v1.0.0/materialize/css/materialize.min.css"
	media="screen,projection" />
<title>Lista dos livros</title>
</head>
<body>
	<h1 class="center">Lista dos Livros</h1>
	<div class="container">
		<div class="divider"></div>
		<table id="tabela" border="1" class="striped row responsive-table">
		
			<thead>
				<tr>
					<th>ID do Livro</th>
					<th>ID do autor</th>
					<th>Nome do Livro</th>
					<th>Número de páginas</th>
					<th>Ano de Publicação</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<%
					for (int i = 0; i < lista.size(); i++) {
					%>
					<th><%=lista.get(i).getId_livro()%></th>
					<th><%=lista.get(i).getAutor().getId_autor()%></th>
					<th><%=lista.get(i).getTitulo()%></th>
					<th><%=lista.get(i).getNum_pag()%></th>
					<th><%=lista.get(i).getAno()%></th>
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