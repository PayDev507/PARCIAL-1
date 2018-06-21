/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1p1;

import java.util.Scanner;

/**
 *
 * @author EliteBook 8570w
 */
public class EJERCICIO1P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      
                float tbruto;
                float iva;//el factor sera de 0.21 en constante 
                float tneto;
              
                
                       
                       System.out.println("escribe el precio bruto ");
                       tbruto=leer.nextFloat();
                       iva=(float) (tbruto*0.21);
                       tneto=tbruto+iva;
                       
                       System.out.println("el resultado es  "+tneto);
                       
                       
            
                    
   

    }
    
}
