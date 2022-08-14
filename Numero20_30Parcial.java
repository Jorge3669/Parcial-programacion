
package numero20_30parcial;

import java.util.Scanner;
/**
 *
 * @author Jorge
 */
 

public class Numero20_30Parcial {
      static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
       int op;
        System.out.print("Ingrese la opción que desea realizar\n");
         System.out.print("Ingrese 1 o 2 para:\n");
        System.out.print("1)Mostrar los números del 20 al 30\n");
        System.out.print("2)No mostrar nada\n");
        op=sc.nextInt();
        opcion(op);
    }
    static void opcion(int x){
        if (x==1){
            System.out.println("Numeros del 20 a 30");
             for(int i=20; i<=30; i++){
            System.out.println(i);
             }
        }
        else{
              System.out.println("No se mostrará nada");
                }
        }
    }




     






