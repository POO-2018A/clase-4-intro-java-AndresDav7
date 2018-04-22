package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
               
        Scanner scan = new Scanner(System.in);
        
        double fahrenheit;
        
        do{
            
            System.out.println("Ingrese valor entre (0 - 100) = ");
            fahrenheit = scan.nextDouble();
            
        }while(fahrenheit < 0 || fahrenheit > 100);
                            
        double celsius = ((fahrenheit-32)*5)/9;
        
        System.out.println("El valor en Celsius es = " + celsius);
       
    }
    
}
