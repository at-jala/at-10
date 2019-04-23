package ShapeContenedor;
import java.awt.*;

import javax.swing.JFrame;
public class Linea extends Shape { 
    
	public Linea(int xL,int yL,int x2L,int y2L) { 
        super(xL,yL,x2L,y2L); 
        setSize(640,480); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
        setVisible(true);
    }
}