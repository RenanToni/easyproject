package model;

import java.util.List;

public class Lista {
	
	private Long idLista;
	private String nome;
	private List < String > listacartao;
	
		public Lista(String nome, List<String> listacartao) {
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
	public List<String> getListacartao() {
		return listacartao;
	}
	public void setListacartao(List<String> listacartao) {
		this.listacartao = listacartao;
	}
			
}
