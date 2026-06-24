package ejercicio;
import java.util.Scanner;

public class ejercicio {
	private Scanner teclado; 
	private double[] billetes = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
	private int contadores[];
	
	public ejercicio() {
		double dinero; 
		int cont = 0; 
		teclado = new Scanner(System.in);
		contadores = new int[billetes.length];
		System.out.println("Ingresa la cantidad de dinero: ");
		dinero = teclado.nextDouble();
		for(int x = 0; x < billetes.length; x++) {
			while(dinero >= billetes[x]) {
				cont++;
				
				dinero = dinero - billetes[x];
				
			}
			contadores[x] = cont; 
			cont = 0; 
		}
	}
	
	public void imprimir() {
		System.out.println("Lista de billetes: ");
		for(int x = 0; x < billetes.length; x++) {
			System.out.println("Billete de "+ billetes[x]+ ": "+ contadores[x]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio Dinero = new ejercicio();
		Dinero.imprimir();

	}

}
