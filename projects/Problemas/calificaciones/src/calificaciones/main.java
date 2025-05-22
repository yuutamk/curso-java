package calificaciones;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
		//pedir los datos necesarios
		System.out.print("Digite la nota de participacion");
		participacion = entrada.nextFloat();
		System.out.print("Digita la nota del primer examen parcial");
		primerExamen = entrada.nextFloat();
		System.out.print("Digita la nota del segundo examen parcial");
		segundoExamen = entrada.nextFloat();
		System.out.print("Digita la nota del examen final");
		examenFinal = entrada.nextFloat();
		
		//sacamos los calculos
		participacion *=  0.10f;
		primerExamen *= 0.25f;
		segundoExamen *= 0.25f;
		examenFinal *= 0.40f;
		
		//sumatoria de notas
		notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
		
		//imprimir el resultado
		System.out.println("\nLa nota final es de: "+notaFinal);
		
		
	}

}
