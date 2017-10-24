
package boletin3_3;


public class Circulo {
    private double radio;
    private final double PI=3.14;
    private double area;
    private double lonxitude;
    public Circulo(){
    
    }
    public Circulo(double r){
        radio=r;
   
    }
        public void setradio(double r){
        radio=r;
        }
        public double getradio(){
            return radio;
        }
        public double calcularArea(){
         return Math.pow(radio, 2)*PI;
        }
        public double calcularLonxiturde(){
            return 2*radio*PI;
        }
        
            
        
}

