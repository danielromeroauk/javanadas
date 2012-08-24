// Fig. 6.16: PruebaFibonacci.java
// Método recursivo fibonacci.
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaFibonacci extends JApplet implements ActionListener {
	JLabel numeroEtiqueta, resultadoEtiqueta;
	JTextField numeroCampo, resultadoCampo;

	// configurar la GUI del applet
	public void init()
	{
		// obtener el panel de contenido y establecer su esquema como FlowLayout
		Container contenedor = getContentPane();
		contenedor.setLayout( new FlowLayout() );

		// crear numeroEtiqueta y adjuntarlo al panel de contenido
		numeroEtiqueta = new JLabel( "Escriba un entero y oprima Intro" );
		contenedor.add( numeroEtiqueta );

		// crear numeroCampo y adjuntarlo al panel de contenido
		numeroCampo = new JTextField( 10 );
		contenedor.add( numeroCampo );

		// registrar este applet como ActionListener de numeroCampo
		numeroCampo.addActionListener( this );

		// crear resultadoEtiqueta y adjuntarlo al panel de contenido
		resultadoEtiqueta = new JLabel( "El valor de Fibonacci es" );
		contenedor.add( resultadoEtiqueta );

		// crear resultadoCampo, hacerlo no editable
		// y adjuntarlo al panel de contenido
		resultadoCampo = new JTextField( 15 );
		resultadoCampo.setEditable( false );
		contenedor.add( resultadoCampo );

	} // fin del método init

	// obtener entrada del usuario y llamar al método fibonacci
	public void actionPerformed( ActionEvent event )
	{
		long numero, valorFibonacci;

		// obtener entrada del usuario y convertirla en long
		numero = Long.parseLong( numeroCampo.getText() );

		showStatus( "Calculando..." );

		// calcular valor de fibonacci para el número introducido por el usuario
		valorFibonacci = fibonacci( numero );

		// indicar que el procesamiento se completó y mostrar el resultado
		showStatus( "Listo." );
		resultadoCampo.setText( Long.toString( valorFibonacci ) );

	} // fin del método actionPerformed

	// declaración recursiva del método fibonacci
	public long fibonacci( long n )
	{
		// caso base
		if ( n == 0 || n == 1 ) {
			return n;
		} else { // paso recursivo
			return fibonacci( n - 1 ) + fibonacci( n - 2 );
		}

	} // fin del método fibonacci
	
} // fin de la clase PruebaFibonacci

// <applet code="PruebaFibonacci" height="100" width="400"></applet>