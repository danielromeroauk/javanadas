// Fig. 2.9 Suma.java
// Programa que muestra la suma de dos números.

// Paquetes de Java
import javax.swing.JOptionPane; // el programa usa JOptionPane

public class Suma {

	// el método main empieza la ejecución de la aplicación en Java
	public static void main( String args[] )
	{
		String primerNumero; // primera cadena introducida por el usuario
		String segundoNumero; // segunda cadena introducida por el usuario

		int numero1; // primer número a sumar
		int numero2; // segundo número a sumar
		int suma; // suma de numero1 y numero2

		// leer el primer número del usuario como una cadena
		primerNumero = JOptionPane.showInputDialog( "Escribe el primer entero" );

		// leer el segundo número del usuario como una cadena
		segundoNumero = 
			JOptionPane.showInputDialog( "Escriba el segundo entero" );

			// convertir los número de tipo String a tipo int
			numero1 = Integer.parseInt( primerNumero );
			numero2 = Integer.parseInt( segundoNumero );

			// sumar los números
			suma = numero1 + numero2;

			// mostrar el resultado
			JOptionPane.showMessageDialog( null, "La suma es " + suma, 
				"Resultados", JOptionPane.PLAIN_MESSAGE );

		System.exit( 0 ); // terminar la aplicación con la ventana
	
	} // fin del método main

} // fin de la clase Suma
