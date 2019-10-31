package master2.ensup.kapoor.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.master2.ensup.kapoor.domaine.Personne;
import org.master2.ensup.kapoor.service.PersonneService;


/**
 * Servlet implementation class GestionPersonne
 */
@WebServlet("/GestionPersonne")
public class GestionPersonneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	PersonneService service = new PersonneService();
	Personne personne = new Personne();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionPersonneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("message", service.creerPersonne(personne));
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
