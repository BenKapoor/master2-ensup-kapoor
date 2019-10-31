package master2.ensup.kapoor.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.master2.ensup.kapoor.domaine.Annonce;
import org.master2.ensup.kapoor.domaine.Personne;
import org.master2.ensup.kapoor.service.AnnonceService;

/**
 * Servlet implementation class GestionAnnoncesServlet
 */
@WebServlet("/GestionAnnoncesServlet")
public class GestionAnnoncesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AnnonceService service = new AnnonceService();
	Personne personne = new Personne();
	Annonce annonce = new Annonce();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionAnnoncesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("message", service.creerAnnonce(personne, annonce));
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
