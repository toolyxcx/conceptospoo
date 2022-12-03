package repaso;

import java.util.Scanner;

public class Libro {

    Scanner leer = new Scanner(System.in);
    // atributos
    private int idLibro;
    public String nombreLibro;
    private String autorLibro;
    private String categoriaLibro;
    private String editorialLibro;

    // metodos
    // 1 constructores
    // 2 accesores
    // 3 propios o personalizados de la clase

    public Libro() {
    }

    // metodo constructor

    public Libro(int idLibro, String nombreLibro, String autorLibro, String categoriaLibro, String editorialLibro) {
        this.idLibro = idLibro;
        this.nombreLibro = nombreLibro;
        this.autorLibro = autorLibro;
        this.categoriaLibro = categoriaLibro;
        this.editorialLibro = editorialLibro;

    }

    // accesores
    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;

    }

    public String getAutorLibro() {
        return autorLibro;

    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    

    public void registrarLinro() {
        System.out.println("ingrese el ID del libro");
        idLibro = leer.nextInt();

        leer.nextLine();// limpieza de bufer

        System.out.println("ingrese el nombre del libro");
        nombreLibro = leer.nextLine();

        System.out.println("ingrese el autor del libro");
        autorLibro = leer.nextLine();

        System.out.println("ingrese la categoria del libro");
        categoriaLibro = leer.nextLine();

        System.out.println("ingrese la editorial del libro");
        editorialLibro = leer.nextLine();

    }

    public void consultarLibro(String nameBook) {
        System.out.println(nombreLibro);
        if (nombreLibro.equals(nameBook)) {
            System.out.println(
                    "el libro" + nombreLibro + "fue escrito por " + autorLibro + "es de la editorial" + editorialLibro);
        } else {
            System.out.println("el libro no existe");
        }
    }

    // sobrecarga de metodos

    public void mostrarLibro() {
        System.out.println("el libro " + nombreLibro + "fue escrito por" + autorLibro);
    }

    public void mostrarLibro(String nombreLibro, String autorLibro) {
        System.out.println("el libro " + nombreLibro + "fue escrito por" + autorLibro);
    }
}
