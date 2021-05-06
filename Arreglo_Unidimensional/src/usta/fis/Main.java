package usta.fis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Cuantas notas quiere registrar");
        int num_notas = keyboard.nextInt();
        double arreglo [] = new double[num_notas];
        for (int contador=0;contador<num_notas;contador++)
        {
            System.out.println("Ingrese la nota #"+(contador+1));
            arreglo[contador]=keyboard.nextDouble();
            while(arreglo[contador]<0 || arreglo[contador]>5)
            {
                System.err.println("Las notas deben estar en un rango de 0-5");
                arreglo[contador]=keyboard.nextDouble();
            }
        }
        double promedio = promedio(arreglo,num_notas); //llama al metodo acumulado para luego hacer el promedio
        System.out.println("Tu promedio es "+promedio); //muestra el promedio
    }

    public static double promedio (double arreglo[],int num_notas){//hace el acumulado y muestra en pantalla las notas
        double promedio=0;
        System.out.print("Tus notas del primer semestre son ");
        for(int contador_print=0;contador_print<num_notas;contador_print++) {
            System.out.print("Corte #" + (contador_print + 1) + " =[" + arreglo[contador_print] + "] ");
            if (contador_print==0){
                promedio=promedio+arreglo[contador_print]*0.1;
            }
            if (contador_print==1){
                promedio=promedio+arreglo[contador_print]*0.3;
            }
            if (contador_print>1 && contador_print<=num_notas){
                    promedio=promedio+arreglo[contador_print]*(0.6/(num_notas-2));
                }
            }
        return promedio;
        }

    }

