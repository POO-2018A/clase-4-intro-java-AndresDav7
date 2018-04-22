package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
   
    public static void main(String[] args) {
        
        Scanner scan =  new Scanner(System.in);
        
        System.out.println("Ingrese su edad = ");
        int edad = scan.nextInt();
        
        while(edad < 0){
            System.out.println("Ingrese edad valida = ");
            edad = scan.nextInt();
        }
        
        if(edad>=18){
            System.out.println("Es mayor de edad y tiene "+ edad +" años");
        }else{
            System.out.println("No es mayor de edad y tiene "+ edad +" años");
        }
    }
    
}
