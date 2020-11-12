package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese una linea de texto");
        String linea=entrada.nextLine();
        System.out.println("Ingrese un caracter");
        char caracter= entrada.next().charAt(0);
       contador(linea,caracter);
    }
    public static void contador(String texto,char c){
        char caracteres[]=texto.toCharArray();
        int contador=0;
        for (int x=0;x<caracteres.length;x++){
            if(caracteres[x]==c){
                contador=contador+1;
            }
        }
        System.out.printf("Se encontro %c %d veces \n",c,contador);
    }
}
