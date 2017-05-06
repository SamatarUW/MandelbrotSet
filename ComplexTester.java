
package Mandelbrot.set;
import java.awt.Color;
import java.math.*;
import java.awt.*; //needed for graphics
import javax.swing.*; //needed for graphics
import static javax.swing.JFrame.EXIT_ON_CLOSE; //needed for graphics

public class ComplexTester extends JFrame{
    int width = 1000;
    int height = 1000;

    double amax = 2;
    double amin = -2;
    double bmax = 2;
    double bmin = -2;
    double x, y;

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, 1000, 1000);
        for (double a = amin; a <= amax; a += 0.0048) {

            for (double b = bmin; b <= bmax; b += 0.0038) {
                Complex z = new Complex(a, b);
                Complex c = new Complex(-0.8,0.156);
                int count = 0;

                while (z.absoluteVal() < 2 && count < 210) {
                    z = z.power(2).add(c);
                    count++;
                    x = (a - amin) * width / (amax - amin);
                    y = (bmax - b) * width / (bmax - bmin);

                    if (count == 210) {
                        g.drawLine((int) x, (int) y, (int) x + 1, (int) y);
                        g.setColor(new Color(0,0,0));
                    }
                    if (count >=180) {
                        g.drawLine((int) x, (int) y, (int) x + 1, (int) y);
                        g.setColor(new Color(count/2,count,count/4));
                    }
                    if (count >= 150) {
                        g.drawLine((int) x, (int) y, (int) x + 1, (int) y);
                        g.setColor(new Color(count/2,count,count/4));
                    }   
                    if (count >= 130) {
                        g.drawLine((int) x, (int) y, (int) x + 1, (int) y);
                        g.setColor(new Color(count/2,count,count/4));
                    }
                    if (count >= 100) {
                        g.drawLine((int) x, (int) y, (int) x + 1, (int) y);
                        g.setColor(new Color(count/2,count,count/4));
                    }
                    if (count >= 80) {
                        g.drawLine((int) x, (int) y, (int) x + 1, (int) y);
                        g.setColor(new Color(count/2,count,count/4));
                    }  
                    if (count >= 60) {
                        g.drawLine((int) x, (int) y, (int) x + 1, (int) y);
                        g.setColor(new Color(count/2,count,count/4));
                    }
                    if (count >= 30) {
                        g.drawLine((int) x, (int) y, (int) x + 1, (int) y);
                        g.setColor(new Color(count/2,count,count/4));
                    }
                    if (count >= 10) {
                        g.drawLine((int) x, (int) y, (int) x + 1, (int) y);
                        g.setColor(new Color(count/2,count,count/4));
                    }
              
                }
            }

        }
    }
        public void initializeWindow() {
        setTitle("Mandelbrot Set");
        setSize(height, width);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.white);
        setVisible(true);
    }

    

    public static void main(String[] args) {
        
//        Complex t = new Complex(2,3);
//        Complex y = new Complex(0,1);
//        
//        t.display();
//        System.out.println("");
//        
//        Complex ans = t.multiplyScalar(2);
//        ans.display();
//        System.out.println("");
//        
//        Complex sum = t.add(y);
//        sum.display();
//        
//        Complex dif = t.subtract(y);
//        dif.display();
//        
//        double length = t.absoluteVal();
//        System.out.println("The length of t is " + length);
//        
//        Complex an = t.multiply(y);
//        an.display();
//        
//        Complex conj = t.conjugate();
//        conj.display();
//        
//        Complex div = t.divide(y);
//        div.display();
//        
//        Complex pow = t.power(3);
//        pow.display();
        
        ComplexTester ct = new ComplexTester();
        ct.initializeWindow();

        
        
    }
}

