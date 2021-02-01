package serpientesyescaleras;
import javax.swing.JLabel;
public class Paso extends JLabel{
    private int noPaso;
    private int escaleraSerpiente;
    
    public Paso(int escaSerp) {
        setBounds(0,0,136,136);
        escaleraSerpiente=escaSerp;
    }

    public int getNoPaso() {
        return noPaso;
    }

    public void setNoPaso(int noPaso) {
        this.noPaso = noPaso;
    }

    public int getEscaleraSerpiente() {
        return escaleraSerpiente;
    }

    public void setEscaleraSerpiente(int escaleraSerpiente) {
        this.escaleraSerpiente = escaleraSerpiente;
    }
    
}
