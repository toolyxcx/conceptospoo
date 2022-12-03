package Poo;

public class Circulo extends Figura {
    // atributos
    private float radio;

    // metodos
    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double pi=3.1416;
        double radio1=Math.pow(radio, 2);
        double area=pi*radio1;
        System.out.println("el area del circulo es "+area);
    }

}
