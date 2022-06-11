<%@page import="model.bean.Exemplar"%>
<%@page import="model.bean.Usuario"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%
@SuppressWarnings("unchecked")
ArrayList<Usuario> usuario = (ArrayList<Usuario>) request.getAttribute("usuario");
%>
<%
@SuppressWarnings("unchecked")
ArrayList<Exemplar> exemplar = (ArrayList<Exemplar>) request.getAttribute("exemplar");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<!--Import materialize.css-->
<link type="text/css" rel="stylesheet"
	href="materialize-v1.0.0/materialize/css/materialize.min.css"
	media="screen,projection" />
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<title>Adicionando empréstimo</title>
</head>
<body>
	<div class="addconversa">
		<h1 class="center">Adicionar empréstimo</h1>
		<form name="formEmprestimo" action="novoEmprestimo" class="container">
			<div class="divider"></div>
			<table class="row">
				<tr>
					<td class="input-field col s6"><input type="text"
						name="id_emprestimo" placeholder="Id do empréstimo"
						class="Caixatxt"
						onkeypress="return event.charCode >= 48 && event.charCode <= 57"></td>
				</tr>
				<tr>
					<td class="input-field col s6"><select class="browser-default"
						name="id_usuario">
							<option value="" disabled selected>Selecione o ID do
								usuário</option>
							<%
							for (int i = 0; i < usuario.size(); i++) {
							%>
							<option value="<%=usuario.get(i).getId_usuario()%>"><%=usuario.get(i).getId_usuario()%></option>
							<%
							}
							%>
					</select></td>
				</tr>
				<tr>
					<td class="input-field col s6"><select class="browser-default"
						name="id_exemplar">
							<option value="" disabled selected>Selecione o ID do
								exemplar</option>
							<%
							for (int i = 0; i < exemplar.size(); i++) {
							%>
							<option value="<%=exemplar.get(i).getId_exemplar()%>"><%=exemplar.get(i).getId_exemplar()%></option>
							<%
							}
							%>
					</select></td>
				</tr>
				<tr>
					<td class="input-field col s4"><input type="date" name="data"
						placeholder="Data" class="Caixadata"></td>
				</tr>
			</table>
			<button type="button" class="waves-effect waves-light btn"
				onclick="validar()">
				<i class="material-icons left">library_add</i>Adicionar
			</button>

		</form>
		<a class="waves-effect waves-light btn z-depth-4" href="index.html">Voltar</a>
	</div>


	<script src="scripts/validador.js"></script>
	<script type="text/javascript" src="scripts/materialize.min.js"></script>
</body>
<style>
a {
	margin-left: 18%;
	margin-top: 2%;
}
</style>
</html>