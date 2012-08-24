// Fig. 6.3: CuadradoEnteros.java
// Crear y utilizar un método definido por el programador.
import java.awt.Container;

import javax.swing.*;

public class CuadradoEnteros extends JApplet {

	// configurar GUI y calcular los cuadrados de los enteros del 1 al 10
	public void init()
	{
		// objeto JTextArea para mostrar resultados
		JTextArea areaSalida = new JTextArea();

		// obtener panel de contenido del applets (área visible del componente de la GUI)
		Container contenedor = getContentPane();

		// adjuntar areaSalida al contenedor
		contenedor.add( areaSalida );

		int resultado; // guardar el resultado de la llamada al método cuadrado
		String salida = ""; // Objeto String que contiene los resultados

		// iterar 10 veces
		for ( int contador = 1; contador <= 10; contador++ ) {
			resultado = cuadrado( contador ); // llamada al método

			// anexar resultado al objeto String salida
			salida += "el cuadrado de " + contador + " es " + resultado + "\n";
			
		} // fin de instrucción for

		areaSalida.setText( salida ); // colocar resultados en el objeto JTextArea

	} // fin del método init

	// declaración del método cuadrado
	public int cuadrado( int y )
	{
		return y * y; // devolver cuadrado de y

	} // fin del método cuadrado
	
} // fin de la clase CuadradoEnteros

// <applet code="CuadradoEnteros.class" height="300" width="250"></applet>