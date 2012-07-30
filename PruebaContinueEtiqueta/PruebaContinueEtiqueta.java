// Fig. 5.14: PruebaContinueEtiqueta.java
// Instrucción continue etiquetada.
import javax.swing.JOptionPane;

public class PruebaContinueEtiqueta {

	public static void main( String args[] )
	{
		String salida = "";

		siguienteFila: // etiqueta de destino de la instrucción continue

		// contar 5 filas
		for ( int fila = 1; fila <= 5; fila++ ) {
			salida += "\n";

			// contar 10 columnas por fila
			for ( int columna = 1; columna <= 10; columna++ ) {

				// si la columna es mayor que la fila, empezar la siguiente fila
				if ( columna > fila ) {
					continue siguienteFila; // siguiente iteración del ciclo etiquetado
				}
				salida += "* ";

			} // fin de instrucción for interior
			
		} // fin de instrucción for exterior

		JOptionPane.showMessageDialog( null, salida,
			"Probando continue con una etiqueta",
			JOptionPane.INFORMATION_MESSAGE );

		System.exit( 0 ); // terminar la aplicación

	} // fin del método main
	
} // fin de la clase PruebaContinueEtiqueta
