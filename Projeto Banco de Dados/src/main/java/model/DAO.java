package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.bean.Autor;
import model.bean.Emprestimo;
import model.bean.Exemplar;
import model.bean.Livro;
import model.bean.Usuario;

// TODO: Auto-generated Javadoc
/**
 * The Class DAO.
 */
public class DAO {

	/** The driver. */
	private String driver = "com.mysql.cj.jdbc.Driver";

	/** The url. */
	private String url = "jdbc:mysql://127.0.0.1:3306/projetobiblioteca?useTimezone=true&serverTimezone=UTC";

	/** The user. */
	private String user = "root";

	/** The password. */
	private String password = "@Senha135";

	/**
	 * Conectar.
	 *
	 * @return the connection
	 */
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * Listar livros.
	 *
	 * @return the array list
	 */
	public ArrayList<Livro> listarLivros() {
		ArrayList<Livro> livros = new ArrayList<>();
		String read = "SELECT * FROM livro";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);

				Autor autor = new Autor();
				autor.setId_autor(rs.getString(2));

				String titulo = rs.getString(3);
				String numPag = rs.getString(4);
				String ano = rs.getString(5);

				livros.add(new Livro(id, autor, titulo, numPag, ano));
			}
			con.close();
			return livros;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * Listar usuarios.
	 *
	 * @return the array list
	 */
	public ArrayList<Usuario> listarUsuarios() {
		ArrayList<Usuario> usuarios = new ArrayList<>();
		String read = "SELECT * FROM usuario";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String nome = rs.getString(2);
				String cpf = rs.getString(3);
				String telefone = rs.getString(4);

				usuarios.add(new Usuario(id, nome, cpf, telefone));
			}
			con.close();
			return usuarios;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * Listar view.
	 *
	 * @return the array list
	 */
	public ArrayList<String> listarView() {
		ArrayList<String> brasileiros = new ArrayList<>();
		String read = "SELECT * FROM brasileiros";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				String nome = rs.getString(1);

				brasileiros.add(nome);
			}
			con.close();
			return brasileiros;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * Listar exemplares.
	 *
	 * @return the array list
	 */
	// CRUD READ EXEMPLARES
	public ArrayList<Exemplar> listarExemplares() {
		ArrayList<Exemplar> exemplar = new ArrayList<>();
		String read = "SELECT * FROM exemplar";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);

				Livro livro = new Livro();
				livro.setId_livro(rs.getString(2));

				exemplar.add(new Exemplar(id, livro));
			}
			con.close();
			return exemplar;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * Insere emprestimo.
	 *
	 * @param e the e
	 */
	public void insereEmprestimo(Emprestimo e) {
		String create = "INSERT INTO emprestimo(id_emprestimo, id_usuario, id_exemplar, data) VALUES (?,?,?,?)";
		try {
			Connection con = conectar();
			
			PreparedStatement pst = con.prepareStatement(create);
			
			pst.setString(1, e.getId_emprestimo());
			pst.setString(2, e.getUsuario().getId_usuario());
			pst.setString(3, e.getExemplar().getId_exemplar());
			pst.setString(4, e.getData());

			System.out.println(pst);
			
			pst.executeUpdate();
			
			con.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	/**
	 * Realiza transaction.
	 *
	 * @param u the u
	 */
	public void realizaTransaction(Usuario u) {
		String t1 = "START TRANSACTION;";
		String t2 = "DELETE FROM usuario WHERE id_usuario = 206;";
		String t3 = "INSERT INTO usuario(id_usuario, nome, cpf, telefone) VALUES (?, ?, ?, ?);";
		String t4 = "COMMIT;";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(t1);
			pst.executeQuery();
			pst = con.prepareStatement(t2);
			pst.executeUpdate();
			pst = con.prepareStatement(t3);
			pst.setString(1, u.getId_usuario());
			pst.setString(2, u.getNome());
			pst.setString(3, u.getCpf());
			pst.setString(4, u.getTelefone());
			pst.executeUpdate();
			pst = con.prepareStatement(t4);
			pst.executeQuery();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Listar join.
	 *
	 * @return the array list
	 */
	public ArrayList<String> listarJoin() {
		ArrayList<String> lista = new ArrayList<String>();
		String join = "SELECT emprestimo.id_usuario, usuario.nome, livro.titulo, exemplar.id_exemplar, emprestimo.data FROM emprestimo\r\n"
				+ "INNER JOIN usuario\r\n" + "ON emprestimo.id_usuario = usuario.id_usuario\r\n"
				+ "INNER JOIN exemplar\r\n" + "ON emprestimo.id_exemplar = exemplar.id_exemplar\r\n"
				+ "INNER JOIN livro\r\n" + "ON exemplar.id_livro = livro.id_livro;";

		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(join);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				lista.add(rs.getString(1));
				lista.add(rs.getString(2));
				lista.add(rs.getString(3));
				lista.add(rs.getString(4));
				lista.add(rs.getString(5));
			}
			con.close();
			return lista;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
