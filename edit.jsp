<%@page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<title>Edicao de Informacoes</title>
	</head>

	<body>
		<form>
			<fieldset>
				Autor: <input type="text" name="author"></input> <br/>
				Titulo: <input type="text" name="bookTile"></input> <br/>
				Disponibilidade:
				<input type="checkbox" name="available" value="Disponivel">
				<input type="checkbox" name="available" value="Indisponivel">
				<input type="submit" value="Salvar edicoes" />
				<input type="hidden" value="edit" name="action" />
				<!-- Desculpe-me, nao consegui pensar em outro jeito sem scriptlet :(  -->
				<input type="hidden" value="<%= request.getParameter("id") %>" name="id"/>
			</fieldset>
		</form>
	</body>
</html>
