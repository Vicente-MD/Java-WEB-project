/**
 * Validação de formulário
 */

function validar() {
	let id_emprestimo = formEmprestimo.id_emprestimo.value
	let id_usuario = formEmprestimo.id_usuario.value
	let id_exemplar = formEmprestimo.id_exemplar.value
	let data = formEmprestimo.data.value
	
	if (id_emprestimo === "") {
		alert("Preencha o campo 'ID EMPRESTIMO'")
		formEmprestimo.id_emprestimo.focus
		return false
	}
	else if (id_usuario === "") {
		alert("Preencha o campo 'ID USUARIO'")
		formEmprestimo.id_usuario.focus
		return false
	}
	else if (id_exemplar === "") {
		alert("Preencha o campo 'ID EXEMPLAR'")
		formEmprestimo.id_exemplar.focus
		return false
	} else if(data === ""){
		alert("Preencha o campo 'DATA'")
		formEmprestimo.data.focus
		return false
	}
	else {
		document.forms["formEmprestimo"].submit()
	}
}

function validarTransaction() {
	let id_usuario = formTransaction.id.value
	let nome = formTransaction.nome.value
	let cpf = formTransaction.cpf.value
	let telefone = formTransaction.telefone.value
	
	if (id_usuario === "") {
		alert("Preencha o campo 'ID'")
		formTransaction.id_usuario.focus
		return false
	}
	else if (nome === "") {
		alert("Preencha o campo 'NOME'")
		formTransaction.nome.focus
		return false
	}
	else if (cpf === "") {
		alert("Preencha o campo 'CPF'")
		formTransaction.cpf.focus
		return false
	} else if(telefone === ""){
		alert("Preencha o campo 'TELEFONE'")
		formTransaction.telefone.focus
		return false
	}
	else {
		document.forms["formTransaction"].submit()
	}
}

