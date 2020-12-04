package entities;

public class Alunos {
	
	private String name;
	private Integer id;
	private Double media;
	private String situacao;
	
	public Alunos() {
		
	}

	public Alunos(String name, Integer id, Double media) {
		
		this.name = name;
		this.id = id;
		this.media = media;
	
	}
	
	public void setName(String name) {
	
		this.name = name;
	
	}
	
	public void setId(Integer id) {
	
		this.id = id;
	
	}	
	
	public void setMedia(Double media) {
	
		this.media = media;
	
	}	
	
	public void setSituacao(String situacao) {
		
		this.situacao = situacao;
	
	}	
	
	public String getName() {
	
		return name;

	}

	public Integer getId() {
	
		return id;
	
	}

	public Double getMedia() {

		return media;
	
	}
	

	
	public String getSituacao() {
	
		return situacao;
	
	}



}
