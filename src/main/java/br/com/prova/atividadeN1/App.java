package br.com.prova.atividadeN1;

import java.util.Scanner;

import org.joda.time.LocalTime;

import br.com.prova.model.Triangulo;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Lado 1 ");
		int l1 = sc.nextInt();
		System.out.print("Lado 2 ");
		int l2 = sc.nextInt();
		System.out.print("Lado 3 ");
		int l3 = sc.nextInt();
		
		Triangulo t1 = new Triangulo(l1, l2, l3);
		System.out.print("Tipo de triangulo: " + t1.tipoTriangulo());

	
		sc.close();
	}
}
