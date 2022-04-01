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
		listaMercado.add("Feij�o");
		listaMercado.add("Arroz");
		listaMercado.add("Ol�o");
		
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
		System.out.println(listaMercado.contains("Feij�o"));
		System.out.println("---------------------------");
		
		System.out.println("Buscando items na lista por index");
		int posFeijao = listaMercado.indexOf("Feij�o");
		System.out.println("Posi��o feij�o: " + posFeijao);	
		System.out.println("---------------------------");

	
		System.out.println("Elemento que n�o existe");
		int posfarinha = listaMercado.indexOf("farinha");
		System.out.println("Posi��i farinha: " +  posfarinha);
	}

}
