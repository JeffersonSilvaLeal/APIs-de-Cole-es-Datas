package apisdecolecoesedatas.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
	/**
	 * Hash Map as chaves é representado em um algoritmo de hash(Espalha)
	 * Linked Hash Map as chaves são ordenadas de acordo com que forem inseridas
	 * Tree map as chaves são ordenadas em uma ordem natural
	 */
		
		Map<Integer, String> meses = new HashMap<>();
		meses.put(1, "Janeiro");
		meses.put(2, "Fevereiro");
		meses.put(3, "Março");
		meses.put(12, "Dezembro");
		
		System.out.println(meses);
		
		String m1 = meses.get(1);
		System.out.println(m1);
		System.out.println("------------------------");
		
		/**
		 * Itera só na chaves
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
