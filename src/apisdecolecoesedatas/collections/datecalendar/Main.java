package apisdecolecoesedatas.collections.datecalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		/**
		 * Date Instante no tempo(Data especifica)
		 * Calendar Usado para opeções
		 */
		
		System.out.println("Data Atual");
		Date now = new Date();
		System.out.println(now);
		System.out.println("----------");
		
		System.out.println("Tempo atual");
		long time = now.getTime();
		System.out.println(time);
		System.out.println("-----------");
		
		System.out.println("Carregar várias informações");
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println("---------------");
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2040, 1, 20, 14, 30, 25);
		cal1.set(Calendar.YEAR, 2050);
		cal1.set(Calendar.SECOND, 20);
		
		cal1.add(Calendar.MONTH, 1); // Soma um mês
		cal1.add(Calendar.YEAR, -5); // Subtrai 5 anos
		
		System.out.println(cal1.getTime());
		
		/**
		 * Formata  Data e hora
		 * "dd/MM/yyyy HH:mm:ss"
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		try {
			Date d = sdf.parse("03/12/2022 15:30:22");
			/**
			 * Padrão americano
			 */
			System.out.println(d);
			
			/**
			 * Padrão brasileiro
			 */
			String s = sdf.format(d);
			System.out.println(s);
			
			/**
			 * Manipular um calendar
			 */
			cal = Calendar.getInstance();
			cal.setTime(d);
			cal.add(Calendar.HOUR, 48);
			System.out.println(cal.getTime());
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
