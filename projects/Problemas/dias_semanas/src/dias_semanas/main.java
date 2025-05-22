package dias_semanas;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int horasTotales, semanas,dias,horas;
		
		System.out.println("Digite el numero total de horas: ");
		horasTotales = entrada.nextInt();
		
		semanas = horasTotales / 168;
		dias = horasTotales%168/24;
		horas = horasTotales%21;
		
		
		System.out.println("\nEl equivalente es: ");
		System.out.println("Semanas: "+semanas);
		System.out.println("Dias: "+dias);
		System.out.println("Horas: "+horas);
		
	}

}
