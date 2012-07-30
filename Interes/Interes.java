// Fig. 5.6: Interes.java
// Cálculo del interes compuesto.
import java.text.NumberFormat; // clase para el formato numérico
import java.util.Locale; // clase para la información específica de cada país.

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Interes {

	public static void main( String args[] )
	{
		double cantidad; // cantidad depositada al final de cada año
		double principal = 1000.0; //cantidad inicial sin intereses
		double tasa = 0.05; // tasa de interés

		// crear NumberFormat para la moneda en dólares
		NumberFormat formatoMoneda = 
			NumberFormat.getCurrencyInstance( Locale.US );

		// crear JTextArea para mostrar la salida
		JTextArea areaTextoSalida = new JTextArea();

		// establecer la primera línea de texto en areaTextoSalida
		areaTextoSalida.setText( "Año\tCantidad en depósito\n" );

		// calcular la cantidad en depósito para cada uno de los diez años
		for ( int anio = 1; anio <= 10; anio++ ) {

			// calcular la nueva cantidad para el año especificado
			cantidad = principal * Math.pow( 1.0 + tasa, anio );

			// anexar una línea de texto a areaTextoSalida
			areaTextoSalida.append( anio + "\t" +
				formatoMoneda.format( cantidad ) + "\n" );
			
		} // fin de la instrucción for

		// mostrar resultados
		JOptionPane.showMessageDialog( null, areaTextoSalida,
			"Interés compuesto", JOptionPane.INFORMATION_MESSAGE );

		System.exit( 0 ); // terminar la aplicación

	} // fin del método main
	
} // fin de la clase Interes
