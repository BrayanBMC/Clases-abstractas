
package com.mycompany.tarea;

import java.util.Scanner;

public class Tarea {

    public static void main(String[] args) {
        Scanner objSC =new Scanner (System.in); 
        System.out.print("ingrese nombre: ");
        String nom=objSC.nextLine();
        System.out.println("Hola mundo: "+nom);
    }
}
