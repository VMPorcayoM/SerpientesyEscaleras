package serpientesyescaleras;

import java.awt.Button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tablero extends JFrame implements MouseListener{
    private Inicio origen; 
    private Juego j;
    private Button regresar;    
    private String nombre1, nombre2;    
    private JLabel jug1=new JLabel();
    private JLabel jug2=new JLabel(); 
    private int posActualJugador1, posActualJugador2;
//    private int[] escalerasOrigen={2, 4, 10, 19}; 
//    private int[] escalerasDestino={21, 7, 25, 28}; 
//    private int[] serpientesOrigen={26, 16, 18, 20};
//    private int[] serpientesDestino={0, 3, 6, 8};
    
    private ArrayList<Paso> listaPasos=new ArrayList<Paso>();
    
    public Tablero(String modo, int icono1, int icono2) {        
        posActualJugador1=0;
        posActualJugador2=0;
        jug1.setIcon(new ImageIcon("src\\iconostablero\\"+icono1+".png"));       
        jug2.setIcon(new ImageIcon("src\\iconostablero\\"+icono2+".png"));
        jug1.setBounds(0, 544, 45, 45);
        jug2.setBounds(0, 589, 45, 45);        
        this.add(jug1);
        this.add(jug2);        
        regresar=new Button();
        regresar.setBounds(10, 10, 80, 25);
        regresar.setLabel("Inicio");    
        regresar.addMouseListener(this);
        this.add(regresar);
        
        int x=0, y=544;
        Paso p;
        for (int i = 0; i < 30; i++) {
            switch(i){
                case 2:
                    p=new Paso(21);
                    break;
                case 4:
                    p=new Paso(7);
                    break;
                case 10:
                    p=new Paso(25);
                    break;
                case 19:
                    p=new Paso(28);
                    break;
                case 26:
                    p=new Paso(0);
                    break;
                case 16:
                    p=new Paso(3);
                    break;
                case 18:
                    p=new Paso(6);
                    break;
                case 20:
                    p=new Paso(8);
                    break;
                default:
                    p=new Paso(-1);
            }
            
            p.setIcon(new ImageIcon("src\\tablero\\"+i+".png"));            
            p.setBounds(x, y, 136, 136);
            listaPasos.add(p);
            this.add(p);            
            switch (y) {
                case 544:
                    x+=136;
                    break;
                case 408:
                    x-=136;
                    break;
                case 272:
                    x+=136;
                    break;
                case 136:
                    x-=136;
                    break;
                case 0:
                    x+=136;
                    break;
            }
            if(x==-136 && i>4){
                y-=136;  
                x=0;
            }
            if(x==816){
                y-=136; 
                x-=136;
            }            
        }       
        this.setSize(822, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);             
        this.setTitle("Serpientes y Escaleras");           
    }
    public Inicio getOrigen() {
        return origen;
    }
    public void setOrigen(Inicio origen) {
        this.origen = origen;
    }

    public Juego getJ() {
        return j;
    }

    public void setJ(Juego j) {
        this.j = j;
    }
    
    public String getNombre1() {
        return nombre1;
    }

    
    public String getNombre2() {
        return nombre2;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }
    

    public void moverIcono(String jugador, int posiciones){            
        if(jugador.equals(nombre1)){
            j.setLblEscaleraSerpiente("");
            if(posActualJugador1+posiciones >=29){
                jug1.setLocation(listaPasos.get(29).getX(),listaPasos.get(29).getY());
                j.setLblEscaleraSerpiente("Mayor a 30");
                JOptionPane.showMessageDialog(null, "¡El jugador "+nombre1+ " es el ganador!", "¡FELICIDADES!", JOptionPane.INFORMATION_MESSAGE);
                origen.setVisible(true);
                this.dispose(); 
                j.dispose();
                return;
            }
            jug1.setLocation(listaPasos.get(posActualJugador1+posiciones).getX(),listaPasos.get(posActualJugador1+posiciones).getY());            
//            for (int i = 0; i < listaPasos.size(); i++) {
//                if (posActualJugador1+posiciones==escalerasOrigen[i]) {
//                    jug1.setLocation(listaPasos.get(escalerasOrigen[i]).getX(),listaPasos.get(escalerasOrigen[i]).getY());
//                    j.setLblEscaleraSerpiente("Cayó en escalera");
//                    jug1.setLocation(listaPasos.get(escalerasDestino[i]).getX(),listaPasos.get(escalerasDestino[i]).getY());
//                    posActualJugador1=escalerasDestino[i];                    
//                    break;
//                }
//            }
//            for (int i = 0; i < serpientesOrigen.length; i++) {
//                if (posActualJugador1+posiciones==serpientesOrigen[i]) {
//                    jug1.setLocation(listaPasos.get(serpientesOrigen[i]).getX(),listaPasos.get(serpientesOrigen[i]).getY());
//                    posActualJugador1=serpientesDestino[i];
//                    j.setLblEscaleraSerpiente("Cayó en serpiente");
//                    jug1.setLocation(listaPasos.get(serpientesDestino[i]).getX(),listaPasos.get(serpientesDestino[i]).getY());
//                    break;
//                }
//            }
            if(listaPasos.get(posActualJugador1+posiciones).getEscaleraSerpiente()!=-1){
                jug1.setLocation(listaPasos.get(listaPasos.get(posActualJugador1+posiciones).getEscaleraSerpiente()).getX(), listaPasos.get(listaPasos.get(posActualJugador1+posiciones).getEscaleraSerpiente()).getY());            
                if(listaPasos.get(posActualJugador1+posiciones).getEscaleraSerpiente()<posActualJugador1+posiciones){
                    posActualJugador1=listaPasos.get(posActualJugador1+posiciones).getEscaleraSerpiente();
                    j.setLblEscaleraSerpiente("Cayó en serpiente");                    
                }else{
                    posActualJugador1=listaPasos.get(posActualJugador1+posiciones).getEscaleraSerpiente();
                    j.setLblEscaleraSerpiente("Cayó en escalera");                    
                }
            }
            if(j.getLblEscaleraSerpiente().getText().equals(""))
                posActualJugador1+=posiciones;            
        }else {
            j.setLblEscaleraSerpiente("");
            if(posActualJugador2+posiciones >= 29){
                jug2.setLocation(listaPasos.get(29).getX(),listaPasos.get(29).getY()+45);
                j.setLblEscaleraSerpiente("Mayor a 30");
                JOptionPane.showMessageDialog(null, "¡El jugador "+nombre2+ " es el ganador!", "¡FELICIDADES!", JOptionPane.INFORMATION_MESSAGE);
                origen.setVisible(true);
                this.dispose(); 
                j.dispose();
                return;
            }
            jug2.setLocation(listaPasos.get(posActualJugador2+posiciones).getX(),listaPasos.get(posActualJugador2+posiciones).getY()+45);            
//            for (int i = 0; i < escalerasOrigen.length; i++) {
//                if (posActualJugador2+posiciones==escalerasOrigen[i]) {
//                    jug2.setLocation(listaPasos.get(escalerasOrigen[i]).getX(),listaPasos.get(escalerasOrigen[i]).getY()+45);
//                    j.setLblEscaleraSerpiente("Cayó en escalera");
//                    jug2.setLocation(listaPasos.get(escalerasDestino[i]).getX(),listaPasos.get(escalerasDestino[i]).getY()+45);
//                    posActualJugador2=escalerasDestino[i];
//                    break;
//                }
//            }
//            for (int i = 0; i < serpientesOrigen.length; i++) {
//                if (posActualJugador2+posiciones==serpientesOrigen[i]) {
//                    jug2.setLocation(listaPasos.get(serpientesOrigen[i]).getX(),listaPasos.get(serpientesOrigen[i]).getY()+45);
//                    posActualJugador2=serpientesDestino[i];
//                    j.setLblEscaleraSerpiente("Cayó en serpiente");
//                    jug2.setLocation(listaPasos.get(serpientesDestino[i]).getX(),listaPasos.get(serpientesDestino[i]).getY()+45);
//                    break;
//                }
//            }
            if(listaPasos.get(posActualJugador2+posiciones).getEscaleraSerpiente()!=-1){
                jug2.setLocation(listaPasos.get(listaPasos.get(posActualJugador2+posiciones).getEscaleraSerpiente()).getX(), listaPasos.get(listaPasos.get(posActualJugador2+posiciones).getEscaleraSerpiente()).getY()+45);            
                if(listaPasos.get(posActualJugador2+posiciones).getEscaleraSerpiente()<posActualJugador2+posiciones){
                    posActualJugador2=listaPasos.get(posActualJugador2+posiciones).getEscaleraSerpiente();
                    j.setLblEscaleraSerpiente("Cayó en serpiente");                    
                }else{
                    posActualJugador2=listaPasos.get(posActualJugador2+posiciones).getEscaleraSerpiente();
                    j.setLblEscaleraSerpiente("Cayó en escalera");                    
                }
            }
            if(j.getLblEscaleraSerpiente().getText().equals(""))
                posActualJugador2+=posiciones;            
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==regresar){            
            origen.setVisible(true);
            this.dispose(); 
            j.dispose();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {        
    }

    @Override
    public void mouseReleased(MouseEvent e) {        
    }

    @Override
    public void mouseEntered(MouseEvent e) {        
    }

    @Override
    public void mouseExited(MouseEvent e) {        
    }
    
}
