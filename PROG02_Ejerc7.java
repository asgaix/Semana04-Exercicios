/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog02_ejerc7;

/**
 *
 * @author alan
 */
import java.util.Scanner;
public class PROG02_Ejerc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float CONSTANTE1=0,CONSTANTE2=0;
        while (CONSTANTE1==0) {
            System.out.println("Dada a expresion C1x +C2=0\nIntroduce valor para C1 y para C2 separados por espacio");
            CONSTANTE1=teclado.nextFloat();
            CONSTANTE2=teclado.nextFloat();
            if (CONSTANTE1==0) {
                System.out.println("Error, C1 non pode valer 0");
            }
        }
        System.out.printf("O valor de x equivale a: %.4f\n",((-CONSTANTE2)/CONSTANTE1));
    }
    
}
