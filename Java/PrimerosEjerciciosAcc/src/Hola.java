
//BigDecimal coge los numeros mas grandes que double y float 
import java.math.BigDecimal;
import java.util.Date;


public class Hola{
	
	//Cada vez que ejecute la clase Hola, se crea esta variable en memoria 
	//GLOBAL
	static Integer variableStatic = 5;
	
	public static void main(String[] args){
		
		System.out.println("Hola dia 1");
		
		//VARIABLES LOCALES
			
		//objeto con un atributo con valor 5 dentro de �l
		Integer b=5;
		int a=5;

		short c=5, j=6;
		short k,i;
		
		float d= 5.5f;
		
		//objeto con un atributo con valor 5 dentro de �l
		Double e=5.5;
		double f=5.5;
		
		boolean ejemplo = 100+50*6%2 == 100;
		String ejemplo2 = 100+50*6%2 == 120 ? "Verdad" : "Falso";
		String ejemplo3 = 100+50*6%2 <= 100 &&  100+50*6%2 >= 0 ? "Verdad" : "Falso";

		int edad=16;
		
		String ejemplo4 = (edad+50*6%2 >= 18 &&  edad+50*6%2 <=35) || edad ==16 ? "Verdad" : "Falso";
		
		System.out.println(ejemplo);
		System.out.println(ejemplo2);
		System.out.println(ejemplo3);
		System.out.println(ejemplo4);
		
		//Declaracion implicita
		Date date = new Date();
		System.out.println(date);

		

	}


}