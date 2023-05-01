package Vista_Triki;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Tablero extends JFrame{
  int turno = 1;
  JButton uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve;
  JButton Lista[]=new JButton[9];
  public Un_Jugador uj;
  
   private void crearGUI() {
        //tres botones de la primer fila
        uno = new JButton("");
        uno.setBounds(100, 100, 67, 67);
        uno.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               evento_uno();
            }
        });
        add(uno);
        
        dos = new JButton("2");
        dos.setBounds(166, 100, 67, 67);
        dos.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               evento_dos();
            }
        });
        add(dos);
       
        
        tres = new JButton("3");
        tres.setBounds(232, 100, 67, 67);
        tres.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               evento_tres();
            }
        });
        add(tres);

        
        //tres botones segunda fila
        cuatro = new JButton("4");
        cuatro.setBounds(100, 167, 67, 67);
        cuatro.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               evento_cuatro();
            }
        });
        add(cuatro);
        
        cinco = new JButton("5");
        cinco.setBounds(166, 167, 67, 67);
        cinco.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               evento_cinco();
            }
        });
        add(cinco);
        
        seis = new JButton("6");
        seis.setBounds(232, 167, 67, 67);
        seis.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               evento_seis();
            }
        });
        add(seis);
        
        //tres botones de la tercera fila
        siete = new JButton("7");
        siete.setBounds(100, 234, 67, 67);
        siete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               evento_siete();
            }
        });
        add(siete);
        
        ocho = new JButton("8");
        ocho.setBounds(166, 234, 67, 67);
        ocho.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               evento_ocho();
            }
        });
        add(ocho);
        
        nueve = new JButton("9");
        nueve.setBounds(232, 234, 67, 67);
        nueve.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               evento_nueve();
            }
        });
        add(nueve);
      
        
    }

public Tablero(Un_Jugador obj){
        uj = obj;
        //Configuracion del JFrame
        setSize(430,430);// px en ancho y alto
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);//Asignar un diseño libre
        crearGUI();
        
        setVisible(true);
    Lista[0]=(JButton) add(uno);
    Lista[1]=(JButton) add(dos);
    Lista[2]=(JButton) add(tres);
    Lista[3]=(JButton) add(cuatro);
    Lista[4]=(JButton) add(cinco);
    Lista[5]=(JButton) add(seis);
    Lista[6]=(JButton) add(siete);
    Lista[7]=(JButton) add(ocho);
    Lista[8]=(JButton) add(nueve);
    Computadora();

}

    public void Ganador(){
    Analisis(uno,dos,tres);
    Analisis(cuatro,cinco,seis);
    Analisis(siete,ocho,nueve);
    Analisis(uno,cuatro,siete);
    Analisis(dos,cinco,ocho);
    Analisis(tres,seis,nueve);
    Analisis(uno,cinco,nueve);
    Analisis(tres,cinco,siete);    
    }
    public void Analisis(JButton B1,JButton B2,JButton B3){
        if("X".equals(B1.getText())&& "X".equals(B2.getText())&& "X".equals(B3.getText())){
        JOptionPane.showMessageDialog(null,"Gano La Maquina");
        JugarNuevamente();
        }else if ("O".equals(B1.getText())&& "O".equals(B2.getText())&& "O".equals(B3.getText())){
        JOptionPane.showMessageDialog(null,"Gano El Jugador");
        JugarNuevamente();
        }
    }
public void Computadora(){
    if(turno == 1){
        cpu(uno,dos,tres);
    }
     if(turno == 1){
        cpu(cuatro,cinco,seis);
    }
      if(turno == 1){
        cpu(siete,ocho,nueve);
    }
       if(turno == 1){
        cpu(uno,cuatro,siete);
    }
        if(turno == 1){
        cpu(dos,cinco,ocho);
    }
     if(turno == 1){
        cpu(tres,seis,nueve);
    }
      if(turno == 1){
        cpu(uno,cinco,nueve);
    }
       if(turno == 1){
        cpu(tres,cinco,siete);
    }
    if (turno== 1){
        Random rand = new Random();
         int AI;
         boolean A = true;
         
         do{
             AI=(int)(rand.nextDouble()*9+1);
             
             if("".equals(Lista[AI - 1].getText())){
                 Lista[AI - 1].setText("X");
                 A=false;
             }
         
         tablas();
         }while(A);
             }
Ganador();
}
    private void cpu(JButton uno, JButton dos, JButton tres) {
     if("O".equals(uno.getText())&& "O".equals(dos.getText())&& "".equals(tres.getText())){
       tres.setText("X");
       turno = 2;
}else if ("O".equals(uno.getText())&& "".equals(dos.getText())&& "O".equals(tres.getText())){
    dos.setText("X");
       turno = 2;

}else if ("".equals(uno.getText())&& "O".equals(dos.getText())&& "O".equals(tres.getText())){
    uno.setText("X");
       turno = 2;

}

 if("X".equals(uno.getText())&& "X".equals(dos.getText())&& "".equals(tres.getText())){
       tres.setText("O");
       turno = 2;
}else if ("X".equals(uno.getText())&& "".equals(dos.getText())&& "X".equals(tres.getText())){
    dos.setText("O");
       turno = 2;

}else if ("".equals(uno.getText())&& "X".equals(dos.getText())&& "X".equals(tres.getText())){
    uno.setText("O");
       turno = 2;

}
    }
    public void tablas(){
    String boton=uno.getText();
    String boton2=dos.getText();
    String boton3=tres.getText();
    String boton4=cuatro.getText();
    String boton5=cinco.getText();
    String boton6=seis.getText();
    String boton7=siete.getText();
    String boton8=ocho.getText();
    String boton9=nueve.getText();
    
    if(!"".equals(boton)&& !"".equals(boton2)&& !"".equals(boton3) && !"".equals(boton4)
       && !"".equals(boton5)&& !"".equals(boton6)&& !"".equals(boton7)&& !"".equals(boton8)    
          && !"".equals(boton9)  ){
     JOptionPane.showMessageDialog(null,"Iniciar juego");
     JugarNuevamente();
    }
    }

    public void JugarNuevamente() {
        uno.setText("");
        dos.setText("");
        tres.setText("");
        cuatro.setText("");
        cinco.setText("");
        seis.setText("");
        siete.setText("");
        ocho.setText("");
        nueve.setText("");
    }
   private void evento_uno(){
    if("".equals(uno.getText())){
        uno.setText("O");
        turno = 1;
        Computadora();
    }
   }
   private void evento_dos(){
    if("".equals(dos.getText())){
        dos.setText("O");
        turno = 1;
        Computadora();
    }
   }
   private void evento_tres(){
    if("".equals(tres.getText())){
        tres.setText("O");
        turno = 1;
        Computadora();
    }
   }
   private void evento_cuatro(){
    if("".equals(cuatro.getText())){
        cuatro.setText("O");
        turno = 1;
        Computadora();
    }
   }
   private void evento_cinco(){
    if("".equals(cinco.getText())){
        cinco.setText("O");
        turno = 1;
        Computadora();
    }
   }
   private void evento_seis(){
    if("".equals(seis.getText())){
        seis.setText("O");
        turno = 1;
        Computadora();
    }
   }
   private void evento_siete(){
    if("".equals(siete.getText())){
        siete.setText("O");
        turno = 1;
        Computadora();
    }
   }
   private void evento_ocho(){
    if("".equals(ocho.getText())){
        ocho.setText("O");
        turno = 1;
        Computadora();
    }
   }
   private void evento_nueve(){
    if("".equals(nueve.getText())){
        nueve.setText("O");
        turno = 1;
        Computadora();
    }
   }
}

    
    
    






    



