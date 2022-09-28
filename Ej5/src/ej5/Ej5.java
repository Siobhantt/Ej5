package ej5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		/*Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (notas enteras que se solicitarán al usuario).
		El programa debe mostrar la nota media del curso como se utiliza en el boletín de calificaciones (solo la parte entera)
		y como se usa en el expediente académico (con decimales).*/
		
		//Establecemos la variables
		int notasPrimero;
		int notasSegundo;
		int notasTercer;
		int notaMediaC;
		double notaMediaEX;
		
		
		//Establecemos el Scanner
		Scanner sc = new Scanner(System.in);
		
		//realizamos la operacion para la media
		
		System.out.print("Introduzca las notas del primer semestre: ");
		notasPrimero = sc.nextInt();
		System.out.print("Introduzca las notas del segundo semestre: ");
		notasSegundo = sc.nextInt();
		System.out.print("Introduzca las notas del tercer semestre: ");
		notasTercer = sc.nextInt();
		
	
		notaMediaC = ((notasPrimero + notasSegundo + notasTercer) / 3);
		notaMediaEX = ((notasPrimero + notasSegundo + notasTercer) / 3);
		
		System.out.println("Nota de boletin de Calificaciones: " + notaMediaC);
		System.out.println("Nota de Expediente Academico: " + notaMediaEX);
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
