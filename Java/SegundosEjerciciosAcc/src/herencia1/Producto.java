package herencia1;


/*Se plantea desarrollar un programa Java que permita la gesti�n 
 * de una empresa agroalimentaria  que  trabaja  con  tres  tipos  de 
 * productos:  productos  frescos, productos  refrigerados  y  
 * productos  congelados.  
 * 
 * Todos  los  productos  llevan alguna informaci�n com�n como 
 * fecha de caducidad y n�mero de lote, pero a su vez  cada  tipo 
 * de  producto  lleva  alguna  informaci�n espec�fica,  
 * por  ejemplo  
 * 
 * los productos congelados deben llevar la temperatura de congelaci�n
 * recomendada. Hay  tres  tipos  de  productos  congelados: congelados 
 *  por  aire,  congelados  por agua y congelados por nitr�geno. 
 *  
 *  La  empresa  gestiona  env�os  a rav�s  de  diferentes  medios,  y
 *  un  env�o  puede contener cierto n�mero de productos frescos, 
 *  refrigerados o congelados.
 *  
 *Identificar las 7 clases Java principales que podemos 
 * identificar dada la forma de funcionamiento de la empresa. 
 * Crear un esquema con las relaciones de herencia y/o uso entre
 *las distintas clases.*/

public class Producto {
	
	String nombreProd;
	String caducidad;
	String nLote;
	
	
	public Producto(String caducidad, String nLote, String nombreProd) {
		this.caducidad = caducidad;
		this.nLote = nLote;
		this.nombreProd=nombreProd;
	}


	public String getNombreProd() {
		return nombreProd;
	}


	public void setNombreProd(String nombreProd) {
		this.nombreProd = nombreProd;
	}


	public String getCaducidad() {
		return caducidad;
	}


	public void setCaducidad(String caducidad) {
		this.caducidad = caducidad;
	}


	public String getnLote() {
		return nLote;
	}


	public void setnLote(String nLote) {
		this.nLote = nLote;
	}

	public void imprimirCad() {
		System.out.println("El producto caduca " +caducidad);
	}


	
}
