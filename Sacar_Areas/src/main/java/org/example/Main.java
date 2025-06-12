package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ayuda222");
        System.out.println("Menu de opciones");
        System.out.println("1.Area de un cuadrado \n" +
                "2.Area de un triangulo \n" +
                "3.Areas de un rectangulo \n" +
                "4.Area de un circulo\n" +
                "5.Salir");
        System.out.println("Escoja una opcion:");
        int op=sc.nextInt();

        switch (op){
            case 1:
                System.out.println("Ingresa el lado del cuadrado");
                int lado_cuadrado = 0 ;
                lado_cuadrado = sc.nextInt();
                int total_cuadrado = lado_cuadrado * lado_cuadrado;
                System.out.println("El area total es: " + total_cuadrado);
                break;
            case 2:
                System.out.println("Ingresa la base");
                int base=sc.nextInt();
                System.out.println("Ingresa la altura:");
                int altura=sc.nextInt();
                int total=(base*altura)/2;
                System.out.println("El area total es: " + total);

                break;
            case 3:
                System.out.println("Ingresa la base");
                int base2=sc.nextInt();
                System.out.println("Ingresa la altura:");
                int altura2=sc.nextInt();
                int total1=(base2*altura2);
                System.out.println("El area total es: " + total1);
                break;
            case 4:
                System.out.println("Ingresa el radio:");
                int radio= sc.nextInt();
                int r=(radio*radio);
                float total3= (float) (3.1416*r);
                System.out.println("El area total es:"  +total3);


                break;
            case 5:
                System.out.println("Saliendo....");
                break;

            default:
                System.out.println("Numero no valido");
                break;
        }

        }
    }
