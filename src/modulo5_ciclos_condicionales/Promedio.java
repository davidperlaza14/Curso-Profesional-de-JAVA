package modulo5_ciclos_condicionales;

public class Promedio {
	public static void main(String[] args) {
//		El promedio minimo para aprobar es de 7
//		Si el promedio es 10 = Muchas Felicidades
//		Si el promedio es aprobatorio pero menor a diez  = Felicidades
//		Si el promedio no  es aprobatorio = Es necesario repasar el bloque
		
		int promedio = 15;
		
		if ( promedio >= 7 ) {
			
			if (promedio >=10) {
				System.out.println("Muchas Felicidades");
				
			} else {
				System.out.println("Felicidades");
			}
		} else {
			System.out.println("Es necesario repasar el bloque");
			
		}
	}

}
