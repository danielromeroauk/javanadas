// Fig. 5.7: PruebaDoWhile.java
// Uso de la instrucción do...while.
import java.awt.Graphics;

import javax.swing.JApplet;

public class PruebaDoWhile extends JApplet {

	// dibujar líneas en el applet
	public void paint( Graphics g )
	{
		super.paint( g ); // llamar al método paint heredado de JApplet

		int contador = 1; // inicializar contador

		do {
			g.drawOval( 110 - contador * 10, 110 - contador * 10,
				contador * 20, contador * 20 );
			++contador;
		} while ( contador <= 10 ); // fin de instrucción do...while

	} // fin del método paint
	
} // fin de la clase PruebaDoWhile

//<applet code="PruebaDoWhile.class" height="250" width="250"></applet>