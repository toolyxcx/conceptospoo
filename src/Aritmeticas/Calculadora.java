package Aritmeticas;

import java.util.Scanner;

public class Calculadora {
    // Atributos
    int num1;
    int num2;
    int resultado;
    int numayor;

    // metodos

    // metodo sin valor de retorno que sume los dos numeros
    public void sumarNumeros() {
        Scanner leer = new Scanner(System.in);
        System.out.println("registre el primer numero");
        num1 = leer.nextInt();
        System.out.println("registre el segundo numero");
        num2 = leer.nextInt();
        resultado = num1 + num2;
        System.out.println("el resultado es " + resultado);

        leer.close();
    }

    // metodo con valor de retorno que reste los dos numeros
    public int restarNumeros(int n1, int n2){

        int restar=n1-n2;
        return restar;
    }

    // metodo con valor de retorno que devuelva cual es numero mayor
    public int numeroMayor(int nu1, int nu2 ){
        
        if(nu1>nu2){
            System.out.println("el numero "+nu1+" es mayor que"+nu2 );

        }
        else{
            System.out.println("el numero "+nu2+" es mayor que "+nu1 );

        }
        return numayor; 

    }

    // metodo sin valor de retorno que devuelva cual es el numero menor

    // metodo con valor de retorno que eleve cada numero al exponente que sea
    // indicado por el usuario

}
