// @charset=utf8;
// Fig. 4.7. Promedio1.java
// Programa del promedio de una clase mediante la repetición controlada por contador.
import javax.swing.JOptionPane;

public class Promedio1 {
	
	public static void main( String args[] ) 
	{
		int total; // suma e la calificaciones introducidas por el usuario
		int contadorCalif; // número de calificaciones a introducir a continuación
		int calificacion; // valor de la calificación
		int promedio; // promedio de calificaciones

		String cadenaCalif; // calificación introducida por usuario

		// fase de inicialización
		total = 0; // inicializar total
		contadorCalif = 1; // inicializar contador de ciclo

		// fase de procesamiento
		while ( contadorCalif <= 10 ) { // iterar 10 veces
			
			// pedir la entrada y leer la calificación del usuario
			cadenaCalif = JOptionPane.showInputDialog(
				"Escriba la calificación como un entero: " );

			// convertir cadenaCalif en un int
			calificacion = Integer.parseInt( cadenaCalif );

			total = total + calificacion; // sumar calificacion al total
			contadorCalif = contadorCalif + 1; // incrementa el contador

		} // fin de la instrucción while

		// fase de terminación
		promedio = total / 10; // división de enteros

		// mostrar el promedio
		JOptionPane.showMessageDialog( null, "El promedio de la clase es " + promedio,
		"Promedio de la clase", JOptionPane.INFORMATION_MESSAGE );

		System.exit( 0 ); // terminar el programa

	} // fin del método main

} // fin de la clase Promedio1