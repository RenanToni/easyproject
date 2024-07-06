package model;

import java.util.List;

public class AreadeTrabalho {
	private Long idArea;
	private String nome;
	private List<Quadro> quadro;
	
	
	public AreadeTrabalho(String nome, List<Quadro> quadro) {
		super();
		this.nome = nome;
		this.quadro = quadro;
	}
	public Long getIdArea() {
		return idArea;
	}
	public void setIdArea(Long idArea) {
		this.idArea = idArea;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Quadro> getQuadro() {
		return quadro;
	}
	public void setQuadro(List<Quadro> quadro) {
		this.quadro = quadro;
	}
	
	
}
