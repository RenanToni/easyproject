package model;

public class Quadro {
	
	private Long idQuadro;
	private String nome;
	
	public Quadro(String nome) {
		super();
		this.nome = nome;
	}
	public Long getIdQuadro() {
		return idQuadro;
	}
	public void setIdQuadro(Long idQuadro) {
		this.idQuadro = idQuadro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
