package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Exemplodate {

	public static void main(String[] args) {
			//Date dataAtual = new Date();
			//System.out.println(dataAtual);
			//System.out.println(dataAtual.getTime());
			
			//Calendar hoje = Calendar.getInstance();
			//System.out.println(hoje);

			LocalDate datahoje = LocalDate.now();
			System.out.println(datahoje);
			System.out.println(datahoje.of(2025, 6, 5));
			System.out.println(datahoje.isLeapYear());
			System.out.println(datahoje.plusDays(2));
			
			
			LocalTime hora = LocalTime.now();
			System.out.println(hora);
			System.out.println(hora.plusHours(2));
			
			LocalDateTime dataHora = LocalDateTime.now();
			System.out.println(dataHora);
			
			ZoneId fuso = ZoneId.systemDefault();
			System.out.println(fuso);
	}

}
