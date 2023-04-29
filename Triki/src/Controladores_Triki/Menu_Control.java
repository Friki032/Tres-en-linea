
package Controladores_Triki;

import Vista_Triki.Menu;
import Vista_Triki.Un_Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Saday G
 */
public class Menu_Control implements ActionListener{
     Menu m;
    
    public Menu_Control(Menu obj){
        m = obj;
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(m.jbUnjugador)) {
             Un_Jugador uj = new Un_Jugador(m);
             m.setVisible(false);//Ocultar menu principal
            }
        }
                  
    }

