package usta.fis;

import java.util.Scanner;

/*
 AUTHOR: Cristhian Arley Susano Fernández
 DATE: 2021-March-28
 *DESCRIPTION: This software calculate the price of transport a package using the heavy and the destination of him
 */
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        System.out.println("¿Cuantos paquetes va a enviar?");
        Scanner obj_keyboard = new Scanner(System.in);
        int num_paquetes = obj_keyboard.nextInt(); // PIDE CUANTOS PAQUETES
        for (int i=1 ;i<=num_paquetes;i++){
            System.out.println("PAQUETE #"+i);
            System.out.println("Hacia donde se dirige este paquete");
            System.out.println("1 = Norteamérica");
            System.out.println("2 = América central");
            System.out.println("3 = América del sur");
            System.out.println("4 = Europa");
            System.out.println("5 = Asia");
            int v_destino = obj_keyboard.nextInt(); //PIDE DESTINO 1-5
            while (v_destino < 1 || v_destino > 5) {
                System.err.println("Los valores solo pueden ser del 1 al 5");
                System.out.println("PAQUETE #" + num_paquetes);
                System.out.println("Hacia donde se dirige este paquete");
                System.out.println("1 = Norteamérica");
                System.out.println("2 = América central");
                System.out.println("3 = América del sur");
                System.out.println("4 = Europa");
                System.out.println("5 = Asia");
                v_destino = obj_keyboard.nextInt();
            }

            System.out.println("Ingrese el peso del paquete en kilos");
            double v_peso= obj_keyboard.nextDouble(); // PIDE PESO E   // int v_destino_final = p_condicion(num_paquetes,obj_keyboard, v_destino);N KG
            double v_price;
            System.out.println(v_destino+"xd");
            switch (v_destino) {
                case 1 : v_price = 11 * v_peso;
                    System.out.println("El valor del envio es de "+ v_price +" Dolares");
                    break;
                case 2 : v_price = 10 * v_peso;
                    System.out.println("El valor del envio es de "+ v_price +" Dolares");
                    break;
                case 3 : v_price = 12 * v_peso;
                    System.out.println("El valor del envio es de "+ v_price +" Dolares");
                    break;
                case 4 : v_price = 24 * v_peso;
                    System.out.println("El valor del envio es de "+ v_price +" Dolares");
                    break;
                case 5 : v_price = 27 * v_peso;
                    System.out.println("El valor del envio es de "+ v_price +" Dolares");
                    break;
                default : v_price = 0;
                   System.out.println("El valor del envio es de "+ v_price +" Dolares");
                   break;
               }
            }

        }


    public static void p_show_info_program() {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║--------------SoftPackageValue  VERSION 1.0---------------║");
        System.out.println("║---------MAKER: Cristhian Arley Susano Fernández----------║");
        System.out.println("║---DESCR:This software calculate the price of transport---║");
        System.out.println("║---a package using the heavy and the destination of him---║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }


}
