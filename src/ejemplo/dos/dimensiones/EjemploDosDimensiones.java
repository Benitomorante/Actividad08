/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.dos.dimensiones;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class EjemploDosDimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] myArray = new int[4][4];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = SolicitaEntero();
            }
        }
        System.out.println("Números");
       
        for (int i=0; i<myArray.length;i++){
        for (int j=0; j<myArray[i].length; j++){
            System.out.println("["+ myArray[i][j]+"]");
        }
            
        }

    }

    public static int SolicitaEntero() {
        Scanner sc = new Scanner(System.in);
        boolean flag;
        int n = 0;
        do {
            System.out.println("Introduce un numero entero");
            try {
                n = sc.nextInt();
                flag = false;
            } catch (Exception er) {
                System.out.println("Vuelve a intentarlo");
                flag = true;
                sc.next();
            }

        } while (flag);
    return n ;
    } 
   
}
