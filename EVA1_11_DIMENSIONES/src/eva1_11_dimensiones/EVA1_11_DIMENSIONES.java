/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_dimensiones;

import static java.time.Clock.system;

/**
 *
 * @author anoni
 */
public class EVA1_11_DIMENSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [][] matriz = new int [3][];
       matriz[0]=new int[5];
         matriz[1]=new int[10];
           matriz[2]=new int[3];
           for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j<matriz.length; j++){
            system.out.println("{" + matriz[i][j]) + "j");}
            
            
            
            }
           System.out.println();dsw 
        }
    }
    
}
