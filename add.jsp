<%@page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<title>Insercao de Novos Livros</title>
	</head>

	<body>
		<form action="/pratica_web/book/action">
			<fieldset>
				Autor: <input type="text" name="author"></input> <br/>
				Titulo: <input type="text" name="bookTitle"></input> <br/>
				Disponibilidade:
				<input type="checkbox" name="available" value="Disponivel">
				<input type="checkbox" name="available" value="Indisponivel">
				<input type="submit" value="Salvar edicoes" />
				<input type="hidden" value="add" name="action" />
			</fieldset>
		</form>
	</body>
</html>
