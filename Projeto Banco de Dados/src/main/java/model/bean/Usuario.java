package model.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Usuario.
 */
public class Usuario {

	/** The id usuario. */
	private String id_usuario;

	/** The nome. */
	private String nome;

	/** The cpf. */
	private String cpf;

	/** The telefone. */
	private String telefone;

	/**
	 * Gets the id usuario.
	 *
	 * @return the id usuario
	 */
	public String getId_usuario() {
		return id_usuario;
	}

	/**
	 * Sets the id usuario.
	 *
	 * @param id_usuario the new id usuario
	 */
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
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
	 * Gets the cpf.
	 *
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Sets the cpf.
	 *
	 * @param cpf the new cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Gets the telefone.
	 *
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Sets the telefone.
	 *
	 * @param telefone the new telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Instantiates a new usuario.
	 *
	 * @param id_usuario the id usuario
	 * @param nome       the nome
	 * @param cpf        the cpf
	 * @param telefone   the telefone
	 */
	public Usuario(String id_usuario, String nome, String cpf, String telefone) {
		super();
		this.id_usuario = id_usuario;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	/**
	 * Instantiates a new usuario.
	 */
	public Usuario() {
	}
}
