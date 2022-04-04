package apisdecolecoesedatas.collection.newapidate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		
		
		/**
		 * LocalDate '11/03/1993'
		 * LocalTime 15:00:22
		 * LocalDateTime '11/03/1993 15:00:22'
		 */
		
	
		String  dataNasc = "11/03/1993 22:03:33";
		
		LocalDateTime idt = LocalDateTime.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		System.out.println(idt);
		
		/**
		 * Data Atual
		 */

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		/**
		 * Duração
		 */
		
		Duration d = Duration.between(idt, now);
		System.out.println("Horas: " + d.toHours());
		System.out.println("Dias: " + d.toDays());
		
		/**
		 * Periodo de vida
		 */
		Period p = Period.between(idt.toLocalDate(), now.toLocalDate());
		System.out.println("Meses: " + p.toTotalMonths());
		
		/**
		 * Semanas de vida
		 */
		System.out.println("Semanas: " +  ChronoUnit.WEEKS.between(idt, now));
		
		/**
		 * Anos de vida
		 */
		System.out.println("Anos: " +  ChronoUnit.YEARS.between(idt, now));

		/**
		 * Validade de cartão de credito
		 */
		YearMonth ym = YearMonth.of(2020, 10);
		System.out.println("Cartão válido ate: " + ym);
		
		Month month = Month.of(3);
		System.out.println(month);
		
		/**
		 * Operação em tempo
		 */
		System.out.println("----------");
		LocalDate ld = LocalDate.now();
	    ld = ld.plusMonths(2);
	    // tira 2 semanas e adiciona 2 dias
	    ld.minusWeeks(5).plusDays(6);
	    System.out.println(ld);

	    
	}
}
