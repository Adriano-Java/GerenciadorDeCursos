package br.com.curso.gerenciador.classes;

public class Aluno {
	
	String nome;
	private int numeroMatricula;
	
	public String getNome() {
		return nome;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("nome não pode ser null.");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "Aluno: " + this.nome + "; matricula: " + this.numeroMatricula;
	}

	//reescreva o equals para realizar comparativos com Set.
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	//facilite sua busca por objetos especifícos reescrevendo este método. Sempre reescreva hasCode(){} quando reescrever equals(){}.
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
}
