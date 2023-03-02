/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_18_static_java_;

/**
 *
 * @author user
 */
public class EVA_18_STATIC_JAVA_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        prueba obj = new prueba();
        obj.mensaje();
        prueba.mensajeEstatico();
        System.out.println(" PI = " + Math.PI);
       
    }
}

class prueba {

    public void mensaje() {
        System.out.println("holA!!!");
    }

    public static void mensajeEstatico() {
        System.out.println("hola");
    }

}

class otra {
}
