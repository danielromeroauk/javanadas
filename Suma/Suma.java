// Fig. 5.5 Suma.java
// Suma de enteros con la instrucción for.
import javax.swing.JOptionPane;

public class Suma {

	public static void main( String args[] )
	{
		int total = 0; // inicializar el total

		// sumar los enteros pares del 2 al 100
		for ( int numero = 2; numero <= 100; numero += 2 ) {
			total += numero;
			
		} // fin de la instrucción for

		// mostrar el resultaldo
		JOptionPane.showMessageDialog( null, "La suma es " + total,
			"Suma de los enteros pares del 2 al 100",
			JOptionPane.INFORMATION_MESSAGE );

		System.exit( 0 ); // terminar la aplicación
	
	} // fin del método main

} // fin de la clase Suma
