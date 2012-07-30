// Fig. 5.19: OperadoresLogicos.java
// Operadores lógicos.
import javax.swing.*;

public class OperadoresLogicos {

	public static void main( String args[] )
	{

		// crear JTextArea para mostrar los resutados
		JTextArea areaSalida = new JTextArea( 17, 20 );

		// adjuntar JTextArea a un JScrollPane, para desplazarse por los resultados
		JScrollPane desplazador = new JScrollPane( areaSalida );

		// crear la tabla de verdad para el operador && (AND condicional)
		String salida = "AND condicional (&&)" +
			"\nfalse && false: " + (false && false) +
			"\nfalse && true: " + (false && true) +
			"\ntrue && false: " + (true && false) +
			"\ntrue && true: " + (true && true);

		// crear la tabla de verdad para el operador || (OR condicional)
		salida += "\n\nOR condicional (||)" +
			"\nfalse || false: " + (false || false) +
			"\nfalse || true: " + (false || true) +
			"\ntrue || false: " + (true || false) +
			"\ntrue || true: " + (true || true);

		// crear la tabla de verdad para el operador & (AND lógico booleano)
		salida += "\n\nAND l\u00F3gico booleano (&)" +
			"\nfalse & false: " + (false & false) +
			"\nfalse & true: " + (false & true) +
			"\ntrue & false: " + (true & false) +
			"\ntrue & true: " + (true & true);

		// crear la tabla de verdad para el operador | (OR inclusivo lógico booleano)
		salida += "\n\nOR incluyente l\u00F3gico booleano (|)"+
			"\nfalse | false: " + (false | false) +
			"\nfalse | true: " + (false | true) +
			"\ntrue | false: " + (true | false) +
			"\ntrue | true: " + (true | true);

		// crear la tabla de verdad para el operador ^ (OR excluyente lógico booleano)
		salida += "\n\nOR excluyente l\u00F3gico booleano (^)" +
			"\nfalse ^ false: " + (false ^ false) +
			"\nfalse ^ true: " + (false ^ true) +
			"\ntrue ^ false: " + (true ^ false) +
			"\ntrue ^ true: " + (true ^ true);

		// crear la tabla de verdad para el operador ! (negación lógica)
		salida += "\n\nNOT l\u00F3gico (!)" +
			"\n!false: " + (!false) +
			"\n!true: " + (!true);

		areaSalida.setText( salida ); // colocar los resultados en el objeto JTextArea
		JOptionPane.showMessageDialog( null, desplazador,
			"Tablas de verdad", JOptionPane.INFORMATION_MESSAGE );

		System.exit( 0 ); // terminar la aplicación

	} // fin del método main
	
} // fin de la clase OperadoresLogicos
