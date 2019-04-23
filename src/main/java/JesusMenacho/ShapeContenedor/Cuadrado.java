package ShapeContenedor;
import java.awt.*;

import javax.swing.JFrame;
public class Cuadrado extends Shape { 
    
	public Cuadrado(int ladoPorLado) { 
        super(ladoPorLado); 
        setSize(640,480); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
        setVisible(true);
    }
}