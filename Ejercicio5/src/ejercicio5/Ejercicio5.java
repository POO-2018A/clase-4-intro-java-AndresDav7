
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int mes;
        
        do{
        System.out.println("Ingrese valor entre 0 y 12 = ");
        mes = scan.nextInt();
        
        switch(mes){
            case 1:
                System.out.println("El mes "+ mes +" es Enero");
                break;
            case 2:
                System.out.println("El mes "+ mes +" es Febrero");
                break;
            case 3:
                System.out.println("El mes "+ mes +" es Marzo");
                break;
            case 4:
                System.out.println("El mes "+ mes +" es Abril");
                break;
            case 5:
                System.out.println("El mes "+ mes +" es Mayo");
                break;
            case 6:
                System.out.println("El mes "+ mes +" es Junio");
                break;
            case 7:
                System.out.println("El mes "+ mes +" es Julio");
                break;
            case 8:
                System.out.println("El mes "+ mes +" es Agosto");
                break;
            case 9:
                System.out.println("El mes "+ mes +" es Septiembre");
                break;
            case 10:
                System.out.println("El mes "+ mes +" es Octubre");
                break;
            case 11:
                System.out.println("El mes "+ mes +" es Noviembre");
                break;
            case 12:
                System.out.println("El mes "+ mes +" es Diciembre");
                break;
            default :
                System.out.println("El numero esta fuera de rango");
                break;
                }
            }while(mes <0 || mes >12);
        }
    
}
