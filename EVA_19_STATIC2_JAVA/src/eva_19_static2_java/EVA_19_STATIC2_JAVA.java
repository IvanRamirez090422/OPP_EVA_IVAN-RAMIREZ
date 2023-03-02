/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_19_static2_java;

/**
 *
 * @author user
 */
public class EVA_19_STATIC2_JAVA {

    int x = 10;

    public static void main(String[] args) {
        // TODO code application logic here
        EVA_19_STATIC2_JAVA obj = new EVA_19_STATIC2_JAVA();
        System.out.println(obj.x);
        
        //AHORA LOS METODOS ESTATICOS
        
        MensajeEstatico();

    }

    public void MensajeNoeEstatico() {//NO EXISTE
        System.out.println("MENSAJE NO ESTATICO");
    }

    public static void MensajeEstatico() {//NO EXISTE
        System.out.println("MENSAJE ESTATICO");
    }
}
