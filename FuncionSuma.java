import java.util.Scanner;
/*
 * Programa suma, para calcular la suma de dos valores introducidos por teclado
 * 
 * @version: v1.0
 * @Author: Miquel
 * @See Also: Para más información ver <a href="https://google.com"></a>
 */


public class FuncionSuma {
/*
 * 
 *Variable para guardar el primer sumando
 */
	
	
	private static int primerSumando;
	/*
	 * 
	 *Variable para guardar el segundo sumando
	 */
	private static int segundoSumando; 
	/*
	 * 
	 *Función principal del programa
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Introduce el primer sumando:");
		primerSumando = in.nextInt();
		in.nextLine();
		System.out.println("Introduce el segundo sumando:");
		segundoSumando = in.nextInt();
		in.nextLine();
		System.out.println("La resta es: " + resta(primerSumando, segundoSumando));
		
		in.close();

	}
	
	
	/*
	 * 
	 *Función que realiza la suma de los dos operandos
	 */
	private static int resta (int sumando1, int sumando2) {
		return sumando1-sumando2;
	}

}
