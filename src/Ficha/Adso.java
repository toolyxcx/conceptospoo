package Ficha;

import Sena.Aprendiz;

public class Adso {
    public static void main(String[] args) {

        Aprendiz estudante1 = new Aprendiz();
        estudante1.nombre1 = "user";

        estudante1.registrar();

        estudante1.cambiarNombre("test");
        
        estudante1.calcularedad(2015);
        System.out.println("la edad del estudiante es "+estudante1.edad);

        

    }

}
