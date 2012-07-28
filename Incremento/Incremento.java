// Fig.  4.14: Incremento.java
// Los operadores preincremento y postincremento.

public class Incremento {
	
	public static void main( String args[] )
	{
		int c;

		// demostrar el uso de postincremento
		c = 5; // asignar 5 a c
		System.out.println( c ); // imprimir 5
		System.out.println( c++ ); // imprimir 5 y después postincremento.
		System.out.println( c ); // imprimir 6

		System.out.println(); // saltar una línea

		// demostrar el uso de preincremento
		c = 5; // asignar 5 a c
		System.out.println( c ); // asignar 5 a c
		System.out.println( ++c ); // preincrementar y después imprimir 6
		System.out.println( c ); // imprimir 6

	} // fin del método main

} // fin de la clase Incremento