package modulo3_operadores;

public class Operadores {

	public static void main(String[] args) {
//		Operadores Ternario
//		IFTTT
//		?
//		expresion ? expresion2 : expresion3
//		Si expresion 1 = true entonces expresion 2
//		Si expresion 1 = false entonces expresion 3
		
		String mensaje = 10 > 90 ? "Es mayor" : "Es menor";
		
		int enteros = true ? 3 : 4;
		
		System.out.println(mensaje);
		System.out.println(enteros);
		
		

		
		
		
		
		
//		======================================
		
//		Operadores Logicos
//		and (y), or(o) y not (no)
		
//		boolean result;
//		
//		result = 5 >= 5 && true && 10 > 9;
//		System.out.println(result);
//		
//		result = false || false || false || true;
//		System.out.println(result);
//		
//		result = (5 >= (2*3) || true) && (true && 10 > 5);
//		System.out.println(result);
//		
//		System.out.println(!true);
//		
		
		
		
		
		
		
//		Operadores Relacionales
//		
//		int variable1 = 400, variable2 = 200;
//		boolean result;
//		
//		result = variable1 < variable2;
//		System.out.println(result);
//		
//		result = variable1 > variable2;
//		System.out.println(result);
//		
//		result = variable1 >= variable2;
//		System.out.println(result);
//		
//		result = variable1 <= variable2;
//		System.out.println(result);
//		
//		result = variable1 == variable2;
//		System.out.println(result);
//		
//		result = variable1 != variable2;
//		System.out.println(result);
//		
		
		
		
//		=============================================
		
		int variableX = 50, variableY = 10;
		float variableZ = 5.5f;
		float resultado;
		
//		Casting
		
		resultado = (float)variableX + variableZ;
//		System.out.print(resultado);
		
		
		
		
		
//		Operadores Aritmetricos
		
		
		resultado = variableX + variableY;
//		System.out.println(resultado);
		
		resultado = variableX - variableY;
//		System.out.println(resultado);
		
		resultado = variableX * variableY;
//		System.out.println(resultado);
		
		resultado = variableX / variableY;
//		System.out.println(resultado);
	}

}
