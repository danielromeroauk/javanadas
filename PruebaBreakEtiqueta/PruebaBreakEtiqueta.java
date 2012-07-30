// Fig. 5.13: PruebaBreakEtiqueta.java
// Instrucción break etiquetada.
import javax.swing.JOptionPane;

public class PruebaBreakEtiqueta {

	public static void main( String args[] )
	{
		String salida = "";

		alto: { // bloque etiquetado

			// contar 10 filas
			for ( int fila = 1; fila <= 10; fila++ ) {

				// contar 5 columnas
				for ( int columna = 1; columna <= 5; columna++ ) {

					if ( fila == 5 ) { // si la fila es 5,
						break alto; // saltar al final del bloque alto
					}
					salida += "* ";
					
				} // fin de instrucción for interna

				salida += "\n";
				
			} // fin de instrucción for externa

			// la siguiente línea se evita
			salida += "\nLos ciclos terminaron normalmente";

		} // fin de bloque etiquetado

		JOptionPane.showMessageDialog( null, salida,
			"Probando break con una etiqueta",
			JOptionPane.INFORMATION_MESSAGE );

		System.exit( 0 ); // terminar la aplicación

	} // fin del método main
	
} //fin de la clase PruebaBreakEtiqueta
