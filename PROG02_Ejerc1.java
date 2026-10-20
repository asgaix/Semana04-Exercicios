/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog02_ejerc1;

/**
 *
 * @author alan
 */
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Month;
public class PROG02_Ejerc1 {
    private enum Meses {Xaneiro, Febreiro, Marzo, Abril, Maio, Xuño, Xullo, Agosto, Septembro, Outubro, Novembro, Decembro}
    public enum Sexos {V, M}    
    public static void main(String[] args) {
        
        //Exercicio1
        final short MAXIMO= 5000;
        boolean tenCarneConducir =true;
        Meses mesActual = Meses.Xaneiro;
        String nomeConApelidos="Alan Sardinero Gonzalez";
        Sexos SexoDaPersoa =Sexos.V;
        final LocalDateTime INICIO_CONTEO = LocalDateTime.of(1970, Month.JANUARY, 1, 00, 00, 00, 00);
        LocalDateTime finalConteo = LocalDateTime.now();
        Duration tiempoPasado =Duration.between(INICIO_CONTEO, finalConteo);
        //double miliseg = finalConteo.getYear() * finalConteo.getMonthValue() * finalConteo.getDayOfMonth() * finalConteo.getHour();
        double saldoCuenta = 0.0f;
        final long DISTANCIA_TIERRA_JUPITER = 778000000;
        
        System.out.print("\n\n"+"\033[45m"+"Exercicio 1"+"\033[0m"+"\n");        
        System.out.print("Número máximo= " + MAXIMO);
        System.out.print("\nTiene el usuario carne de conducir=  " + (tenCarneConducir ? "Si": "Non"));
        System.out.printf("\nEstamos no mes: %s", mesActual);
        System.out.print("\nMes número: "+(mesActual.ordinal()+1));
        System.out.printf("\nO nome e apelidos do usuario son: %s", nomeConApelidos);
        System.out.print("\nSexo da persoa é: "+SexoDaPersoa+"\n");
        System.out.print("Tempo transcurrido dende xaneiro do 1970: "+(tiempoPasado.getSeconds()*1000)+" en milisegundos\n");
        System.out.print("\nActualmente ten: "+ saldoCuenta+"€ na caixa de aforros" );
        System.out.print("\nPor iso pensa en mudarse a: "+DISTANCIA_TIERRA_JUPITER+"Km e empezar de novo, haber si amaña\n");
        
        //Exercicio2
        System.out.print("\n\n"+"\033[45m"+"Exercicio 2"+"\033[0m"+"\n");
        System.out.print("2.- Indica si los siguientes identificadores de variables en Java serían válidos. Justifica tu respuesta."
                + "\ndouble = Non valido, palabra en lista reservadas.\n/horaactual = Non valido, o indicador non pode conezar por \"/\""
                + "\n$hora = Non valido, os convennios establecen non usar \"$\" como inicio(ainda que tecnicamente e válido"
                + "\nMiHora = Valido. uso segundo convenio(clases e interfaces)\n_hora = non valido. Non debe comezar por \"_\""
                + "\n5hora = Non valido, os convennios establecen non usar un numero como inicio(ainda que tecnicamente e válido"
                + "\nchar = Non valido, palabra en lista reservadas\n");
        
        //3.- Teniendo en cuenta que var1, var2 y var3 son variables de tipo boolean y están inicializadas a los siguientes valores: var1=true, var2=true 
        //y var3=false y que las variables X, Y y Z son variables enteras con valores: X=5, Y=-8 y Z=10, 
        //indica si las siguientes operaciones se evaluan a true o false.: 
        //var1 || var2 && var3 
        //(var1 || var3) && (var2 && !var1).
        //(var2 || !var1 || !var3) && var1
        //(X > 3 || Y > 3) && Z < -3
        //(X+Z == 15) && (Y != 2).
        boolean var1=true, var2=true, var3=false;
        int X=5,Y=-8, Z=10;
        
        System.out.print("\n\n"+"\033[45m"+"Exercicio 3"+"\033[0m"+"\n");        
        System.out.println(var1 || var2 && var3);               //falso
        System.out.println((var1 || var3) && (var2 && !var1));  //falso
        System.out.println((var2 || !var1 || !var3) && var1);   //true
        System.out.println((X > 3 || Y > 3) && Z < -3.);        //falso
        System.out.println((X+Z == 15) && (Y != 2));           //falso
        
    }
}
