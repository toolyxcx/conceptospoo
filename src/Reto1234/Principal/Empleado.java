package Reto1234.Principal;

import java.security.Permission;
import java.util.Scanner;

import Reto1234.Salud.Persona;

public class Empleado extends Persona {

    Scanner leer = new Scanner(System.in);

    // atributos

    private String cargo;
    private int valorhora;
    private int horastrabajadas;
    private String departamento;
    private double honorarios;
    private String tipodoc;
    private String numerodoc;
    private String nomre;
    private String apellido;
    private int valorapagar;

    // metodos
    public void calcularHonorarios() {

        System.out.println("ingrese su tipo de documento");
        tipodoc = leer.nextLine();
        System.out.println("ingrese el numero de documento ");
        numerodoc = leer.nextLine();
        System.out.println("ingrese su nombre");
        nomre = leer.nextLine();
        System.out.println("ingrese su apellido");
        apellido = leer.nextLine();
        System.out.println("ingrese su cargo");
        cargo = leer.nextLine();
        System.out.println("ingrese el numero de horas trabajadas");
        horastrabajadas = leer.nextInt();
        System.out.println("ingrese el valor por hora");
        valorhora = leer.nextInt();
        double reteica = 0.966;
        valorapagar = valorhora * horastrabajadas;

        System.out.println(" su tipo de documento es \n " + tipodoc + " identificado con el numero \n " + numerodoc
                + " identificdo con el nombre \n " + nomre + " y con el apellido \n " + apellido
                + " identificacion del cargo: \n "
                + cargo + " horas trabajadas \n " + horastrabajadas + " el total a pagar es \n " + valorapagar);

    }

}
