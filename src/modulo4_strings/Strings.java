package modulo4_strings;

public class Strings {
	
	public static void main(String[] args) {
		// Concatenar String
		String nombre = "codi";
		String curso = "Curso de java 9";
		
		String mensaje = "Hola, bienvenido ".concat(nombre);
		mensaje = mensaje.concat(" al ");
		mensaje = mensaje.concat(curso);
		mensaje = mensaje.concat(".");
		
		System.out.println(mensaje);
		
//		===================================
		
//		String = Clase
//		
//		String cadena1 = "HOLA";
//		String cadena2 = "hola";
//		
//		boolean resultado = cadena2.equals(cadena1);
//		System.out.println(resultado);
//		
//		resultado = cadena2.equalsIgnoreCase(cadena1);
//		System.out.println(resultado);
//		
		
		
//		String mensaje = "";
//		String curso = "Java";
//		
//		float valor = 10.873409f;
//		
//		//nuevo String
//		mensaje = String.format("El total de %d articulos es %.2f %s", 3, valor, "USD");
//		System.out.println(mensaje);
//		System.out.printf(mensaje);
//		
//		String mensaje = "	Hola, soy un String	";
//		System.out.println(mensaje.toUpperCase().trim());
//		System.out.println(mensaje.toLowerCase().trim());
//		System.out.println(mensaje.trim());
//		System.out.println(mensaje);
		
		
		
		
//		String mensaje2 = new String("Texto");
//		
//		int cantidad = mensaje.length();
//		boolean contiene = mensaje.contains("hola");
//		
//		boolean comienzaCon = mensaje.startsWith("Hola");
//		boolean terminaCon = mensaje.endsWith("String");
		
//		System.out.println(mensaje);
//		System.out.println(cantidad);
//		System.out.println(contiene);
		
//		System.out.println(comienzaCon);
//		System.out.println(terminaCon);
		
//		String nuevoString = mensaje.concat(", Estamos en el curso de Java");
//		System.out.println(nuevoString);
		
		
		
	}

	
	

}
