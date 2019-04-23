package ShapeContenedor;

 import javax.swing.*; 
import java.awt.*; 
 
    public class Shape extends JFrame{ 
        private int base=0;
        private int altura=0;
        private boolean swRectangulo=false;
        private int x=0;
        private int y=0;
        private int longitud=0;
        private boolean swTriangulo=false;
        private int ladoPorLado =0;
        private boolean swCuadrado=false;
        private int xL=0;
        private int yL=0;
        private int x2L=0;
        private int y2L=0;
        private boolean swLinea=false;
        
    	public Shape(int base, int altura){ 
            this.base=base;
            this.altura=altura;
            this.swRectangulo=true;            
        } 
    	
    	public Shape(int x, int y,int longitud){ 
            this.base=x;
            this.altura=y;
            this.longitud=longitud;
            this.swTriangulo=true;
               	 
        } 
    	public Shape(int ladoPorLado){ 
            this.ladoPorLado=ladoPorLado;
            this.swCuadrado=true;
         
        }
    	public Shape(int xL,int yL,int x2L,int y2L){ 
            this.xL=xL;
            this.yL=yL;
            this.x2L=x2L;
            this.y2L=y2L;
            this.swLinea=true;
         
        }
        
        public void paint(Graphics g){ 
        	
            
            if (swRectangulo) {
            g.drawRect(50, 50, this.base, this.altura);
            }
            if (swTriangulo) {
            g.drawPolygon(new int[] {100, 200, 300}, new int[] {100, 50, 100}, 3);
        	}
            if (swCuadrado) {
            g.drawRect(50, 50, this.ladoPorLado, this.ladoPorLado);
            }
            if (swLinea) {
            g.drawLine(this.xL, this.yL, this.x2L, this.y2L);
            }
        } 
    }