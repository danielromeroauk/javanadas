// Fig. 2.20 Comparacion.java
// Compara enteros utilizando instrucciones if, operadores relacionales
// y de igualdad.

// Paquetes de Java
import javax.swing.JOptionPane; // el programa usa JOptionPane

public class Comparacion {

	// el método main empieza la ejecución de la aplicación en Java
	public static void main( String args[] )
	{
		String primerNumero; // primera cadena introducida por el usuario
		String segundoNumero; // segunda cadena introducida por el usuario
		String resultado; // una cadena que contiene el resultado

		int numero1; // primer número para comparar
		int numero2; // segundo número para comparar

		// recibir el primer número del usuario como una cadena
		primerNumero = JOptionPane.showInputDialog( "Escriba el primer entero" );

		// recibir el segundo número del usuario como una cadena
		segundoNumero = 
			JOptionPane.showInputDialog( "Escriba el segundo entero" );

			// convertir los número de tipo String a tipo int
			numero1 = Integer.parseInt( primerNumero );
			numero2 = Integer.parseInt( segundoNumero );

			// inicializar resultado con cadena vacía.
			resultado = "";

			if ( numero1 == numero2 ) {
				resultado = resultado + numero1 + " == " + numero2;
			}

			if ( numero1 != numero2 ) {
				resultado = resultado + numero1 + " != " + numero2;
			}

			if ( numero1 < numero2 ) {
				resultado = resultado + "\n" + numero1 + " < " + numero2;
			}

			if ( numero1 > numero2 ) {
				resultado = resultado + "\n" + numero1 + " > " + numero2;
			}

			if ( numero1 <= numero2 ) {
				resultado = resultado + "\n" + numero1 + " <= " + numero2;
			}

			if ( numero1 >= numero2 ) {
				resultado = resultado + "\n" + numero1 + " >= " +numero2;
			}

			// Mostrar el resultado
			JOptionPane.showMessageDialog( null, resultado, 
				"Resultados de la comparación", JOptionPane.INFORMATION_MESSAGE );

		System.exit( 0 ); // terminar la aplicación con la ventana
	
	} // fin del método main

} // fin de la clase Comparacion
