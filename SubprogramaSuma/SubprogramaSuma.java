// Fig. 3.13: SubprogramaSuma.java
// Suma dos números de punto flotante.

// Paquetes de java
import java.awt.Graphics; // importar la clase Graphics
import javax.swing.*; // importar el paquete javax.swing

public class SubprogramaSuma extends JApplet {
	double suma; // la suma de los valores introducidos por el usuario.

	// inicializar el applet, obteniendo los valores del usuario
	public void init()
	{
		String primerNumero; // primera cadena introducida por el usuario
		String segundoNumero; // segunda cadena introducida por el usuario

		double numero1; // primer número a sumar
		double numero2; // segundo número a sumar

		// obtener el primer número del usuario
		primerNumero = JOptionPane.showInputDialog(
			"Escriba el primer valor de punto flotante" );

		// obtener el segundo número del usuario
		segundoNumero = JOptionPane.showInputDialog(
			"Escriba el segundo valor de punto flotante" );

		// convertir los números de tipo String a tipo double
		numero1 = Double.parseDouble( primerNumero );
		numero2 = Double.parseDouble( segundoNumero );

		// sumar los números
		suma = numero1 + numero2;

	} // fin del método init

	// dibujar los resultados en un rectángulo en el fondo del applet
	public void paint( Graphics g )
	{
		// llamar a la versión del método paint de la superclase
		super.paint( g );

		// dibujar el rectángulo, empezando desde (15, 10), que tenga 270
		// píxeles de ancho y 20 píxeles de alto
		g.drawRect( 15, 10, 270, 20 );

		// dibujar los resultados como String en (25, 25)
		g.drawString( "La suma es " + suma, 25, 25 );

	} // fin del método paint

} // fin de la clase SubprogramaSuma

// <applet code="SubprogramaSuma.class" height="65" width="300"></applet>