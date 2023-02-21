/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_clases_java;

/**
 *
 * @author user
 */
public class EVA_2_CLASES_JAVA {

    public static void main(String[] args) {
//CREAR UN OBJETO
//INSTANCIACION
//INSTANCIAR = DAR MEMORIA RAM
//NOMBRE DE LA CLASE, IDENTIFICADOR = new CONSTRUCTOR DE LA CLASE();

        persona perso1 = new persona();

        /*perso1.apellidos = "Ramirez";   
        perso1.nombre="ivan";
               System.out.1println(perso1.nombre + " " + perso1.apellidos);/**/
       
        System.out.println(perso1);
        //Ivan Ramirez

        perso1.setNombre("Ivan");
        perso1.setApellido(Ramirez);
        perso1.setGenero('H');
        perso1.setEdad(18);
        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellido());
        System.out.println(perso1.getEdad());
        System.out.println(perso1.getGenero());
        perso1.imprimirDatos();
        //----    //COSNTRUCTOR
        persona perso2 = new persona ();
        perso2.setEdad(20);
        perso2.getApellido("Parra");
        perso2.setNombre(Maria);
        perso2.setGenero('M');
         perso2.imprimirDatos();
    }

}
