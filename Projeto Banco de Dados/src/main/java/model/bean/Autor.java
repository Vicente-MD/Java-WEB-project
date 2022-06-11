package model.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Autor.
 */
public class Autor {
	
	/** The id autor. */
	private String id_autor;
	
	/** The nome. */
	private String nome;
	
	/** The pais. */
	private String pais;

	/**
	 * Gets the id autor.
	 *
	 * @return the id autor
	 */
	public String getId_autor() {
		return id_autor;
	}

	/**
	 * Sets the id autor.
	 *
	 * @param id_autor the new id autor
	 */
	public void setId_autor(String id_autor) {
		this.id_autor = id_autor;
	}

	/**
	 * Gets the nome.
	 *
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the nome.
	 *
	 * @param nome the new nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Gets the pais.
	 *
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * Sets the pais.
	 *
	 * @param pais the new pais
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * Instantiates a new autor.
	 *
	 * @param id_autor the id autor
	 * @param nome the nome
	 * @param pais the pais
	 */
	public Autor(String id_autor, String nome, String pais) {
		super();
		this.id_autor = id_autor;
		this.nome = nome;
		this.pais = pais;
	}
	
	/**
	 * Instantiates a new autor.
	 */
	public Autor() {}

}
