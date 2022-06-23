package jana60;

import java.util.Scanner;

public class CalcoliTest {

	public static void main(String[] args) {
		
		/*
		int numero1, numero2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Questo codice effettuer� delle operazioni tra due numeri inseriti in input.");
		
		System.out.print("Inserisci il valore del primo numero: ");
		numero1 = Integer.parseInt(scan.nextLine());
		System.out.print("Inserisci il valore del secondo numero: ");
		numero2 = Integer.parseInt(scan.nextLine());
		
		System.out.println("La somma tra i due numeri �: " + CalcoliHelper.calcolaSomma(numero1, numero2));
		System.out.println("La differenza tra i due numeri �: " + CalcoliHelper.calcolaDifferenza(numero1, numero2));
		System.out.println("Il prodotto della moltiplicazione tra i due numeri �: " + CalcoliHelper.calcolaProdotto(numero1, numero2));
		System.out.println("Il valore assoluto del primo numero �: " + CalcoliHelper.calcolaValoreAssoluto(numero1));
		System.out.println("Il valore assoluto del secondo numero �: " + CalcoliHelper.calcolaValoreAssoluto(numero2));
		System.out.println("Il numero pi� piccolo �: " + CalcoliHelper.calcolaMinimo(numero1, numero2));
		System.out.println("Il numero pi� grande �: " + CalcoliHelper.calcolaMassimo(numero1, numero2));
		*/
		
		double numero1, numero2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Questo codice effettuer� delle operazioni tra due numeri inseriti in input.");
		
		System.out.print("Inserisci il valore del primo numero: ");
		numero1 = Double.parseDouble(scan.nextLine());
		System.out.print("Inserisci il valore del secondo numero: ");
		numero2 = Double.parseDouble(scan.nextLine());
		
		System.out.println("La somma tra i due numeri �: " + CalcoliHelper.calcolaSomma(numero1, numero2));
		System.out.println("La differenza tra i due numeri �: " + CalcoliHelper.calcolaDifferenza(numero1, numero2));
		System.out.println("Il prodotto della moltiplicazione tra i due numeri �: " + CalcoliHelper.calcolaProdotto(numero1, numero2));
		System.out.println("Il valore assoluto del primo numero �: " + CalcoliHelper.calcolaValoreAssoluto(numero1));
		System.out.println("Il valore assoluto del secondo numero �: " + CalcoliHelper.calcolaValoreAssoluto(numero2));
		System.out.println("Il numero pi� piccolo �: " + CalcoliHelper.calcolaMinimo(numero1, numero2));
		System.out.println("Il numero pi� grande �: " + CalcoliHelper.calcolaMassimo(numero1, numero2));
		
		scan.close();
		
	}

}
