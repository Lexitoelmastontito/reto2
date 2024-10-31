package ejerciciosR2;

import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
		
		System.out.println("Selecciona el tipo de conversion:");
		System.out.println("1. Longitud");
		System.out.println("2. Peso");
		System.out.println("3. Temperatura");
		System.out.println("4. Volumen");
		System.out.println("0. Salir");
		

	}
	public static int dimeEntero(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s1 = sc.nextLine();
				int num = Integer.parseInt(s1);
				return num;
			} catch (Exception e) {
				System.out.println("Formato incorrecto");
				;

			}
		} while (true);
}
}
