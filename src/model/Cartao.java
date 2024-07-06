package model;

public class Cartao {
	private Long idQuadro;
	private String nome;
	
	public Cartao(Long idQuadro, String nome) {
		super();
		this.idQuadro = idQuadro;
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
