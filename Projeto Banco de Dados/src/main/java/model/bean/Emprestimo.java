package model.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Emprestimo.
 */
public class Emprestimo {
	
	/** The id emprestimo. */
	private String id_emprestimo;
	
	/** The usuario. */
	private Usuario usuario;
	
	/** The exemplar. */
	private Exemplar exemplar;
	
	/** The data. */
	private String data;

	/**
	 * Gets the id emprestimo.
	 *
	 * @return the id emprestimo
	 */
	public String getId_emprestimo() {
		return id_emprestimo;
	}

	/**
	 * Sets the id emprestimo.
	 *
	 * @param id_emprestimo the new id emprestimo
	 */
	public void setId_emprestimo(String id_emprestimo) {
		this.id_emprestimo = id_emprestimo;
	}

	/**
	 * Gets the usuario.
	 *
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Sets the usuario.
	 *
	 * @param usuario the new usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * Gets the exemplar.
	 *
	 * @return the exemplar
	 */
	public Exemplar getExemplar() {
		return exemplar;
	}

	/**
	 * Sets the exemplar.
	 *
	 * @param exemplar the new exemplar
	 */
	public void setExemplar(Exemplar exemplar) {
		this.exemplar = exemplar;
	}

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * Sets the data.
	 *
	 * @param data the new data
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * Instantiates a new emprestimo.
	 *
	 * @param id_emprestimo the id emprestimo
	 * @param usuario the usuario
	 * @param exemplar the exemplar
	 * @param data the data
	 */
	public Emprestimo(String id_emprestimo, Usuario usuario, Exemplar exemplar, String data) {
		super();
		this.id_emprestimo = id_emprestimo;
		this.usuario = usuario;
		this.exemplar = exemplar;
		this.data = data;
	}
	
	/**
	 * Instantiates a new emprestimo.
	 */
	public Emprestimo() {}
}
