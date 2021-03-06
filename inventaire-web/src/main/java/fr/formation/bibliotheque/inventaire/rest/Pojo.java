package fr.formation.bibliotheque.inventaire.rest;

public class Pojo {
	
	private Long id;
	private String name;
	
	

	public Pojo() {
		
	}



	/**
	 * @param id
	 * @param name
	 */
	public Pojo(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	

}
