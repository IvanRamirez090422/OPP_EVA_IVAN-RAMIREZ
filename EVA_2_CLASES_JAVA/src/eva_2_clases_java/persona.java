/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_clases_java;

/**
 *
 * @author user
 */
public class persona {

    private char Genero;
    private int Edad;
    private String Nombre;
    private String Apellido;
    

    public int getEdad() {
        return Edad;

    }

    public void setEdad(int edad) {
        this.Edad = edad;

    }

    public String getNombre() {
        return Nombre;

    }

    public void setNombre(String nombre) {
       this.Nombre = nombre;
        
    }

    public String getApellido(String Apellido) {
           return Apellido;

    }

    public void setApellido(String Apellidos) {
        this.Apellido = Apellidos;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char genero) {
        this.Genero = genero;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + Nombre + " " + Apellido);
        System.out.println("Edad:" + Edad);
        System.out.println("Genero:" + Genero);
        if (Genero == 'H') {
            System.out.println("Hombre");
        } else if (Genero == 'M') {
            System.out.println("Mujer");
        } else {
    System.out.println("Genero no registrado");
        }
    }
}
