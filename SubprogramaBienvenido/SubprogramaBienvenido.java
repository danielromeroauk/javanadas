// Fig. 3.6: SubprogramaBienvenido.java
// Nuestro primer applet en Java.

// Paquetes de Java
import java.awt.Graphics; // importar la clase Graphics
import javax.swing.JApplet; // importar la clase JApplet

public class SubprogramaBienvenido extends JApplet {
	
	// dibujar texto en el fondo del applet
	public void paint( Graphics g )
	{
		// llamar a la versión del método paint de las superclase
		super.paint( g );

		// dibujar un String en la coordenada x 25 y la coordenada y 25
		g.drawString( "¡Bienvenido a la programación en Java!", 25, 25 );

	} // fin del método paint

} // fin de la clase SubprogramaBienvenido

// para poder visualizar el applet desde la consola con la instrucción
// appletviewer SubprogramaBienvenido.java
// <applet code="SubprogramaBienvenido.class" width="300" height="45"></applet>
