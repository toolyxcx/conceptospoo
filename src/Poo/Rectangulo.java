package Poo;

public class Rectangulo extends Figura{
    // atributos
    private float base, lado;

    // metodos
    public Rectangulo() {
    }

    public Rectangulo(float base, float lado) {
        this.base = base;
        this.lado = lado;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        float area= base*lado;
        System.out.println("el area del rectangulo es "+area);
        
    }

}
