package modulo2_tipos_de_datos;

public class PrintPrintln {
	
	public static void main(String[] args) {
		
		System.out.println("Hola Mundo");
		System.out.println("Mi nombres es codi");
		
		
//		or otro lado, el método print imprimirá el mensaje en la misma línea.

		System.out.print("Hola Mundo");
		System.out.print("Mi nombre es Codi");
		
		
//		Secuencias de escapes
//		Java nos provee de una secuencia de escapes que nos permiten dar formato a las cadenas de texto con las que nos encontramos trabajando.

		/*\n. Salto de línea.
		\t. Tabulador.
		\\. Diagonal inversa.
		\". Comillas dobles.
		\'. Comillas simples.
		Estas secuencias pueden ser utilizadas 
		junto con los métodos previamente mencionados.*/
		
//		Ejemplos
		
		System.out.print("Hola,\nagregamos un salto");
		System.out.print("\tagregamos un tab");
		System.out.println("");
		
		System.out.println("Mensaje con \\ diagonal inversa");
		System.out.println("Mensaje con \" comillas dobles");
		System.out.println("Mensaje con \' comillas simples");


	}
	

}
