// Fig 5.12: PruebaContinue.java
// Continuar con la siguiente iteración de un ciclo.
import javax.swing.JOptionPane;

public class PruebaContinue {

	public static void main( String args[] )
	{
		String salida = "";

		for ( int cuenta = 1; cuenta <= 10; cuenta++ ) { // iterar 10 veces

			if ( cuenta == 5 ) { // si cuenta vale 5
				continue;
			}
			salida += cuenta + " ";
			
		} // fin de instrucción for

		salida += "\nSe utiliz\u00F3 continue para evitar imprimir un 5";
		JOptionPane.showMessageDialog( null, salida );

		System.exit( 0 ); // terminar la aplicación

	} // fin de método main
	
} // fin de la clase PruebaContinue
