// Fig. 4.11: Analisis.java
// Análisis de los resultados de un examen.
import javax.swing.JOptionPane;

public class Analisis {

	public static void main( String args[] )
	{
		// inicializar variables en las declaraciones
		int aprobados = 0; // número de aprobados
		int reprobados = 0; // número de reprobados
		int contadorEstudiantes = 0; // contador de estudiantes
		int resultado = 0; // resultado del examen

		String entrada; // valor introducido por el usuario
		String salida; // cadena de salida

		// procesar 10 estudiantes utilizando el ciclo controlado por contador
		while ( contadorEstudiantes <= 10 ) {

			// pedir al usuario la entrada y obtener el valor del usuario
			entrada = JOptionPane.showInputDialog( 
				"Escriba el resultado (1 = aprobado, 2 = reprobado)" );

			// convertir el resultado en int
			resultado = Integer.parseInt( entrada );

			// si resultado es 1, incrementar aprobados; if...else anidado en while
			if ( resultado == 1 ) {
				aprobados = aprobados + 1;
			} else { // si el resultado no es 1, incrementar reprobados
				reprobados = reprobados + 1;
			}

			// incrementar contadorEstudiantes para que el ciclo termine eventualmente
			contadorEstudiantes = contadorEstudiantes + 1;

		} // fin de la instrucción while

		// fase de terminación; preparar y mostrar resultados
		salida = "Aprobados: " + aprobados + "\nReprobados: " + reprobados;

		// determinar si aprobaron más de 8 estudiantes
		if ( aprobados > 8 ) {
			salida = salida + "\nAumentar colegiatura";
		}

		JOptionPane.showMessageDialog( null, salida, 
			"Análisis de resultados del examen",
			JOptionPane.INFORMATION_MESSAGE );

		System.exit( 0 ); // terminar la aplicación

	} // fin del método main

} // fin de la clase Analisis
