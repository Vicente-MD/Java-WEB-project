package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.bean.Emprestimo;
import model.bean.Exemplar;
import model.bean.Livro;
import model.bean.Usuario;

// TODO: Auto-generated Javadoc
/**
 * Servlet implementation class Controller.
 */
@WebServlet(urlPatterns = { "/Controller", "/livros", "/usuarios", "/autoresBrasileiros", "/novoEmprestimo",
		"/transacao", "/listaJoin" })
public class Controller extends HttpServlet {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The dao. */
	DAO dao = new DAO();

	/** The livro. */
	Livro livro = new Livro();

	/**
	 * Instantiates a new controller.
	 *
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Do get.
	 *
	 * @param request  the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException      Signals that an I/O exception has occurred.
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/livros")) {
			listarLivros(request, response);
		} else if (action.equals("/usuarios")) {
			listarUsuarios(request, response);
		} else if (action.equals("/autoresBrasileiros")) {
			listarView(request, response);
		} else if (action.equals("/novoEmprestimo")) {
			adicionarEmprestimo(request, response);
		} else if (action.equals("/transacao")) {
			alterarUsuario(request, response);
		} else if (action.equals("/listaJoin")) {
			listarJoin(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}

	/**
	 * Listar livros.
	 *
	 * @param request  the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException      Signals that an I/O exception has occurred.
	 */
	protected void listarLivros(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Livro> lista = dao.listarLivros();
		System.out.println("lista --> " + lista);
		request.setAttribute("lista", lista);
		RequestDispatcher rd = request.getRequestDispatcher("listadelivros.jsp");
		rd.forward(request, response);
	}

	/**
	 * Listar usuarios.
	 *
	 * @param request  the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException      Signals that an I/O exception has occurred.
	 */
	protected void listarUsuarios(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Usuario> lista = dao.listarUsuarios();
		System.out.println("lista --> " + lista);
		request.setAttribute("lista", lista);
		RequestDispatcher rd = request.getRequestDispatcher("listadeusuarios.jsp");
		rd.forward(request, response);
	}

	/**
	 * Realizar transacao.
	 *
	 * @param request  the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException      Signals that an I/O exception has occurred.
	 */
	protected void realizarTransacao(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Usuario> lista = dao.listarUsuarios();
		request.setAttribute("lista", lista);
		RequestDispatcher rd = request.getRequestDispatcher("transaction.jsp");
		rd.forward(request, response);
	}

	/**
	 * Listar view.
	 *
	 * @param request  the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException      Signals that an I/O exception has occurred.
	 */
	protected void listarView(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<String> lista = dao.listarView();
		System.out.println("lista --> " + lista);
		request.setAttribute("lista", lista);
		RequestDispatcher rd = request.getRequestDispatcher("listadaview.jsp");
		rd.forward(request, response);
	}

	/**
	 * Adicionar emprestimo.
	 *
	 * @param request  the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException      Signals that an I/O exception has occurred.
	 */
	protected void adicionarEmprestimo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Emprestimo e = new Emprestimo();
		Usuario u = new Usuario();
		Exemplar ex = new Exemplar();

		ArrayList<Usuario> usuario = dao.listarUsuarios();
		ArrayList<Exemplar> exemplar = dao.listarExemplares();

		request.setAttribute("usuario", usuario);
		request.setAttribute("exemplar", exemplar);

		e.setId_emprestimo(request.getParameter("id_emprestimo"));
		u.setId_usuario(request.getParameter("id_usuario"));
		e.setUsuario(u);
		ex.setId_exemplar(request.getParameter("id_exemplar"));
		e.setExemplar(ex);
		e.setData(request.getParameter("data"));

		dao.insereEmprestimo(e);

		RequestDispatcher rd = request.getRequestDispatcher("emprestimo.jsp");
		rd.forward(request, response);

	}

	/**
	 * Alterar usuario.
	 *
	 * @param request  the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException      Signals that an I/O exception has occurred.
	 */
	protected void alterarUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Usuario u = new Usuario();

		u.setId_usuario(request.getParameter("id"));
		u.setNome(request.getParameter("nome"));
		u.setCpf(request.getParameter("cpf"));
		u.setTelefone(request.getParameter("telefone"));

		dao.realizaTransaction(u);

		realizarTransacao(request, response);

		RequestDispatcher rd = request.getRequestDispatcher("transaction.jsp");
		rd.forward(request, response);
	}

	/**
	 * Listar join.
	 *
	 * @param request  the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException      Signals that an I/O exception has occurred.
	 */
	protected void listarJoin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<String> lista = dao.listarJoin();

		request.setAttribute("lista", lista);

		RequestDispatcher rd = request.getRequestDispatcher("listajoin.jsp");
		rd.forward(request, response);
	}

}
