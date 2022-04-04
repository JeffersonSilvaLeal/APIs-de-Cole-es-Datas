package apisdecolecoesedatas.collections.conjuntosordenados;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		/**
		 * TreeSet ordena automático
		 */
		Set<Character> alfabeto = new TreeSet<>();
		alfabeto.add('F');
		alfabeto.add('B');
		alfabeto.add('M');
		alfabeto.add('P');
		alfabeto.add('O');
		
		System.out.println(alfabeto);
		System.out.println("------------------");
		
		/**
		 * Sempre que formos colocar um objeto em um conjunto TreeSet,
		 * sempre implementar o Comparable, e implementar a regra de comparação
		 * através do método obrigatório compareTo
		 */
		
		Mes m1 = new Mes("Janeiro", 1);
		Mes m2 = new Mes("Março", 2);
		Mes m3 = new Mes("Abril", 3);
		Mes m4 = new Mes("Fevereiro", 4);
		
		Set<Mes> meses = new TreeSet<>();
		meses.add(m1);
		meses.add(m2);
		meses.add(m3);
		meses.add(m4);
		
		System.out.println(meses);
		System.out.println("------------------------------");
		
		Set<Character> alfabetoinvertido = new TreeSet<>(new InverseCoparator());
		alfabetoinvertido.add('F');
		alfabetoinvertido.add('B');
		alfabetoinvertido.add('M');
		alfabetoinvertido.add('P');
		alfabetoinvertido.add('O');
		
		System.out.println(alfabetoinvertido);
		System.out.println("------------------");
		
	}

}
