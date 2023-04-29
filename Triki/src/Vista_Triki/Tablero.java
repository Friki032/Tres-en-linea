package Vista_Triki;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author Saday G
 */
public class Tablero extends JFrame{
    
    public JButton uno, dos, tres, cuatro, sinco, seis, siete, ocho, nueve;
    public Un_Jugador uj;
    
    public Tablero(Un_Jugador obj){
        uj = obj;
        //Configuracion del JFrame
        setSize(430,430);// px en ancho y alto
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);//Asignar un diseño libre
        crearGUI();
        
        setVisible(true);
        
        
        
        
    
    }

    private void crearGUI() {
        //tres botones de la primer fila
        uno = new JButton("1");
        uno.setBounds(100, 100, 67, 67);
        add(uno);
        
        dos = new JButton("2");
        dos.setBounds(166, 100, 67, 67);
        add(dos);
        
        tres = new JButton("3");
        tres.setBounds(232, 100, 67, 67);
        add(tres);
        
        //tres botones segunda fila
        cuatro = new JButton("4");
        cuatro.setBounds(100, 167, 67, 67);
        add(cuatro);
        
        sinco = new JButton("5");
        sinco.setBounds(166, 167, 67, 67);
        add(sinco);
        
        seis = new JButton("6");
        seis.setBounds(232, 167, 67, 67);
        add(seis);
        
        //tres botones de la tercera fila
        siete = new JButton("7");
        siete.setBounds(100, 234, 67, 67);
        add(siete);
        
        ocho = new JButton("8");
        ocho.setBounds(166, 234, 67, 67);
        add(ocho);
        
        nueve = new JButton("9");
        nueve.setBounds(232, 234, 67, 67);
        add(nueve);
      
        
    }

    
}
