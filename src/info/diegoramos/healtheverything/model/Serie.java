package info.diegoramos.healtheverything.model;

public class Serie {

	private Long id_serie;
	private String nome;
	private String objetivo;
	
	
	/* 
	 * @author Diego Ramos
	 * @description Classe da Entidade Série
	 * @version 0.1
	 */
	
	
	/* 
	 * Getters and Setters
	 * 
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public Long getId_serie() {
		return id_serie;
	}

	public void setId_serie(Long id_serie) {
		this.id_serie = id_serie;
	}

	public String getNome() {
		return nome;
	}

	public String getObjetivo() {
		return objetivo;
	}
	
	
}
