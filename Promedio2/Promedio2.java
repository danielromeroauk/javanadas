// Fig. 4.9: Promedio2.java
// Programa del promedio de una clase mediante la repetición controlada por centinela.
import java.text.DecimalFormat; // clase para dat formato a los números
import javax.swing.JOptionPane;

public class Promedio2 {

	public static void main( String args[] )
	{
		int total; // suma de las calificaciones
		int contadorCalif; // número de calificaciones introducidas
		int calificacion; // valor de la calificación

		double promedio; // número con punto decimal para el promedio

		String cadenaCalif; // calificación introducida por el usuario

		// fase de inicialización
		total = 0; // inicializar el total
		contadorCalif = 0; //inicializar contador de ciclo

		// fase de procesamiento
		// obtener la primera calificación del usuario
		cadenaCalif = JOptionPane.showInputDialog( 
		"Escriba calificación como entero o -1 para salir:" );

		// convertir cadenaCalif en int
		calificacion = Integer.parseInt( cadenaCalif );

		// iterar hasta que el usuario introduzca el valor centinela
		while ( calificacion != -1 ) {
			total = total + calificacion; // sumar calificacion al total
			contadorCalif = contadorCalif + 1; // incrementar el contador

			// obtener siguiente calificación del usuario
			cadenaCalif = JOptionPane.showInputDialog( 
			"Escriba calificación como entero o -1 para salir:" );

			// convertir cadenaCalif en int
			calificacion = Integer.parseInt( cadenaCalif );

		} // fin de instrucción while

		// fase de terminación
		DecimalFormat dosDigitos = new DecimalFormat( "0.00" );

		// si el usuario introdujo al menos una calificación...
		if ( contadorCalif != 0 ) {
				
			// calcular el promedio de todas las calificaciones introducidas
			promedio = (double) total / contadorCalif;

			// mostrar el promedio con dos dígitos de precisión
			JOptionPane.showMessageDialog( null,
					"El promedio de la clase es " + dosDigitos.format( promedio ),
					"Promedio de la clase", JOptionPane.INFORMATION_MESSAGE );
			
			} // fin de la parte if de la instrucción if...else

			else { // si no introdujeron calificaciones, imprimir el mensaje apropiado
				JOptionPane.showMessageDialog( null, "No se introdujeron calificaciones",
					"Promedio de la clase", JOptionPane.INFORMATION_MESSAGE );

				System.exit( 0 ); // terminar la aplicación
			}

	} // fin del método main

} // fin de la clase Promedio2