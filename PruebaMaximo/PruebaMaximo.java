// Fig. 6.4: PruebaMaximo.java
// Encontrar el valor máximo de tres números de punto flotante.
import java.awt.Container;

import javax.swing.*;

public class PruebaMaximo extends JApplet {

	// inicializar el applet, obtener la entrada del usuario y crear GUI
	public void init()
	{
		// obtener entrada del usuario
		String s1 = JOptionPane.showInputDialog( 
			"Escriba el primer valor de punto flotante" );
		String s2 = JOptionPane.showInputDialog( 
			"Escriba el segundo valor de punto flotante" );
		String s3 = JOptionPane.showInputDialog( 
			"Escriba el tercer valor de punto flotante" );

		// convertir la cadena del usuario en valores double
		double numero1 = Double.parseDouble( s1 );
		double numero2 = Double.parseDouble( s2 );
		double numero3 = Double.parseDouble( s3 );

		double max = maximo( numero1, numero2, numero3 ); // llamada al método

		// crear objeto JTextArea para mostrar resultados
		JTextArea areaSalida = new JTextArea();

		// mostrar los números y el valor máximo
		areaSalida.setText( "numero1: " + numero1 + "\nnumero2: " +
			numero2 + "\nnumero3: " + numero3 + "\nel valor maximo es: " + max );

		// obtener el área visible del applet para componentes GUI
		Container contenedor = getContentPane();

		// adjuntar areaSalida al contenedor
		contenedor.add( areaSalida );

	} // fin del método init

	// el método maximo utiliza el método max de la clase Math para
	// determinar el valor máximo
	public double maximo( double x, double y, double z )
	{
		return Math.max( x, Math.max( y, z ) );

	} // fin del método maximo
	
} // fin de la clase PruebaMaximo

// <applet code="PruebaMaximo.class" height="200" width="300"></applet>
