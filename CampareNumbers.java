import java.util.Scanner;

public class CampareNumbers {

	public static void main(String[] args) {
		Scanner linea = new Scanner(System.in);
		String numeroStr, numeroStr2;
		int numero, numero2;
		
		System.out.print("introzcu nº1: ");
		numeroStr = linea.nextLine();
		numero = Integer.parseInt(numeroStr);
		System.out.print("Introduzca nº2: ");
		numeroStr2 = linea.nextLine();
		numero2 = Integer.parseInt(numeroStr2);
		
		if (numero>numero2) {
			System.out.println("nº1 es mayor a nº2");
		}else if (numero<numero2) {
			System.out.println("nº1 es menor que nº2");
		}else {
			System.out.println("nº1 es igual a nº2");
		}

	}

}
