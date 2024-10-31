package ejerciciosR2;

import java.util.Scanner;

public class Funciones1 {
	Scanner sc= new Scanner(System.in);
	

	
	
	public static double kmMillas(double kilometro) {
	
		double millas1=0.621371;
		return kilometro*millas1;
	}
	public static double millasKm(double millas) {
		double kilometro1=1.60934;
		return millas*kilometro1;
	}
	
	public static double kgLibras(double kilos) {
		double libras1=2.20462;
		return kilos*libras1;
	}
	
	
	public static double libraskg(double libras){
		double kilogramos1= 0.453592;
		return libras*kilogramos1;
	}
	
	public static void subMenuLongitud(String texto, Scanner sc) {
	int n1=0;
		do {
			System.out.println("Selecciona la conversion de longitud");
			System.out.println("1. Millas a kilometros");
			System.out.println("2. Kilometros a Millas");
			System.out.println("0. Salir");
			n1=Funciones.dimeEntero("Escribe un numero", sc);
			if(n1==1){
				double longi=Funciones.dimeDouble("Escribe la longitud", sc);
				System.out.println(millasKm(longi));
			}
			else if(n1==2) {
				double longi=Funciones.dimeDouble("Escribe la longitud", sc);
				System.out.println(millasKm(longi));
				System.out.println(kmMillas(n1));
			}
			
		}while(n1!=0);
		
	}
	
	public static void subMenuPeso(String texto, Scanner sc) {
		int n1=0;
		do {
			System.out.println("Selecciona la conversion de peso");
			System.out.println("1. Kilogramos a Libras");
			System.out.println("2. Libras a Kilogramos");
			System.out.println("0. Salir");
			n1=Funciones.dimeEntero("Escribe un numero", sc);
			if(n1==1) {
				double peso=Funciones.dimeDouble("Escribe la longitud", sc);
				System.out.println(millasKm(peso));
				System.out.println(kgLibras(n1));
			}
			else if(n1==2) {
				double peso=Funciones.dimeDouble("Escribe el peso", sc);
				System.out.println(millasKm(peso));
				System.out.println(libraskg(n1));
			}
		}while(n1!=0);
		
	}
	
	
	
	
	
	
	

}
