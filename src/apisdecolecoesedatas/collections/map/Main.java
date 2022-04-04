package apisdecolecoesedatas.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
	/**
	 * Hash Map as chaves � representado em um algoritmo de hash(Espalha)
	 * Linked Hash Map as chaves s�o ordenadas de acordo com que forem inseridas
	 * Tree map as chaves s�o ordenadas em uma ordem natural
	 */
		
		Map<Integer, String> meses = new HashMap<>();
		meses.put(1, "Janeiro");
		meses.put(2, "Fevereiro");
		meses.put(3, "Mar�o");
		meses.put(12, "Dezembro");
		
		System.out.println(meses);
		
		String m1 = meses.get(1);
		System.out.println(m1);
		System.out.println("------------------------");
		
		/**
		 * Itera s� na chaves
		 */
		Set<Integer> numeros =  meses.keySet();
		System.out.println(numeros);
		System.out.println("------------------------");
		
		/**
		 * Itera nos valores
		 */
		Collection<String> nomes = meses.values();
		System.out.println(nomes);
		System.out.println("-------------------------");
		
		/**
		 * Itera sobre os dois valores chave e valor
		 */
		Set<Map.Entry<Integer, String>> entries =  meses.entrySet();
		
		for (Map.Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
