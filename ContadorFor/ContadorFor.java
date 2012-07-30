// Fig. 5.2: ContadorFor.java
// Repetición controlada por contador con la instrucción for.
import java.awt.Graphics;

import javax.swing.JApplet;

public class ContadorFor extends JApplet {

	// dibujar lineas en el fondo del applet
	public void paint( Graphics g )
	{
		super.paint( g ); // llamar al método paint heredado de JApplet

		// el encabezado de la instrucción for incluye la inicialización,
		// la condición de repetición y el incremento
		for ( int contador = 1; contador <= 10; contador++ ) {
			g.drawLine( 10, 10, 250, contador * 10 );
			
		} // fin de la instrucción for

	} // fin del método paint
	
} // fin de la clase ContadorFor

// <applet code="ContadorFor.class" height="110" width="275"></applet>
