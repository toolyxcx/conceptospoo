package Sena;

import java.util.Scanner;

public class Aprendiz {
    // atributo
    public String nombre1;
    public String nombre;
    public int edad;

    // metodos /operaciones
   
    // metodo valor sin retorno
    public void registrar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("su nombre actual es " + nombre1 + " para actualizar resgistre su nombre ");
        nombre1 = leer.nextLine();
        System.out.println("el nombre que ingreso fue " + nombre1);

        leer.close();

    }
    // metodo sin valor de retorno con parametros
    public void cambiarNombre(String newname){
        
        nombre=newname;
        System.out.println("el nuevo nombre es "+nombre);

    }
    // metodo con valor de retorno con parametros
    public int calcularedad(int anioNacimiento){
        edad=2022-anioNacimiento;
        return edad;
    }







}
