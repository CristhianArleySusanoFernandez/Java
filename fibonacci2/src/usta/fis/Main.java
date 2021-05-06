package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
int serie;
int i = 1;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite el valor del limite para calcular la serie de fibonacci");
        serie=keyboard.nextInt();
        int[] fibo_array;
        fibo_array=serie_fibonacci(serie);
        System.out.println("la serie fibonacci para el numero "+serie+" es:");
        System.out.print("0, ");
        while (fibo_array[i]>0) {
            System.out.print(fibo_array[i]);
            if (fibo_array[i+1]!= -1)
                System.out.print(", ");
            i++;
        }
    }
    public static int[] serie_fibonacci(int limite){
        int i =1;
        int fibo_array[]=new int[100];
        fibo_array[0]=0;
        fibo_array[1]=1;
        while((fibo_array[i-1]+fibo_array[i]) < limite){
            fibo_array[i+1]=fibo_array[i-1]+fibo_array[i];
            fibo_array[i+2]=-1;
            i++;
        }
        //retorna el arreglo donde se almacenaron los resultados
        return fibo_array;
    }
}
