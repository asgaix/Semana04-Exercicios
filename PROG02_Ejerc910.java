/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog02_ejerc910;

/**
 *
 * @author alan
 */
public class PROG02_Ejerc910 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float x=4.5f, y=3f;
        int j, i=2, z;
        double dx=2, dz;
        byte bx=5, by=2, bz;
        short sx=5, sy=2, sz;
        char cx='\u000F', cy='\u0001';
        j=(int)(i*x);
        dz=dx*y;
        bz=(byte)(bx-by);           //duda, si non especifico que é byte, da error (marca bz é int)
        bx=-128;
        by=1;
       // bz=(byte)(bx-by)         //No es posible que un byte tome valor -129
       z=(bx-by);
       sz=(short)(sx-sy);
       sx=32767;
       sy=1;
       //sz=(sx-sy)                 //o mismo, excede rango
       z=(cx-cy);                   //esta forzando el propio programa el tipo?
       sx=(short)cx;
       sx=-32768;
       cx=(char)sx;
       z=cx;
        System.out.println(z);
    }
    
}
