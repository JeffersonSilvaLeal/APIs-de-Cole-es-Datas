package apisdecolecoesedatas.collections.conjuntosordenados;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		/**
		 * 
		 * Hash Set não garante a iteração
		 * Linked Hash Set garante a ordem de ordenação de acordo com a inserção
		 * Conjuntos não pode ter elemento duplicado
		 * 
		 */
		
		Set<Integer> numeros = new HashSet<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(10);
		numeros.add(25);
		
		for (Integer n : numeros) {
			System.out.println("=> " + n);
		}
	
		System.out.println("-----------------------");
		
		Set<Integer> numeros1 = new LinkedHashSet<>();
		numeros1.add(1);
		numeros1.add(2);
		numeros1.add(10);
		numeros1.add(25);
		
		for (Integer n : numeros1) {
			System.out.println("=> " + n);
		}
		
		System.out.println("-----------------------");

		/**
		 * 
		 * Verifica se contém o número 20 na lista
		 * 
		 */
		System.out.println(numeros.contains(numeros.contains(20)));
		
		System.out.println("-----------------------");
		

		Mes m1 = new Mes("Janeiro", 1);
		Mes m2 = new Mes("Fevereiro", 2);
		Mes m3 = new Mes("Março", 3);
		Mes m4 = new Mes("Abril", 4);
		
		Set<Mes> meses = new HashSet<>();
		meses.add(m1);
		meses.add(m2);
		meses.add(m3);
		meses.add(m4);
		
		System.out.println(meses);
		System.out.println("-----------------------");
		
		Set<Mes> meses1 = new LinkedHashSet<>();
		meses1.add(m1);
		meses1.add(m2);
		meses1.add(m3);
		meses1.add(m4);
		
		System.out.println(meses1);

		
	}

}
