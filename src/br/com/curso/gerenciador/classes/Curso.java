package br.com.curso.gerenciador.classes;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	/*
	LinkedList: arranja ou remove mais rápido um elemento nas primeiras posições. É mais lenta para buscar um
	elemento em determinada posição, pois vai buscando de " um em um" até encontrá-lo.
	
	ArrayLst: buca mais rapidamente um elemento em qualquer posição, mas é lenta quando usada para adicionar
	ou remover um elemento em dada posição, pois rearranja toda a coleção para acomodar ou remover o respectivo
	elemento.
	*/
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	//use Collections.unmodifiableList para impedir que métodos não próprios do objeto possam modificar a lista.
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	//esse método pemite modificar a lista, pertence a este objeto.
	public void adiciona(Aula aula){
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "Curso: " + this.nome + ", tempo total: " + this.getTempoTotal();
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException();
		return matriculaParaAluno.get(numero);
	}

}
