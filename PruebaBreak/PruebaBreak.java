// Fig. 5.11: PruebaBreak.java
// Terminación de un ciclo con break.
import javax.swing.JOptionPane;

public class PruebaBreak {

	public static void main( String args[] )
	{
		String salida = "";
		int cuenta;

		for ( cuenta = 1; cuenta <= 10; cuenta++ ) { // iterar 10 veces

			if ( cuenta == 5 ) { // si cuenta vale 5
				break; // terminar el ciclo
			}
			salida += cuenta + " ";

		} // fin de instrucción for

		salida += "\nSe salió del ciclo en cuenta = " + cuenta;
		JOptionPane.showMessageDialog( null, salida );

		System.exit( 0 ); // terminar la aplicación

	} // fin del método main
	
} // fin de la clase PruebaBreak