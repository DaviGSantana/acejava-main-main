package Entidades;

import java.time.LocalDate;

import exception.DateException;

public class Tarefa implements Comparable<Tarefa> {
	private Integer Id;
	private String nome;
	private String descricao;
	private LocalDate prazo;
	private Integer prioridade;
	
	
	public Tarefa(Integer id, String nome, String descricao, LocalDate prazo, Integer prioridade) {
		Id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.prazo = prazo;
		this.prioridade = prioridade;
	}


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public LocalDate getPrazo() {
		return prazo;
	}


	public void setPrazo(LocalDate prazo) {
		if(prazo.isBefore(getPrazo())) {
			throw new DateException("A data é invalida");
			
		}
		this.prazo = prazo;
	}


	public Integer getPrioridade() {
		return prioridade;
	}


	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}


	@Override
	public String toString() {
		return String.format("Tarefa [Id=%s, nome=%s, descricao=%s, prazo=%s, prioridade=%s]", Id, nome, descricao,
				prazo, prioridade);
	}


	@Override
	public int compareTo(Tarefa outraTarefa) {
		
		return prioridade.compareTo(outraTarefa.getPrioridade());
	}
	
	public int compareToDecrecente(Tarefa outraTarefa) {
		return outraTarefa.getPrioridade().compareTo(prioridade);
	}
	
	
	
	
	
	
	
	
	

}
