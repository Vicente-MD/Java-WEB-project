package model.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Exemplar.
 */
public class Exemplar {

	/** The id exemplar. */
	private String id_exemplar;

	/** The livro. */
	private Livro livro;

	/**
	 * Gets the id exemplar.
	 *
	 * @return the id exemplar
	 */
	public String getId_exemplar() {
		return id_exemplar;
	}

	/**
	 * Sets the id exemplar.
	 *
	 * @param id_exemplar the new id exemplar
	 */
	public void setId_exemplar(String id_exemplar) {
		this.id_exemplar = id_exemplar;
	}

	/**
	 * Gets the livro.
	 *
	 * @return the livro
	 */
	public Livro getLivro() {
		return livro;
	}

	/**
	 * Sets the livro.
	 *
	 * @param livro the new livro
	 */
	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	/**
	 * Instantiates a new exemplar.
	 *
	 * @param id_exemplar the id exemplar
	 * @param livro       the livro
	 */
	public Exemplar(String id_exemplar, Livro livro) {
		super();
		this.id_exemplar = id_exemplar;
		this.livro = livro;
	}

	/**
	 * Instantiates a new exemplar.
	 */
	public Exemplar() {
	}

}
