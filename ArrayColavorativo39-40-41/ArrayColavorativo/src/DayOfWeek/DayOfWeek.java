package DayOfWeek;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DayOfWeek {
	
	private static void CalendarTimemethod() {
        Date date = Calendar.getInstance().getTime();
        System.out.println("La Fecha actual es: " + date);
        System.out.println();
    }
 
    private static void SimpleDateFormatmethod() {
        Calendar date = Calendar.getInstance();
        SimpleDateFormat dateformatter = new SimpleDateFormat("E dd/MM/yyyy 'a las' hh:mm:ss a zzz");
        System.out.println("La fecha actual en un formato dado: " + dateformatter.format(date.getTime()));
        System.out.println();
    }
 
    private static void Adddates() {
        System.out.println("Realizando operaciones con las fechas del calendario");
 
        // Get today's date
        Calendar date = Calendar.getInstance();
        Calendar cldr;
        SimpleDateFormat dateformatter = new SimpleDateFormat("E dd/MM/yyyy 'a las' hh:mm:ss a zzz");
 
        cldr = (Calendar) date.clone();
        cldr.add(Calendar.DAY_OF_YEAR, - (365 * 2));
        System.out.println("    Dos a�os atras era: " + dateformatter.format(cldr.getTime()));
 
        cldr = (Calendar) date.clone();
        cldr.add(Calendar.DAY_OF_YEAR, + 5);
        System.out.println("    Cinco d�as despues de hoy sera: " + dateformatter.format(cldr.getTime()));
 
        System.out.println();
    }
 
    private static void DateDifference() {
        System.out.println("Diferencia entre dos fechas");
        Date startDate1 = new GregorianCalendar(2005, 02, 25, 14, 00).getTime();
        Date endDate1 = new Date();;
 
        long diff = endDate1.getTime() - startDate1.getTime();
 
        System.out.println("    Diferencia entre '" + endDate1 + "' y '" + startDate1 + "'");
        System.out.println("    es de " + (diff / (1000L*60L*60L*24L)) + " d�as.");
        System.out.println();
    }
 
    private static void Getcalendermethods() {
        System.out.println("Varios metodos de la clase Calendar:");
        Calendar calender = Calendar.getInstance();
 
        System.out.println("A�o : " + calender.get(Calendar.YEAR));
        System.out.println("Mes (enero es el mes 0)  : " + calender.get(Calendar.MONTH));
        System.out.println("D�a del mes  : " + calender.get(Calendar.DAY_OF_MONTH));
        System.out.println("D�a de la semana (la semana empieza el domingo)  : " + calender.get(Calendar.DAY_OF_WEEK));
        System.out.println("D�a del a�o  : " + calender.get(Calendar.DAY_OF_YEAR));
        System.out.println("Semana del a�o  : " + calender.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Semana del mes  : " + calender.get(Calendar.WEEK_OF_MONTH));
        System.out.println("D�a de la semana en el mes : " + calender.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("AM PM : " + calender.get(Calendar.AM_PM));
        System.out.println("Hora : " + calender.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minutos : " + calender.get(Calendar.MINUTE));
        System.out.println("Segundos : " + calender.get(Calendar.SECOND));
        System.out.println();
    }
 
   
    
	
	
 
	public static void main(String[] args) {
 
		
		Calendar now = Calendar.getInstance();
 
		System.out.println("Fecha actual : " + (now.get(Calendar.DATE) )
		+ "-"
		+ now.get(Calendar.MONTH) +1
	    + "-"
		+ now.get(Calendar.YEAR));
 

		String[] strDays = new String[]{"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
 

		System.out.println("Hoy es : " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
	}
	
	
}