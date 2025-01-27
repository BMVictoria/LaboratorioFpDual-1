package arrays1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * EUC  que contenga un m�todo que reciba un arreglo tipo int y que retorne 
 * true (verdadero) si en la primera o en la �ltima posici�n hay un 6, 
 * y falso (false) si no.
 * @author pablo.villar.serrano
 *
 */
public class Eje1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int tam = 10;
//		int[] array = new int[tam];
		
		List<Integer> numeros = Arrays.asList(6,5,4);
		List<Integer> numeros2 = Arrays.asList(7,9,4);

//		System.out.println("Introduce los 10 numeros del array");
		
//		for (int i=0; i<array.length; i++) {
//			array[i]=sc.nextInt();
//		}
//		for (int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
		

//		boolean comprobacion = comprobar(array);
//		if (comprobacion == true) {
//			System.out.println("O el primero o el ultimo numero del array es un 6");
//		}
//		else 
//			System.out.println("Ni en la primera ni en la ultima posicion hay un 6");
//		

        // For Each loop 
//        for(String numero: numeros){
//        	System.out.println(numero); 
//        	} 
        
        // Java 8 Lambda For loop 
        numeros.stream().forEach(num-> System.out.println(num));
                

        numeros.stream().forEach(num->{
        	if (comprobar6(num.intValue())==true) {
        		System.out.println("Aqui hay un 6");
        	}
        	else {
        		System.out.println("Aqui no hay un 6");
        	}
        });
        
        numeros.stream().forEach(num->{
        	if (comprobar6(num.intValue())==true) {
        		System.out.println("Hay un 6 en la lista");
        	}
        });

		
		sc.close();

	}
	public static boolean comprobar(int[] array) {
		
		if((array[0]==6) || (array[array.length-1]==6)) {
			return true;
		}
		else 
			return false;
		
	}
	public static boolean comprobar6(int num) {
		
		if((num==6)) {
			return true;
		}
		else 
			return false;
		
	}

}
