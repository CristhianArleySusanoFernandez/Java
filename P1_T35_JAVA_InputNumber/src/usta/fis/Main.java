package usta.fis;
//Author: Cristhian Arley Susano Fernandez
//Date: 2021-March-16
//Description: This software shows a variable input by keyboard
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("-----------------------");
        System.out.println("SoftInput v1.0");
        System.out.println("Author: Cristhian Arley Susano Fernandez");
        System.out.println("-----------------------");
Scanner  keyboard = new Scanner(System.in);
int v_number1,v_number2,v_sum;
System.out.println("Input the first number");
v_number1=keyboard.nextInt();
        System.out.println("Input the second number");
        v_number2=keyboard.nextInt();
        v_sum=v_number1+v_number2;
        System.out.println("The total sum is:"+v_sum);

    }
}
