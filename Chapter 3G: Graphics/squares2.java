/* Modify your Squares program from the previous exercise into a new class Squares2 that draws the following figures. 
(Go back to that problem and copy/paste your code here as a starting point.) 

The drawing panel is now 400 by 300 pixels in size. The first figure is at the same position, (50,50). 
The other figures are at positions (250, 10) and (180, 115), respectively. Use one or more parameterized static methods to reduce the redundancy of your solution.*/


public class Squares2 {
    
        public static void main(String[] args) {
            DrawingPanel panel = new DrawingPanel(400, 300);
            panel.setBackground(Color.CYAN);
            Graphics g = panel.getGraphics();
            drawSquare(g, 50, 50);
            drawSquare(g, 250, 10);
            drawSquare(g, 180, 115);
    
        }
        
     
        public static void drawSquare (Graphics g, int x, int y) {
            g.setColor(Color.RED);
            
            for (int i = 0; i <= 5; i++) {
                g.drawRect(x, y, ((x + 100) - (x + (20 * i))), ((y + 100) - (y + (20 * i))));
            }
            
            g.setColor(Color.BLACK);
            g.drawLine(x, y, x + 100, y + 100);
        }
}