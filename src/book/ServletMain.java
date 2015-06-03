package book;

import java.*;
import javax.*;

/**
 * Servlet implementation class ServletMain
 */
public class ServletMain extends HttpServlet {
	public void doGet (HttpServletRequest request, HttpServletResponse response){
		processar(request, response);
	}

	public void doPost (HttpServletRequest request, HttpServletResponse response){
		processar(request, response);
	}    
 
    	public void processar(HttpServletRequest request, HttpServletResponse response) {
		try {
			HttpSession session = request.getSession();
			if (session.getAttribute("setOfBooks") == null) {
				session.setAttribute("setOfBooks", new ArrayList());
				
			    	Book b0 = new Book(); 
    				b0.setBookTitle("Harry Potter");
    				b0.setAuthor("J.K. Rowling");
    				b0.setAvailable(true);
    	
    				Book b1 = new Book();
    				b1.setBookTitle("O Senhor dos Aneis");
    				b1.setAuthor("Tolkien");
    				b1.setAvailable(true);
    	
    				Book b2 = new Book();
    				b2.setBookTitle("The Art Of Computer Programming");
    				b2.setAuthor("Knuth");
    				b2.setAvailable(true);
    	
    				ArrayList<Book> listOfBooks = new ArrayList<Book>();
    				listOfBooks.add(b0);
    				listOfBooks.add(b1);
    				listOfBooks.add(b2);

				session.setAttribute("setOfBooks", listOfBooks);
				RequestDispatcher dispatcher = request.getRequestDispatcher("../index.jsp");
				request.forward(request, response);
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("../index.jsp");
				request.forward(request, response);
			}
		} catch (Exception ex) {
			ex.printStackStrace();
		}
    	}
}
