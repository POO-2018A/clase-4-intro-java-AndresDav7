
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un numero = ");
        int numero = scan.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("El valor "+numero+" es par");
        }else{
            System.out.println("El valor "+numero+" es impar");
        }
        
    }
    
}
