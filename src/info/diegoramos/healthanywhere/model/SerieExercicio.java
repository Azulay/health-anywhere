package info.diegoramos.healthanywhere.model;

public class SerieExercicio {

	private Serie serie;
	private String nome;
	private Long id_exercicio;
	
	/* 
	 * @author Diego Ramos
	 * @description Classe da Entidade Exercícios da Série
	 * @version 0.1
	 */
	
	
	/* 
	 * Getters and Setters
	 * 
	 */		
	
	public String getNome() {
		return nome;
	}
	
	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	public Long getId_exercicio() {
		return id_exercicio;
	}	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
		
}
