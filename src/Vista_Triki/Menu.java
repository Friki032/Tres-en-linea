package Vista_Triki;

import javax.swing.JFrame;

/**
 *
 * @author Saday G
 */
public class Menu extends JFrame{

    public Menu(){
    super("Menu principal triki");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);//Asignar un diseño libre
        crearGUI();
        
        setVisible(true);
         
    
    }
    
    private void crearGUI() {
     
    }
      public static void main(String[] args) {
        Menu m = new Menu();
    }
    
}
