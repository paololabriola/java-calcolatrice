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
			return numero * -1;
		
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
	
}
