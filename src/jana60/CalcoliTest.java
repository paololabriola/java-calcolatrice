package jana60;

import java.util.Scanner;

public class CalcoliTest {

	public static void main(String[] args) {
		
		/*
		int numero1, numero2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Questo codice effettuerà delle operazioni tra due numeri inseriti in input.");
		
		System.out.print("Inserisci il valore del primo numero: ");
		numero1 = Integer.parseInt(scan.nextLine());
		System.out.print("Inserisci il valore del secondo numero: ");
		numero2 = Integer.parseInt(scan.nextLine());
		
		System.out.println("La somma tra i due numeri è: " + CalcoliHelper.calcolaSomma(numero1, numero2));
		System.out.println("La differenza tra i due numeri è: " + CalcoliHelper.calcolaDifferenza(numero1, numero2));
		System.out.println("Il prodotto della moltiplicazione tra i due numeri è: " + CalcoliHelper.calcolaProdotto(numero1, numero2));
		System.out.println("Il valore assoluto del primo numero è: " + CalcoliHelper.calcolaValoreAssoluto(numero1));
		System.out.println("Il valore assoluto del secondo numero è: " + CalcoliHelper.calcolaValoreAssoluto(numero2));
		System.out.println("Il numero più piccolo è: " + CalcoliHelper.calcolaMinimo(numero1, numero2));
		System.out.println("Il numero più grande è: " + CalcoliHelper.calcolaMassimo(numero1, numero2));
		*/
		
		double numero1, numero2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Questo codice effettuerà delle operazioni tra due numeri inseriti in input.");
		
		System.out.print("Inserisci il valore del primo numero: ");
		numero1 = Double.parseDouble(scan.nextLine());
		System.out.print("Inserisci il valore del secondo numero: ");
		numero2 = Double.parseDouble(scan.nextLine());
		
		System.out.println("La somma tra i due numeri è: " + CalcoliHelper.calcolaSomma(numero1, numero2));
		System.out.println("La differenza tra i due numeri è: " + CalcoliHelper.calcolaDifferenza(numero1, numero2));
		System.out.println("Il prodotto della moltiplicazione tra i due numeri è: " + CalcoliHelper.calcolaProdotto(numero1, numero2));
		System.out.println("Il valore assoluto del primo numero è: " + CalcoliHelper.calcolaValoreAssoluto(numero1));
		System.out.println("Il valore assoluto del secondo numero è: " + CalcoliHelper.calcolaValoreAssoluto(numero2));
		System.out.println("Il numero più piccolo è: " + CalcoliHelper.calcolaMinimo(numero1, numero2));
		System.out.println("Il numero più grande è: " + CalcoliHelper.calcolaMassimo(numero1, numero2));
		
		scan.close();
		
	}

}
