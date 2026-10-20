/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog02_ejerc9;

/**
 *
 * @author alan
 */
import java.util.Scanner;
public class PROG02_Ejerc9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int ano;
        System.out.println("Introduce un ano: ");
        ano=teclado.nextInt();
        System.out.println((ano%4==0 & (ano%100!=0 | ano%400==0))?"Este ano é bisisesto":"Este ano non é bisiesto");
        /*if (ano%4==0 & (ano%100!=0 | ano%400==0)) {
            System.out.println("Este ano é bisiesto");
        } else { System.out.println("Este ano non e bisiesto");
                } */
    }
    
}
