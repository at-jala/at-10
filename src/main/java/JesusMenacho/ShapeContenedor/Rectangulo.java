package ShapeContenedor;
import java.awt.*;

import javax.swing.JFrame;
public class Rectangulo extends Shape { 
    
	public Rectangulo(int base, int altura) { 
        super(base, altura); 
        setSize(640,480); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
        setVisible(true);
    }
}