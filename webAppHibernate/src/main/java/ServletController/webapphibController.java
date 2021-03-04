package ServletController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;
import dao.AdminDaoImpl;
import entity.User;


public class webapphibController extends HttpServlet {
	private AdminDao metier;

	@Override
	public void init() throws ServletException {
		// instancier la couche metier
		metier = new AdminDaoImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		if (path.equals("/index.php")) {
			req.getRequestDispatcher("users.jsp").forward(req, resp);

		} else if (path.equals("/chercher.php")) {
			// lire le mot cle
			String motCle = req.getParameter("motCle");
			// appler couche metier pour recupere list des articles
			UserModel model = new UserModel();
			// stocker le mocle dans le model
			model.setMotCle(motCle);
			List<User> users = metier.findUser("%" + motCle + "%");
			// stocker le list article dans le model
			model.setUsers(users);
			// stocker le model dans obj request
			req.setAttribute("model", model);
			req.getRequestDispatcher("users.jsp").forward(req, resp);

		} else if (path.equals("/ajouter.php")) {
			req.setAttribute("user", new User()); // default value in input
			req.getRequestDispatcher("AjouterUsers.jsp").forward(req, resp);

		} else if (path.equals("/SaveUser.php") && (req.getMethod().equals("POST"))) {
			// lire le parametre url

			String name = req.getParameter("name");
			String email = req.getParameter("email");
			int phone = Integer.parseInt(req.getParameter("phone"));
			String password = req.getParameter("password");
			User p = metier.save(new User(name, email, phone, password));
			req.setAttribute("user", p);
			req.getRequestDispatcher("confirmation.jsp").forward(req, resp);

		} 
//		else if (path.equals("/supprimer.php")) {
//			int id = Integer.parseInt(req.getParameter("id"));
//			metier.deleteArticle(id);
//			// req.getRequestDispatcher("articles.jsp").forward(req, resp);
//			resp.sendRedirect("chercher.php?motCle=");
//		} else if (path.equals("/edit.php")) {
//			int id = Integer.parseInt(req.getParameter("id"));
//			Article p = metier.getArticle(id);
//			req.setAttribute("article", p);
//			req.getRequestDispatcher("EditArticle.jsp").forward(req, resp);
//		} else if (path.equals("/UpdateArticle.php") && (req.getMethod().equals("POST"))) {
//			int id = Integer.parseInt(req.getParameter("id"));
//			String nm = req.getParameter("nom");
//			int qtt = Integer.parseInt(req.getParameter("quantite"));
//			String typ = req.getParameter("type");
//			int prx = Integer.parseInt(req.getParameter("prix"));
//
//			Article p = new Article(nm, qtt, typ, prx);
//			p.setId(id);
//			metier.update(p);
//			req.setAttribute("article", p);
//			req.getRequestDispatcher("confirmation.jsp").forward(req, resp);
//
//		} 
			else {
			resp.sendError(resp.SC_NOT_FOUND);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
