
package pe.edu.uni.EduTec.view;

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
    public static double redondear(double n)
    {
        return (double)Math.round(n*100)/100;
    }
}
