/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog02_ejerc5;

/**
 *
 * @author alan
 */
import java.util.Scanner;
public class PROG02_Ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int segundos;
        Scanner teclado =new Scanner(System.in);
        System.out.println("Introduce nº de segundos: ");
        segundos=teclado.nextInt();
        System.out.println((segundos/86400)+" dias, "+((segundos%86400)/3600)+ " horas,"+((segundos%3600)/60)+ " minutos, "+ ((segundos%3600)%60)+" segundos.");
    }
    
}
