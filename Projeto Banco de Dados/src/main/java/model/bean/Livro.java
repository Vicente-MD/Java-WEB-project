package model.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Livro.
 */
public class Livro {
	
	/** The id livro. */
	private String id_livro;
	
	/** The autor. */
	private Autor autor;
	
	/** The titulo. */
	private String titulo;
	
	/** The num pag. */
	private String num_pag;
	
	/** The ano. */
	private String ano;

	/**
	 * Gets the id livro.
	 *
	 * @return the id livro
	 */
	public String getId_livro() {
		return id_livro;
	}

	/**
	 * Sets the id livro.
	 *
	 * @param id_livro the new id livro
	 */
	public void setId_livro(String id_livro) {
		this.id_livro = id_livro;
	}

	/**
	 * Gets the autor.
	 *
	 * @return the autor
	 */
	public Autor getAutor() {
		return autor;
	}

	/**
	 * Sets the autor.
	 *
	 * @param autor the new autor
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	/**
	 * Gets the titulo.
	 *
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Sets the titulo.
	 *
	 * @param titulo the new titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Gets the num pag.
	 *
	 * @return the num pag
	 */
	public String getNum_pag() {
		return num_pag;
	}

	/**
	 * Sets the num pag.
	 *
	 * @param num_pag the new num pag
	 */
	public void setNum_pag(String num_pag) {
		this.num_pag = num_pag;
	}

	/**
	 * Gets the ano.
	 *
	 * @return the ano
	 */
	public String getAno() {
		return ano;
	}

	/**
	 * Sets the ano.
	 *
	 * @param ano the new ano
	 */
	public void setAno(String ano) {
		this.ano = ano;
	}

	/**
	 * Instantiates a new livro.
	 *
	 * @param id_livro the id livro
	 * @param autor the autor
	 * @param titulo the titulo
	 * @param num_pag the num pag
	 * @param ano the ano
	 */
	public Livro(String id_livro, Autor autor, String titulo, String num_pag, String ano) {
		super();
		this.id_livro = id_livro;
		this.autor = autor;
		this.titulo = titulo;
		this.num_pag = num_pag;
		this.ano = ano;
	}
	
	/**
	 * Instantiates a new livro.
	 */
	public Livro() {}

}
