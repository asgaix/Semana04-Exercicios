/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog02_ejerc4;

/**
 *
 * @author alan
 */
import java.util.Scanner;
public class PROG02_Ejerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte idade;
        Scanner teclado= new Scanner(System.in);
        System.out.print("Que idade ten o usuario? ");
        idade = teclado.nextByte();
        System.out.println("\n"+(idade>17?"Usuario é maior de idade":"Usuario non é maior de idade"));
    }
    
}
