package ShapeContenedor;
import java.awt.*;

import javax.swing.JFrame;
public class Triangulo extends Shape { 
    
	public Triangulo(int x, int y, int altura) { 
        super(x, y,altura); 
        setSize(640,480); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
        setVisible(true);
    }
}