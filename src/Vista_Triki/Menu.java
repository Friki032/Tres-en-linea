package Vista_Triki;

import Controladores_Triki.Menu_Control;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Saday G
 */
public class Menu extends JFrame{
    public JButton jbUnjugador,jbMultijugador;

    public Menu(){
    super("Menu principal triki");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);//Asignar un diseño libre
        getContentPane().setBackground(Color.BLUE);
        crearGUI();
        
        setVisible(true);
         
    
    }
    
    private void crearGUI() {
        jbUnjugador = new JButton("Un jugador");
        jbUnjugador.setBounds(90, 50,200,30);
        Menu_Control m = new Menu_Control(this);
        jbUnjugador.addActionListener(m);
        add(jbUnjugador);
        
    }
      public static void main(String[] args) {
        Menu M = new Menu();
    }
    
}
