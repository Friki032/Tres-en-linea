
package Controladores_Triki;

import Vista_Triki.Tablero;
import Vista_Triki.Un_Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Saday G
 */
public class Un_Jugador_Control implements ActionListener{
    
    Un_Jugador uj;
   
    
    public Un_Jugador_Control(Un_Jugador obj){
        uj = obj;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource().equals(uj.jbVolver)) {
        uj.setVisible(false);
        uj.dispose();
        uj.m.setVisible(true);
        }
        if (e.getSource().equals(uj.jbBorrar)) {
        uj.jtApodo.setText("");
        uj.jtApodo.requestFocus();
        }
       if (e.getSource().equals(uj.jbContinuar)) {
        Tablero t = new Tablero(uj);
        uj.setVisible(false);//Ocultar menu principal
        }
        
    
    }
}
