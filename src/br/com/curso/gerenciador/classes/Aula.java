package br.com.curso.gerenciador.classes;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	// se n�o reescrever o toString em Object (classe m�e default), ele vai imprimir o hash code no sysout.
	@Override
	public String toString() {
		return "Aula " + this.titulo + ", " + this.tempo + " minutos";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}

}
