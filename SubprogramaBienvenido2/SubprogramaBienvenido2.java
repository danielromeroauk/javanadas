// Fig. 3.9: SubprogramaBienvenido2.java
// Mostrar varias cadenas en un applet.

// Paquetes de Java
import java.awt.Graphics; // importar la clase Graphics
import javax.swing.JApplet; // importar la clase JApplet

public class SubprogramaBienvenido2 extends JApplet {
	
	// dibujar texto en el fondo del applet
	public void paint( Graphics g )
	{
		// llamar a la versión del método paint de las superclase
		super.paint( g );

		// dibujar dos valores String en diferentes ubicaciones
		g.drawString( "¡Bienvenido a", 25, 25 );
		g.drawString( "la programación en Java!", 25, 40 );

	} // fin del método paint

} // fin de la clase SubprogramaBienvenido2

// para poder visualizar el applet desde la consola con la instrucción
// appletviewer SubprogramaBienvenido2.java
// <applet code="SubprogramaBienvenido2.class" width="300" height="60"></applet>
