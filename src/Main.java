import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Supongamos que tienes una lista de n�meros enteros
		List<Integer> numeros = new ArrayList<>();
		numeros.add(5);
		numeros.add(10);
		numeros.add(15);

		// Utilizamos forEach con una referencia a un m�todo para aplicar una operaci�n
		// matem�tica a cada n�mero y luego imprimir los resultados
		numeros.forEach(Main::operacionMatematica);
	}

	// M�todo que realiza una operaci�n matem�tica en un n�mero y lo imprime
	private static void operacionMatematica(int numero) {
		int resultado = numero * 2 + 3;
		System.out.println("Resultado para " + numero + ": " + resultado);
	}

	

}
