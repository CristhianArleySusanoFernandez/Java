package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int limite = 0;
        int numeroanterior=0;
        int numeroactual=1;
        System.out.println("Ingrese la cantidad de numeros de la serie de fibonacci que quiera mostrar");
        limite = keyboard.nextInt();
        int numerosfibonacci[]=new int[limite+1];
        metodofibo(limite,numerosfibonacci,numeroanterior,numeroactual);
    }
    public static void metodofibo (int limite,int numerosfibonacci[],int numeroanterior,int numeroactual){
        numeroanterior=0;
        numeroactual=1;
        System.out.println("0");
        System.out.println("1");
        for (int i = 0; i <= limite-3; i++) {
numerosfibonacci[i]=numeroactual+numeroanterior;
numeroanterior=numeroactual;
numeroactual=numerosfibonacci[i];
System.out.println(numerosfibonacci[i]);
        }
    }
}
