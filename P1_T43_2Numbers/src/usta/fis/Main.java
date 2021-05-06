package usta.fis;

import java.util.Scanner;

/*
 AUTHOR: Cristhian Arley Susano Fernández
 DATE: 2021-March-28
 *DESCRIPTION: This software calculate the price of transport a package using the heavy and the destination of him
 */
public class Main {

    public static void main(String[] args) {
        Double valor_1;
        Double valor_2;
        int v_operacion = 0;
        Scanner obj_keyboard = new Scanner(System.in);
        p_show_info_program();
        do {
            System.out.println("Que operacion desea realizar");
            System.out.println("1 = Sumar");
            System.out.println("2 = Restar");
            System.out.println("3 = Multiplicar");
            System.out.println("4 = Dividir");
            System.out.println("5 = Numeros primos para X numeros");
            System.out.println("6 = comprobar si es primo");
            System.out.println("0 = Salir");
            v_operacion = obj_keyboard.nextInt();
            while (v_operacion < 0 || v_operacion > 6) {//revisa que la opcion sea 0-6
                System.err.println("Los valores de la operacion deben ser de 0 a 6");
                System.out.println("Que operacion desea realizar");
                System.out.println("1 = Sumar");
                System.out.println("2 = Restar");
                System.out.println("3 = Multiplicar");
                System.out.println("4 = Dividir");
                System.out.println("5 = Numeros primos anteriores a un numero");
                System.out.println("6 = comprobar si es primo");
                System.out.println("0 = Salir");
                v_operacion = obj_keyboard.nextInt();
            }
           if (v_operacion != 0 && v_operacion != 5 && v_operacion != 6) {//hace la excepcion del 0, 5 y 6
                System.out.println("Ingrese el primer numero");
                valor_1 = obj_keyboard.nextDouble();
                System.out.println("Ingrese el segundo numero");
                valor_2 = obj_keyboard.nextDouble();
                System.out.println("El resultado es " + p_operation(valor_1, valor_2, v_operacion));
            }
            if (v_operacion == 5)
            {p_numeros_primos(obj_keyboard);}
            if (v_operacion == 6) {
                System.out.println("Ingrese el numero que quieres saber si es primo");
                int v_prime;
                v_prime = obj_keyboard.nextInt();
                {
                    System.out.println(p_validar_primo(v_prime));
                }
            }

        } while (v_operacion != 0);
    }

    public static void p_show_info_program() {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║-------------- Soft 2 Numbers   VERSION 1.0---------------║");
        System.out.println("║---------MAKER: Cristhian Arley Susano Fernández----------║");
        System.out.println("║---DESCR: This software recieve 2 values and ask if you---║");
        System.out.println("║-want to do a sum,rest,multiplicate, divide, prime number-║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }

    public static String p_operation(Double valor_1, Double valor_2, int v_operacion) {
        switch (v_operacion) {
            case 1:
                return valor_1 + valor_2 + "";
            case 2:
                return valor_1 - valor_2 + "";
            case 3:
                return valor_1 * valor_2 + "";
            case 4:
                while (valor_2 == 0) {
                    System.err.println("En la division los valores del segundo numero no pueden ser 0");
                    System.out.println("Ingrese el segundo numero");
                    Scanner obj_keyboard = new Scanner(System.in);
                    valor_2 = obj_keyboard.nextDouble();
                }
                return valor_1 / valor_2 + "";
            case 5:
        }
        return 0 + "";
    }

    public static void p_numeros_primos(Scanner obj_keyboard) {
        {
            int limite;
            System.out.println("Ingrese un numero");
            limite = obj_keyboard.nextInt(); //limite x
            System.out.println("1");
            for (int i = 1; i <= limite; i++) {//va de uno en uno contando divisores
                int count = 0; //cuenta cuantos divisores tiene el numero
                for (int j = 1; j <= i; j++) {//divide el numero en cuestion entre numeros anteriores 123simismo
                    if (i % j == 0) {//si la division da 0 se suma 1 a la cantidad de divisores.
                        count++;
                    }
                }
                if (count == 2) {//si la cantidad de divisores es 2 esprimo
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean p_validar_primo(int v_prime) {
        int number_divide = 0;
        for (int i = 1; i <= v_prime; i++) {
            if (v_prime % i == 0) {
                number_divide++;
            }
        }
        if (number_divide != 2) {
            return false;
        } else return true;
    }
}