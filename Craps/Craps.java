// Fig. 6.9: Craps.java
// Craps.
import java.awt.*; // Container, FlowLayout
import java.awt.event.*; // ActionEvent, ActionListener

import javax.swing.*; // JApplet, JButton, JLabel, JTextField

public class Craps extends JApplet implements ActionListener {

	// variables constantes para el estado del juego
	final int GANADO = 0, PERDIDOS = 1, CONTINUAR = 2;

	boolean primerTiro = true; // verdadero si es el primer tiro del dado
	int sumaDeDados = 0; // suma de los dados
	int miPunto = 0; // punto si no gana o pierde en el primer tiro
	int estadoJuego = CONTINUAR; // el juego no se acaba todavía

	// componentes de la interfaz gráfica de usuario
	JLabel dado1Etiqueta, dado2Etiqueta, sumaEtiqueta, puntoEtiqueta;
	JTextField dado1Campo, dado2Campo, sumaCampo, puntoCampo;
	JButton tirarBoton;

	// configurar componentes de la GUI
	public void init()
	{
		// obtener panel de contenido y cambiar su esquema a FlowLayout
		Container contenedor = getContentPane();
		contenedor.setLayout( new FlowLayout() );

		// crear etiqueta y campo de texto para el dado1
		dado1Etiqueta = new JLabel( "Dado 1" );
		contenedor.add( dado1Etiqueta );
		dado1Campo = new JTextField( 10 );
		dado1Campo.setEditable( false );
		contenedor.add( dado1Campo );

		// crear etiqueta y campo de texto para el dado 2
		dado2Etiqueta = new JLabel( "Dado 2" );
		contenedor.add( dado2Etiqueta );
		dado2Campo = new JTextField( 10 );
		dado2Campo.setEditable( false );
		contenedor.add( dado2Campo );

		// crear etiqueta y campo de texto para la suma
		sumaEtiqueta = new JLabel( "La suma es" );
		contenedor.add( sumaEtiqueta );
		sumaCampo = new JTextField( 10 );
		sumaCampo.setEditable( false );
		contenedor.add( sumaCampo );

		// crear etiqueta y campo de texto para la punto
		puntoEtiqueta = new JLabel( "Punto" );
		contenedor.add( puntoEtiqueta );
		puntoCampo = new JTextField( 10 );
		puntoCampo.setEditable( false );
		contenedor.add( puntoCampo );

		// crear botón que el usuario oprime para tirar los dados
		tirarBoton = new JButton( "Tirar dados" );
		tirarBoton.addActionListener( this );
		contenedor.add( tirarBoton );

	} // fin del método init

	// procesar un tiro de los dados
	public void actionPerformed( ActionEvent actionEvent )
	{
		sumaDeDados = tirarDados(); // tirar los dados

		// primer tiro de los dados
		if ( primerTiro ) {
			
			switch ( sumaDeDados ) {

				// gana en primer tiro
				case 7:
				case 11:
					estadoJuego = GANADO;
					puntoCampo.setText( "" ); // borrar campo punto
					break;

				// pierde en primer tiro
				case 2:
				case 3:
				case 12:
					estadoJuego = PERDIDOS;
					puntoCampo.setText( "" ); // borrar campo punto
					break;

				// recuerda el punto
				default:
					estadoJuego = CONTINUAR;
					miPunto = sumaDeDados;
					puntoCampo.setText( Integer.toString( miPunto ) );
					primerTiro = false;
					break;

			} // fin de la instrucción switch

		} // fin de la parte if de la instrucción if...else
		else { // tiro subsecuente de los dados

			// determinar estado del juego
			if ( sumaDeDados == miPunto ) { // gana llegando al punto
				estadoJuego = GANADO;
			} else {
				if ( sumaDeDados == 7 ) { // pierde tirando un 7
					estadoJuego = PERDIDOS;
				}
			}

		} // fin de la parte else de la instrucción if...else

		mostrarMensaje(); // mostrar un mensaje indicando el estado del juego

	} // fin del método actionPerformed

	// tirar dados, calcular suma y mostrar resultados
	public int tirarDados()
	{
		// elegir valores aleatorios para los dados
		int dado1 = 1 + ( int ) (  Math.random() * 6 );
		int dado2 = 1 + ( int ) (  Math.random() * 6 );

		int suma = dado1 + dado2; // sumar valores de los dados

		// mostrar resultados en campos de texto
		dado1Campo.setText( Integer.toString( dado1 ) );
		dado2Campo.setText( Integer.toString( dado2 ) );
		sumaCampo.setText( Integer.toString( suma ) );

		return suma; // devolver suma de los dados

	} // fin del método tirarDados

	// determinar estado del juego; mostrar el mensaje apropiado en la barra de estado
	public void mostrarMensaje()
	{
		// el juego debe continuar
		if ( estadoJuego == CONTINUAR ) {
			showStatus( "Tirar de nuevo" );
		} else { // juego ganado o perdido
			if ( estadoJuego == GANADO ) {
				showStatus( "El jugador gana. Haga clic en tirar dados para jugar de nuevo" );
			} else {
				showStatus( "El jugador pierde. Haga clic en tirar dados para jugar de nuevo" );
			}

			primerTiro = true; // el siguiente tiro es el primero de un juego nuevo

		} // fin de la parte else de la instrucción if...else

	} // fin del método mostrarMensaje
	
} // fin de la clase Craps

// <applet code="Craps.class" height="100" width="400"></applet>