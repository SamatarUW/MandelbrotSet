/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mandelbrot.set;

/**
 *
 * @author abuks2039
 */
public class Complex {
    
    double real,imaginary;
  
    public Complex(double a, double b) {
        real = a;
        imaginary = b;        
    }
    
    public double absoluteVal() {        
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary,2));
    }
    
    public void display() {
        String printedComplex = real + " + " + imaginary + "i";
        
        if (real == 0) {
            printedComplex = imaginary + "i";
            System.out.println(printedComplex);
        }
        else if (imaginary ==0) {
            printedComplex = real + "";
            System.out.println(printedComplex);
        }
        else if (imaginary <0) {
            printedComplex = real + " - " + (imaginary*-1) + "i";
            System.out.println(printedComplex);
        }
        else {
            System.out.println(printedComplex);
        }
    }
    
    public Complex add(Complex other) {
        double r1, i1, r2, i2;
        
        r1 = this.real;
        i1 = this.imaginary;
        
        r2 = other.real;
        i2 = other.imaginary;
        
        return new Complex((r1+r2),(i1+i2));       
    }
    
    public Complex subtract(Complex other) {
        double r1, i1, r2, i2;
        
        r1 = this.real;
        i1 = this.imaginary;
        
        r2 = other.real;
        i2 = other.imaginary;
        
        return new Complex((r1-r2),(i1-i2));       
    }
    public Complex multiplyScalar(double s) {
        double r = real*s;
        double i = imaginary*s;
        
        return new Complex(r,i);
    }
    
    public Complex multiply(Complex other) {
        double r1, i1, r2, i2;       
        r1 = this.real;
        i1 = this.imaginary;
        
        r2 = other.real;
        i2 = other.imaginary;
        
        double rtotal = (r1*r2) + (i1*i2*-1);
        double itotal = (r1*i2)+(r2*i1);
        
        return new Complex(rtotal,itotal);              
    }
    
    public Complex conjugate() {
        return new Complex(real,-1*imaginary);
    }
    
    public Complex divide( Complex other) {
        double recipAbsOther = 1/Math.pow(other.absoluteVal(),2);
        Complex thisTimesConj = this.multiply(other.conjugate());
        
        return thisTimesConj.multiplyScalar(recipAbsOther);
    }
    
    public Complex power(int p) {
        double theta = Math.atan(imaginary/real);
        return new Complex(Math.pow(this.absoluteVal(),p) * (Math.cos(p*theta)),Math.pow(this.absoluteVal(),p) * (Math.sin(theta*p)));        
    }
    
    
    


}
