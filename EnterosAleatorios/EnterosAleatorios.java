// Fig. 6.7: EnterosAleatorios.java
// Enteros aleatorios con desplazamiento y escala.
import javax.swing.JOptionPane;

public class EnterosAleatorios {

	public static void main( String args[] )
	{
		int valor;
		String salida = "";

		// iterar 20 veces
		for ( int contador = 1; contador <= 20; contador++ ) {

			// elegir entero aleatorio entre 1 y 6
			valor = 1 + (int) ( Math.random() * 6 );

			salida += valor + "   "; // anexar valor a salida

			// si el contador es divisible entre 5, anexar nueva línea a String salida
			if ( contador % 5 == 0 ) {
				salida += "\n";
			}
			
		} // fin del instrucción for

		JOptionPane.showMessageDialog( null, salida,
			"20 numeros aleatorios de 1 a 6",
			JOptionPane.INFORMATION_MESSAGE );

		System.exit( 0 ); // terminar la aplicación

	} // fin del método main
	
} // fin de la clase EnterosAleatorios
