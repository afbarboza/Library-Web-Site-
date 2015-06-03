package book;

import java.*;
import javax.*;

public class ServletCrud extends HttpServlet {
	public void doGet (HttpServletRequest request, HttpServletResponse response){
		processar(request, response);
	}

	public void doPost (HttpServletRequest request, HttpServletResponse response){
		processar(request, response);
	}

	public void processar(HttpServletRequest request, HttpServletResponse response){

		try{			
			HttpSession session = request.getSession();
			String url = null;
			String action = request.getParameter("action");
			ArrayList setOfBooks = (ArrayList) session.getAttribute("setOfBooks");

			if(action.equals("add")){

				ArrayList setOfBooks = (ArrayList) session.getAttribute("setOfBooks");

				Book new_book = new Book();
				new_book.setBookTitle(request.getParameter("bookTitle"));
				new_book.setAuthor(request.getParameter("author"));

				String is_available = request.getParameter("available");
				if (is_available.equals("Disponivel")) {
					new_book.setAvailable(true);
				} else {
					new_book.setAvailable(false);
				}
				setOfBooks.add(new_book);

				session.setAttribute("setOfBooks", setOfBooks);

			} else if (action.equals("edit")) {
				Book book = (Book) setOfBooks.get(Integer.parseInt(request.getParameter("id")));
				book.setTitle(request.getParameter("title"));
				book.setAuthor(request.getParameter("author"));
				String is_available = request.getParameter("available");
				if (is_available.equals("Disponivel")) {
					book.setAvailable(true);
				} else {
					book.setAvailable(false);
				}
				bookList.set(Integer.parseInt(request.getParameter("id")), book);
				session.setAttribute("setOfBooks", setOfBooks);
			} else if (action.equals("delete")) {
				setOfBooks.remove(Integer.parseInt(request.getParameter("id")));

				session.setAttribute("setOfBooks", setOfBooks);
			} else {
				url="erro.jsp";
				RequestDispatcher dispatcher = request.getRequestDispatcher("../erro.jsp");
				dispatcher.forward(request, response);
			}

			RequestDispatcher dispatcher = request.getRequestDispatcher("../index.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
