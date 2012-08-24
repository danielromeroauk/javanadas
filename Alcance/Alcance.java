// Fig. 6.10: Alcance.java
// Un ejemplo del alcance.
import java.awt.Container;

import javax.swing.*;

public class Alcance extends JApplet {
	JTextArea areaSalida;

	// campo que es accesible para todos los métodos de esta clase
	int x = 1;

	// crear GUI del applet
	public void init()
	{
		areaSalida = new JTextArea();
		Container contenedor = getContentPane();
		contenedor.add( areaSalida );

	} // fin del método init

	// el método start se llama después de que init termina; start llama a
	// los métodos usarLocal y usarCampo
	public void start()
	{
		int x = 5; // variable local en método start que sombrea el campo x

		areaSalida.append( "x local en start es " + x );

		usarLocal(); // usarLocal tiene x local
		usarCampo(); // useInstance modifica el campo x de Alcance
		usarLocal(); // usarLocal inicializa la variable local x
		usarCampo(); // Campo x de Alcance retiene su valor

		areaSalida.append( "\n\nx local en start es " + x );

	} // fin del método start

	// usarLocal crea e inicializa la variable local x durante cada llamada
	public void usarLocal()
	{
		int x = 25; // se inicializa cada vez que hace una llamada a usarLocal

		areaSalida.append( "\n\nx local en usarLocal es " + x + 
			" después de entrar a usarLocal" );
		++x;
		areaSalida.append( "\nx local en usarLocal es " + x +
			" después de salir de usarLocal" );

	} // fin del método usarLocal

	// usarCampo modifica el campo x de Alcance durante cada llamada
	public void usarCampo()
	{
		areaSalida.append( "\n\nel campo x es " + x +
			" al entrar a usarCampo" );
		x *= 10;
		areaSalida.append( "\nel campo x es " + x +
			" al salir de usarCampo" );

	} // fin del método usarCampo
	
} // fin de la clase Alcance

//<applet code="Alcance.class" height="300" width="400"></applet>