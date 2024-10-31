package ejerciciosR2;

import java.util.Scanner;



public class Funciones2 {
	
	public static double celsiusaFahrenheit(double temperatura ) {
		return (temperatura * 9/5) + 32;
		
	}
    public static double Fahrenheitcelsius (double temperatura ) {
		return (temperatura- 32) * 5 / 9;
		

		
	}
     public static double litrosagalones (double volumen ) {
    	return volumen/3.785;
    	
    }
    public static double galonesalitros (double volumen ) {
    	return volumen*3.785;
    	
    }
    public static void menutemperatura(String texto, Scanner sc ) {
    	int n=0;
    	do {
        System.out.println("1. celsius a Fahrenheit");
    	System.out.println("2. Fahrenheit a celsius");
    	System.out.println("0. salir");
        n=Funciones.dimeEntero("Escribe un numero", sc);
    	}while(n!=0);
    	switch(n) {
    	case 1:
    		System.out.println(celsiusaFahrenheit(n));
    	case 2:
    		System.out.println(Fahrenheitcelsius(n));
    		
    	}
    
    	
		
    	
    }
    public static void menuvolumen(String texto, Scanner sc ) {
    	int n=0;
    	do {
        System.out.println("1. litros a galones");
    	System.out.println("2. galones a litros");
    	System.out.println("0. salir");
        n=Funciones.dimeEntero("Escribe un numero", sc);
    	}while(n!=0);
    	switch(n) {
    	case 1:
    		System.out.println(litrosagalones(n));
    	case 2:
    		System.out.println(galonesalitros(n));
    		
    	}
    
    	
		
    	
    }
    
}
