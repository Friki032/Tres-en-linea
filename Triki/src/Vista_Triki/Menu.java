package Vista_Triki;

import Controladores_Triki.Menu_Control;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Saday G
 */
public class Menu extends JFrame{
    public JButton jbUnjugador,jbMultijugador;
    public JLabel jlTitulo;
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
        //Titulo del Juego
        jlTitulo = new JLabel("<html><center>3 EN LINEA <br>");//Metodo Jlabel
        jlTitulo.setBounds(0,0, 390 , 40);
        jlTitulo.setOpaque(true);//Volver opaco el fondo para cambiar el color
        jlTitulo.setBackground(Color.ORANGE);//Color de fondo
        jlTitulo.setForeground(Color.WHITE);//Color de la letra
        jlTitulo.setFont(new Font("Algerian", Font.BOLD|Font.ITALIC,15));//Tipo de letra (TIPO, NEGRILLA, CURSIVA)
        jlTitulo.setHorizontalAlignment(JLabel.CENTER); //Centrar los textos
        add(jlTitulo);//Muestra lo de arriba
        
        //------------------------------------------------------
        
        jbUnjugador = new JButton("Un jugador");
        jbUnjugador.setBounds(90, 90,200,30);
        Menu_Control m = new Menu_Control(this);
        jbUnjugador.addActionListener(m);
        add(jbUnjugador);
        
    }
      public static void main(String[] args) {
        Menu M = new Menu();
    }
    
}
