// Fig. 6.15: PruebaFactorial.java
// Método recursivo para el factorial.
import java.awt.*;

import javax.swing.*;

public class PruebaFactorial extends JApplet {
	JTextArea areaSalida;

	// crear GUI y calcular factoriales del 0-10
	public void init()
	{
		areaSalida = new JTextArea();

		Container contenedor = getContentPane();
		contenedor.add( areaSalida );

		// calcular los factoriales del 0 hasta 10
		for ( long contador = 0; contador <= 10; contador++ ) {
			areaSalida.append( contador + "! = " +
				factorial( contador ) + "\n" );
		}

	} // fin del método init

	// declaración recursiva del método factorial
	public long factorial( long numero )
	{
		// caso base
		if ( numero <= 1 ) {
			return 1;
		} else { // paso recursivo
			return numero * factorial( numero - 1 );
		}

	} // fin del método factorial
	
} // fin de la clase PruebaFactorial

// <applet code="PruebaFactorial.class" height="300" width="200"></applet>