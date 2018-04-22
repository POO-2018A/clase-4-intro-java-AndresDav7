
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        boolean estaNevando=false;
        boolean estaLloviendo=false;
        double temperatura=10.0;
        
        if(estaNevando || estaLloviendo || temperatura < 10){
            System.out.println("Nos quedamos en Casa !");
        }else{
            System.out.println("Vamos fuera !");
        }
       
    }
    
}
