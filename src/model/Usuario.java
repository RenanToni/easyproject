package model;

import java.util.ArrayList;

public class Usuario {
	private Long idUsuario;
	private String senha;
	private ArrayList<AreadeTrabalho> area = new ArrayList<AreadeTrabalho>();
	private ArrayList<Quadro> quadro = new ArrayList<Quadro>();
	private ArrayList<Cartao> cartao = new ArrayList<Cartao>();
	
	
	public Usuario(String senha, ArrayList<AreadeTrabalho> area, ArrayList<Quadro> quadro, ArrayList<Cartao> cartao) {
		super();
		this.senha = senha;
		this.area = area;
		this.quadro = quadro;
		this.cartao = cartao;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public ArrayList<AreadeTrabalho> getArea() {
		return area;
	}
	public void setArea(ArrayList<AreadeTrabalho> area) {
		this.area = area;
	}
	public ArrayList<Quadro> getQuadro() {
		return quadro;
	}
	public void setQuadro(ArrayList<Quadro> quadro) {
		this.quadro = quadro;
	}
	public ArrayList<Cartao> getCartao() {
		return cartao;
	}
	public void setCartao(ArrayList<Cartao> cartao) {
		this.cartao = cartao;
	}
	
	
}
