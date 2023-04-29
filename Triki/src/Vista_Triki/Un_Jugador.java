
package Vista_Triki;

import Controladores_Triki.Un_Jugador_Control;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
        setSize(400,300);// px en ancho y alto
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);//Asignar un diseño libre
        crearGUI();
        
        setVisible(true);
        
        
        
        
    
    }

    private void crearGUI() {
        Un_Jugador_Control ujc = new Un_Jugador_Control(this);
        
        JLabel jlApodo = new JLabel("Apodo: ");
        jlApodo.setBounds(50,60,120,30);
        add(jlApodo);
        jtApodo = new JTextField();
        jtApodo.setBounds(100,60, 200,30);
        jtApodo.addActionListener(ujc);
        add(jtApodo);
        
        jbContinuar = new JButton ("Continuar");
        jbContinuar.setBounds(230,190, 140, 20);
        jbContinuar.setMnemonic('C');
        jbContinuar.addActionListener(ujc);
        add(jbContinuar);
        
        jbBorrar = new JButton ("Borrar");
        jbBorrar.setBounds(30,190, 140, 20);
        jbBorrar.setMnemonic('B');
        jbBorrar.addActionListener(ujc);
        add(jbBorrar);
        
       jbVolver = new JButton("Volver al menu");
       jbVolver.setBounds(125 ,230,140,20);
       jbVolver.setMnemonic('V');
       jbVolver.addActionListener(ujc);
       add(jbVolver);
    }
    
    public static void main(String[] args) {
        //setDefaultLookAndFeelDecorated(true); //Cambia el tipo de la ventana

    }
    
    
}
