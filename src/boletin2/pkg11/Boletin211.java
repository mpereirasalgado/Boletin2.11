
package boletin2.pkg11;

import java.util.Scanner;

/**@author Micael*/
public class Boletin211 
{
    public static void main(String[] args) 
    {
        float soldo, ventas, kilometros, dias;
        System.out.println("sueldo fijo: ");
        Scanner dato = new Scanner(System.in);
        soldo=dato.nextFloat();
        System.out.println("ventas realizadas: ");
        ventas=dato.nextFloat();
        System.out.println("Kilometros realizados: ");
        kilometros=dato.nextFloat();
        System.out.println("dias trabajados: ");
        dias=dato.nextFloat();
        System.out.println("sueldo total: "+(soldo+(ventas*0.05)+(kilometros*2)+(dias*30)-36)*0.82+" €");
    }
    
}
