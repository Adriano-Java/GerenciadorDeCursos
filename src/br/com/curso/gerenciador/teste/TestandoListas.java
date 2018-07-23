package br.com.curso.gerenciador.teste;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais sobre listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com cursos e sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		// imprime pelo toString, todos os objetos aparecerão entre colchetes.
		System.out.println(aulas);
		// remove um elemento indexado. No caso, todo index de Java começa pelo
		// "0".
		aulas.remove(0);

		System.out.println(aulas);
		// usa-se foreach para imprimir objetos da lista linha a linha
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		// uma forma de varrer uma lista é usando o get.
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula + ".");

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		// este é o método forEach, diferente do For usado acima.
		aulas.forEach(aula -> {
			System.out.println("Percorrendo: " + aula);
		});		
		aulas.add("Aumentando nosso conhecimanto");
		System.out.println(aulas);
		//usando a classe Collections para ordenar a coleção com sort.
		Collections.sort(aulas);
		System.out.println("Depois de ordenado");
		System.out.println(aulas);
	}

}
