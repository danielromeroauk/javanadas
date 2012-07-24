// Fig. 3.11: LineasBienvenido.java
// Mostrar texto y líneas.

// Paquetes de Java
import java.awt.Graphics; // importar la clase Graphics
import javax.swing.JApplet; // importar la clase JApplet

public class LineasBienvenido extends JApplet {
	
	// dibujar texto en el fondo del applet
	public void paint( Graphics g )
	{
		// llamar a la versión del método paint de las superclase
		super.paint( g );

		// dibujar una línea horizontal, desde (15, 10) hasta (250, 10)
		g.drawLine( 15, 10, 250, 10 );

		// dibujar una línea horizontal desde (15, 30) hasta (250, 30)
		g.drawLine( 15, 30, 250, 30 );

		// dibujar String entre líneas, en la ubicación (25, 25)
		g.drawString( "¡Bienvenido a la programación en Java!", 25, 25 );

	} // fin del método paint

} // fin de la clase LineasBienvenido

// para poder visualizar el applet desde la consola con la instrucción
// appletviewer LineasBienvenido.java
// <applet code="LineasBienvenido.class" width="300" height="40"></applet>
