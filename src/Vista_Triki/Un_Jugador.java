
package Vista_Triki;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Saday G
 */
public class Un_Jugador extends JFrame{
    public JButton jbVolver,jbBorrar,jbContinuar;
    public JTextField jtApodo;
    public Menu m;
    public Un_Jugador(Menu obj){
        super ("Un Jugador");// Creacion del JFrame
        
        m = obj;
        //Configuracion del JFrame
        setSize(500,400);// px en ancho y alto
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);//Asignar un diseño libre
        crearGUI();
        
        setVisible(true);
    
    }

    private void crearGUI() {
      
    }
}
