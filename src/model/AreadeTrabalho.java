package model;

import java.util.ArrayList;

public class AreadeTrabalho {
	private Long idArea;
	private String nome;
	private ArrayList<Quadro> quadro = new ArrayList<Quadro>();
	
	
	public AreadeTrabalho(String nome, ArrayList<Quadro> quadro) {
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
	public ArrayList<Quadro> getQuadro() {
		return quadro;
	}
	public void setQuadro(ArrayList<Quadro> quadro) {
		this.quadro = quadro;
	}
	
	
}
