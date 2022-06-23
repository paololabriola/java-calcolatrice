package jana60;

public class CalcoliHelper {

	private CalcoliHelper() {
		
	}
	
	public static int calcolaSomma(int primoNumero, int secondoNumero) {
		
		return primoNumero + secondoNumero;
		
	}
	
	public static int calcolaDifferenza(int primoNumero, int secondoNumero) {
		
		return primoNumero - secondoNumero;
		
	}
	
	public static int calcolaProdotto(int primoNumero, int secondoNumero) {
		
		return primoNumero * secondoNumero;
		
	}
	
	public static int calcolaValoreAssoluto(int numero) {
		
		if(numero >= 0)
			return numero;
		else
			return -numero;
		
	}

	public static int calcolaMinimo(int primoNumero, int secondoNumero) {
		
		if(primoNumero < secondoNumero)
			return primoNumero;
		else
			return secondoNumero;
		
	}
	
	public static int calcolaMassimo(int primoNumero, int secondoNumero) {
		
		if(primoNumero > secondoNumero)
			return primoNumero;
		else
			return secondoNumero;
		
	}
	
	//BONUS 1: Applicando il principio dell'Overload sorascrivo i metodi dichiarati in precedenza.
	
	public static double calcolaSomma(double primoNumero, double secondoNumero) {
		
		return primoNumero + secondoNumero;
		
	}
	
	public static double calcolaDifferenza(double primoNumero, double secondoNumero) {
		
		return primoNumero - secondoNumero;
		
	}
	
	public static double calcolaProdotto(double primoNumero, double secondoNumero) {
		
		return primoNumero * secondoNumero;
		
	}
	
	public static double calcolaValoreAssoluto(double numero) {
		
		if(numero > 0)
			return numero;
		else
			return numero * -1;
		
	}

	public static double calcolaMinimo(double primoNumero, double secondoNumero) {
		
		if(primoNumero < secondoNumero)
			return primoNumero;
		else
			return secondoNumero;
		
	}
	
	public static double calcolaMassimo(double primoNumero, double secondoNumero) {
		
		if(primoNumero > secondoNumero)
			return primoNumero;
		else
			return secondoNumero;
		
	}
	
	//BONUS2
	
	public static double calcolaPotenza(int base, int esponente) {
		
		double risultato = 0.0;
		
		if (esponente == 0 || base == 0)
			risultato = 1;
		else if (esponente < 0) {
			
			double calcolo = base;
			
			for(int i = 1; i < -esponente; i++) {
				
				calcolo *= base;
				
			}
			
			risultato = 1 / calcolo;
			
		}else {
			
			int calcolo = base;
			
			for(int i = 1; i < esponente; i++) { 
				
				calcolo *= base;
				
			}
			
			risultato = calcolo;
			
		}
		
		return risultato;
		
	}
	
}
