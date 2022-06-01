package fr.d3us.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import fr.d3us.bll.FilmBll;
import fr.d3us.bo.Film;


/**
 * Servlet implementation class afficherFilmServlet
 */
@WebServlet("/listeFilms")
public class afficherFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public afficherFilmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	@Autowired
	private FilmBll bll;
    
	@Override
	public void init() throws ServletException {
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/listerFilms.jsp");
		for(Film current : bll.selectAll())
		{
			request.setAttribute("id", current.getId());
			request.setAttribute("titre", current.getTitre());
			request.setAttribute("duree", current.getDuree());
			request.setAttribute("vu", current.isVu());
			request.setAttribute("id", current.getId());
			request.setAttribute("id", current.getId());
			request.setAttribute("id", current.getId());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
