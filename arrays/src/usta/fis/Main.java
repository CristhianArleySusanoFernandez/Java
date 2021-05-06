package usta.fis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double array_or_vector[]=new double[3];
        int counter=0;
        int total=0;
       Scanner obj_keyboard =new Scanner(System.in);
       System.out.println("Ingrese la nota 1");
       double nota1=obj_keyboard.nextDouble();
        System.out.println("Ingrese la nota 2");
        double nota2=obj_keyboard.nextDouble();
        System.out.println("Ingrese la nota 3");
       double nota3=obj_keyboard.nextDouble();
        array_or_vector[0]=nota1;
        array_or_vector[1]=nota2;
        array_or_vector[2]=nota3;
        for (counter = 0; counter < array_or_vector.length; counter++) {
System.out.println("Su calificacion del corte "+(counter+1) + " es "+ array_or_vector[counter]);
        }
   // total=array_or_vector[];
    }
}
