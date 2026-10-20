/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog02_ejerc8;

/**
 *
 * @author alan
 */
import java.util.Scanner;
public class PROG02_Ejerc8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float matriculasProgramacion, matriculasEntornos, matriculasBaseDatos, alumnosTotal;
        System.out.println("Introduce alumnos matriculados en programación: ");
        matriculasProgramacion=teclado.nextFloat();
        System.out.println("Introduce alumnos matriculados en entornos: ");
        matriculasEntornos=teclado.nextFloat();
        System.out.println("Introduce alumnos matriculados en base de datos: ");
        matriculasBaseDatos=teclado.nextFloat();
        alumnosTotal= matriculasBaseDatos+matriculasEntornos+matriculasProgramacion;
        System.out.printf("Porcentaxe de alumnos inscritos en programacion:  %.2f %%\n", ((matriculasProgramacion/alumnosTotal)*100));
        System.out.printf("Porcentaxe de alumnos inscritos en entornos:   %.2f %%\n", ((matriculasEntornos/alumnosTotal)*100));
        System.out.printf("Porcentaxe de alumnos inscritos en base de datos:  %.2f %%\n", ((matriculasBaseDatos/alumnosTotal)*100));

        
    }
    
}
