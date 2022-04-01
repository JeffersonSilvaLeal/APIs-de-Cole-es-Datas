package apisdecolecoesedatas.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> listaMercado = new ArrayList<>();
		
		/**
		 * Itens da lista
		 */
		listaMercado.add("Farinha");
		listaMercado.add("Feijão");
		listaMercado.add("Arroz");
		listaMercado.add("Oléo");
		
		/**
		 * Oredenar lista
		 */
		Collections.sort(listaMercado);
		System.out.println(listaMercado);
		System.out.println("--------------------------");
		
		System.out.println("Varrendo lista com for");
		for (int i = 0; i < listaMercado.size(); i++) {
			String item = listaMercado.get(i);
			System.out.println("Item => " + item);
		}
		System.out.println("--------------------------");
		
		
		System.out.println("Varrendo lista com forEach");
		for (String item : listaMercado) {
			System.out.println("Item: " + item);
		}
		
		System.out.println("---------------------------");
		
		System.out.println("Removendo items por index");
		listaMercado.remove(0);
		System.out.println(listaMercado);
		System.out.println("---------------------------");
		
		System.out.println("Removendo items por nome");
		listaMercado.remove("Arroz");
		System.out.println(listaMercado);
		System.out.println("---------------------------");

		System.out.println("Buscando items na lista");
		System.out.println(listaMercado.contains("Feijão"));
		System.out.println("---------------------------");
		
		System.out.println("Buscando items na lista por index");
		int posFeijao = listaMercado.indexOf("Feijão");
		System.out.println("Posição feijão: " + posFeijao);	
		System.out.println("---------------------------");

	
		System.out.println("Elemento que não existe");
		int posfarinha = listaMercado.indexOf("farinha");
		System.out.println("Posiçãi farinha: " +  posfarinha);
	}

}
