package info.diegoramos.healtheverything.model;

public class Programa {
	private Long id_programa;
	private String nome;
	private String objetivo;
	
	
	/* 
	 * @author Diego Ramos
	 * @description Classe da Entidade Programa
	 * @version 0.1
	 */
	
	
	/* 
	 * Getters and Setters
	 * 
	 */	
	
	public Long getId_programa() {
		return id_programa;
	}
	
	public void setId_programa(Long id_programa) {
		this.id_programa = id_programa;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	
	
}
