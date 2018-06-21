
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christopher-van
 */
public class EJERCICIO4P1 {
    public static void main(String[] args) {
       Scanner n=new Scanner(System.in);
       int num,suma,elementos,max = 0,min = 0;
       
       
       float media;//La media puede tener decimales, es por eso que se utiliza el float.
       
       //num- esta variable guardara los numeros introducidos por el usuario.
       //suma-sumara los numeros introducidos Almacenara la suma de todos los numeros introducidos.
       //elementos-contara lso numeros introducidos.
       
       System.out.println("Introduzca un numero: ");
       num=n.nextInt();
       
       suma=0;
       elementos=0;
       
       while(num>=0){
           
           suma+=num;
           elementos++;
           
           System.out.println("Introduzca otro numero: ");
           num=n.nextInt();
           
     if (min != 0 && max != 0) {//Rutina para determinar el numero maximo y el numero minimo en dentro del arreglo 
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            } else {
                min = num;
                max = num;
            }
        }
       
       if(elementos==0){
           
           System.out.println("Imposible hacer la media");
           
       }
       else{
           media=(float)suma/elementos;
           System.out.println("La media es de: "+media);//imprimimos la media
           System.out.println("el valor minimo es"+min);//imprimimos el valor minimo
           System.out.println("El valir maximo es"+max);//imprimimos el valor maximo
           System.out.println("La suma de los valores positivos es"+suma);//imprimimos la suma de todos los valores introducidos
           System.out.println("El total de numeros introducidos es "+elementos);//imprimimos el total de valores introducidos dentro del array
           
        
           
       
           
    
              

      		
	}
       }
    
    
}
