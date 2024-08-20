package aula20_08;

import java.util.Calendar;

public class AulaBacana {

	public enum DiaDaSemana{
		Dom, Seg, Ter, Qua, Qui, Sex, Sab;
	}
	
	public static void main(String[] args) {

		Calendar calendario = Calendar.getInstance();
		int weekDay = calendario.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(calendario.getTime());
		System.out.println(DiaDaSemana.values()[weekDay-1]);
	}

}
