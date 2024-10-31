package ejerciciosR2;

import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1=0;
		int n2=0;
		do {
			System.out.println("Selecciona el tipo de conversion:");
			System.out.println("1. Longitud");
			System.out.println("2. Peso");
			System.out.println("3. Temperatura");
			System.out.println("4. Volumen");
			System.out.println("0. Salir");
			n2= Funciones.dimeEntero("Escribe un numero", sc);
			switch(n2) {
			case 1:
				
				Funciones1.subMenuLongitud("dime longitud", sc);
			case 2:
				
				Funciones1.subMenuPeso("dime peso", sc);
			case 3:
				
				Funciones2.menutemperatura("dime temperatura", sc);
			case 4:
				
				Funciones2.menuvolumen("dime volumen", sc);
			}
			
		}while(n2!=0);
		
		
			
		}
		

	}
	

