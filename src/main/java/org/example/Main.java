package org.example;

import models.Persona;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("INGRESANDO DATOS");
        System.out.println("--------------------------------------");
        ArrayList<Persona> obj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op = 1;
        while(op ==1 ) {

            System.out.println("Ingrese un nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese un apellido: ");
            String apellido = sc.nextLine();
            System.out.println("Ingrese dia: ");
            int dia = sc.nextInt();
            System.out.println("Ingrese mes: ");
            int mes = sc.nextInt();
            System.out.println("Ingrese anio: ");
            int anio = sc.nextInt();
            Date nacimiento = new Date(anio, mes, dia);

            Persona aux = new Persona();
            aux.setNombre(nombre);
            aux.setApellido(apellido);
            aux.setNacimiento(nacimiento);
            obj.add(aux);

            System.out.println("Quiere ingresar persona(1): ");
            op = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("MOSTRAR DATOS");
        System.out.println("--------------------------------------");
        for(Persona aux : obj )
        {
            System.out.println("Nombre: " + aux.getNombre());
            System.out.println("Apellido: " + aux.getApellido());
            System.out.println("Nacimiento: " + aux.getNacimiento());
        }
    }
}