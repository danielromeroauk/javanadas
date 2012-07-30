// Fig. 5.1: ContadorWhile.java
// Repetición controlada por contador.
import java.awt.Graphics;

import javax.swing.JApplet;

public class ContadorWhile extends JApplet {

	// dibujar líneas en el fondo del applet
	public void paint( Graphics g )
	{
		super.paint( g ); // llamar al método paint heredado de JApplet

		int contador = 1; // inicialización

		while ( contador <= 10 ) {
			g.drawLine( 10, 10, 250, contador * 10 );
			++contador; // incremento

		} // fin de la instrucción while

	} // fin del método paint
	
} // fin de la clase ContadorWhile

//<applet code="ContadorWhile.class" height="110" width="275"></applet>