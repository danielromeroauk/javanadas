// Fig. 6.8: TirarDado.java
// Tirar una lado de seis lados 6000 veces.
import javax.swing.*;

public class TirarDado {

    public static void main( String args[] )
    {
        int frecuencia1 = 0, frecuencia2 = 0, frecuencia3 = 0,
            frecuencia4 = 0, frecuencia5 = 0, frecuencia6 = 0, cara;

        // sintetizar resultados
        for ( int tiro = 1; tiro <= 6000; tiro++ ) {
            cara = 1 + ( int ) ( Math.random() * 6 );

            // determinar el valor de tiro e incrementar el contador apropiado
            switch ( cara ) {

                case 1:
                    ++frecuencia1;
                    break;

                case 2:
                    ++frecuencia2;
                    break;

                case 3:
                    ++frecuencia3;
                    break;

                case 4:
                    ++frecuencia4;
                    break;

                case 5:
                    ++frecuencia5;
                    break;

                case 6:
                    ++frecuencia6;
                    break;

            }// fin de la instrucción switch

        } // fin de la instrucción for

        JTextArea areaSalida = new JTextArea();

        areaSalida.setText( "Cara\tFrecuencia" + "\n1\t" + frecuencia1 +
            "\n2\t" + frecuencia2 + "\n3\t" + frecuencia3 +
            "\n4\t" + frecuencia4 + "\n4\t" + frecuencia4 +
            "\n6\t" + frecuencia6 );

        JOptionPane.showMessageDialog( null, areaSalida,
            "Tirar un dado 6000 veces", JOptionPane.INFORMATION_MESSAGE );

        System.exit( 0 ); // terminar la aplicación

    } // fin del método main

} // fin de TirarDado
