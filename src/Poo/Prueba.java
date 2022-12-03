package Poo;

import java.util.Scanner;

import javax.sound.midi.Receiver;

public class Prueba {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int op;
        float num1, num2;

        System.out.println("menu opciones \n 1.cuadrado \n 2.rectangulo \n 3.triangulo \n 4.circulo \n ingrese el numero de la opcion que desea realizar");
        op=leer.nextInt();

            switch(op){
            case 1:
            System.out.println("ingrese el lado");
            num1=leer.nextInt();

            Cuadrado c1=new Cuadrado();
            c1.setLado(num1);
            c1.calcularArea();
            break;
            case 2:
            System.out.println("ingrese la base");
            num1=leer.nextInt();
            System.out.println("ingrese el lado");
            num2=leer.nextInt();

            Rectangulo r1=new Rectangulo();
            r1.setBase(num1);
            r1.setLado(num2);
            r1.calcularArea();
            break;
            case 3:
            System.out.println("ingrese la base");
            num1=leer.nextInt();
            System.out.println("ingrese la altura");
            num2=leer.nextInt();

            Triangulo t1=new Triangulo();
            t1.setBase(num1);
            t1.setAltura(num2);
            t1.calcularArea();
            break;
            case 4:
            System.out.println("ingrese el radio");
            num1=leer.nextFloat();

            Circulo ci=new Circulo();
            ci.setRadio(num1);
            ci.calcularArea();
            break;

            
            
                

        }


    

       

        

       
    }

}
