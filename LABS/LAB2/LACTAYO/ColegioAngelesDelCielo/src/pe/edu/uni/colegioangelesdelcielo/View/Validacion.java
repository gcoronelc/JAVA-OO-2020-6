
package pe.edu.uni.colegioangelesdelcielo.View;

import javax.swing.JTextField;


public class Validacion {
    public static void validarCampo(JTextField tf,String mensaje)
    {
            if(tf.getText().isEmpty())
            {
                tf.requestFocus();
                throw new RuntimeException(mensaje);
            }
    }
    public static void validarSiEsNumero(JTextField tf,String mensaje)
    {
        try
        {
            Integer.parseInt(tf.getText());
            Double.parseDouble(tf.getText());
        }
        catch(Exception e)
        {
            tf.setText("");
            tf.requestFocus();
            throw new RuntimeException(mensaje);
        }
    }
    public static void validarCeros(JTextField tf,String mensaje)
    {
        if(Integer.parseInt(tf.getText())==0)
        {
            tf.setText("");
            tf.requestFocus();
            throw new RuntimeException(mensaje);
        }
    }
}
