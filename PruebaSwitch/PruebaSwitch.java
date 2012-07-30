// Fig. 5.9: PruebaSwitch.java
// Dibujar líneas, rectángulos u óvalos con base en la entrada del usuario.
import java.awt.Graphics;

import javax.swing.*;

public class PruebaSwitch extends JApplet {
	int opcion; // la opción del usuario en cuanto a cuál figura dibujar

	// inicializar el applet, obteniendo la opción del usuario
	public void init()
	{
		String entrada; // la entrada del usuario

		// obtener la opción del usuario
		entrada = JOptionPane.showInputDialog( 
			"Escriba 1 para dibujar líneas\n" +
			"Escriba 2 para dibujar rectángulos\n" +
			"Escriba 3 para dibujar óvalos\n" );

		opcion = Integer.parseInt( entrada ); // convertir entrada en un int

	} // fin del método init

	// dibujar figuras en el fondo del applet
	public void paint( Graphics g )
	{
		super.paint( g ); // llamar al método paint heredado de JApplet

		for ( int i = 0; i < 10; i++ ) {

			switch ( opcion ) { // determinar la figura a dibujar

				case 1: // dibujar una línea
					g.drawLine( 10, 10, 250, 10 + i * 10 );
					break; // fin de procesamiento de case

				case 2: // dibujar un rectángulo
					g.drawRect( 10 + i * 10, 10 + i * 10,
						50 + i * 10, 50 + i * 10 );
					break; // fin de procesamiento de case

				case 3: // dibujar un óvalo
					g.drawOval( 10 + i * 10, 10 + i * 10,
						50 + i * 10, 50 + i * 10 );
					break; // fin de procesamiento de case

				default: // dibujar cadena indicando que se escribió un valor incorrecto
				g.drawString( "Se escribió un valor incorrecto", 10, 20 + i * 15 );

			} // fin instrucción switch
			
		} // fin instrucción for

	} // fin del método paint
	
} // fin de la clase PruebaSwitch

// <applet code="PruebaSwitch.class" height="300" width="250"></applet>