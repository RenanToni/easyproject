package model;

import java.util.List;

public class Usuario {
	private Long idUsuario;
	private String senha;
	private List<AreadeTrabalho> area;
	private List<Quadro> quadro;
	private List<Cartao> cartao;
	
	
	public Usuario(String senha, List<AreadeTrabalho> area, List<Quadro> quadro, List<Cartao> cartao) {
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
	public List<AreadeTrabalho> getArea() {
		return area;
	}
	public void setArea(List<AreadeTrabalho> area) {
		this.area = area;
	}
	public List<Quadro> getQuadro() {
		return quadro;
	}
	public void setQuadro(List<Quadro> quadro) {
		this.quadro = quadro;
	}
	public List<Cartao> getCartao() {
		return cartao;
	}
	public void setCartao(List<Cartao> cartao) {
		this.cartao = cartao;
	}
	
}
