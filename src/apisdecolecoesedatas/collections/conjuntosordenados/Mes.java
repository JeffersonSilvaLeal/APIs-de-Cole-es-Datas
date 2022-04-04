package apisdecolecoesedatas.collections.conjuntosordenados;

import java.util.Objects;

public class Mes implements Comparable<Mes>{

	private String nome;
	private int numero;
	
	public Mes(String nome , int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
	
	/**
	 * 
	 * Imprime o objeto detalhadamente
	 */
	
	@Override
	public String toString() {
		return numero + "-" + nome;
	}
	
	/**
	 * 
	 * Impede os elementos de ser duplicados
	 */

	@Override
	public int hashCode() {
		return Objects.hash(nome, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mes other = (Mes) obj;
		return Objects.equals(nome, other.nome) && numero == other.numero;
	}

	/**
	 * Ordena os meses com base ao número do mês
	 */
	@Override
	public int compareTo(Mes o) {
		if (this.numero < o.numero) {
			return -1;
		} else if (this.numero > o.numero) {
			return 1;
		}
		return 0;
	}
	
	
}
