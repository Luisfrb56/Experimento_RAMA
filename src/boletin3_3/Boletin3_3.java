
package boletin3_3;

import java.util.Scanner;

public class Boletin3_3 {

    public static void main(String[] args) {
        Circulo numero1=new Circulo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el radio: ");
        double radio=sc.nextDouble();
        Circulo numero2 =new Circulo(radio); 
        numero2.calcularArea();
        numero2.calcularLonxiturde();
        System.out.println(numero2.calcularArea());
        System.out.println(numero2.calcularLonxiturde());
        //commit
    }
    
}
