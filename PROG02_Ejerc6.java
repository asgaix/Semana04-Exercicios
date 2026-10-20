/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog02_ejerc6;

/**
 *
 * @author alan
 */
public class PROG02_Ejerc6 {
    public enum RazasPerros {Mastín, Terrier, Bulldog, Pekines, Caniche, Galgo}           

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RazasPerros var1=RazasPerros.Mastín, var2=RazasPerros.Galgo;
        System.out.println(var1==var2?"Son da mesma raza":"Son de distinta raza");
        System.out.println(var1+" esta no enum na posicion: "+var1.ordinal()+", e este conten a cantidade de: "+(var1.toString().length())+" caracteres");
        System.out.printf("%s esta no enum na posicion %d, e este conten a cantidade de: %d caracteres\n", var2, var2.ordinal(),var2.toString().length());
    }
    
}
