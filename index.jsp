<%@page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<title>.: Biblioteca do ICMC :.</title>
	</head>

	<body>
		<jsp:useBean id="bookList" class="java.util.ArrayList" scope="session"/>
		<table style="text-align:center">
			<tr>
				<th>Autor</th>
				<th>Titulo</th>
				<th>Disponibilidade</th>
				<th></th>
				<th></th>
			</tr>

			<c:forEach var="book" items="${bookList}" varStatus="status">
				<tr>
					<td>${book.author}</td>
					<td>${book.bookTitle}</td>
					<td><input type="checkbox" readonly ${book.available?'checked':''}/></td>
 <td> <a href="/pratica_web/edit.jsp?author=${book.author}&title=${book.bookTitle}&available=${book.available}&id=${status.index}">Editar</a></td>
					<td><a href="/pratica_web/book/action?action=delete&id=${status.index}">Deletar</a></td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>
