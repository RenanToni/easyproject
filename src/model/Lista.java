package model;

public class Lista {
	
	private Long idLista;
	private String nome;
	private String listacartao;
		
	
	public Lista(String nome, String listacartao) {
		super();
		this.nome = nome;
		this.listacartao = listacartao;
		
	}
	public Long getIdLista() {
		return idLista;
	}
	public void setIdLista(Long idLista) {
		this.idLista = idLista;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getListacartao() {
		return listacartao;
	}
	public void setListacartao(String listacartao) {
		this.listacartao = listacartao;
	}
	
}
