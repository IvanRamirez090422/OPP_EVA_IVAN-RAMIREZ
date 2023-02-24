/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_10_return_java;

/**
 *
 * @author user
 */
public class EVA_10_RETURN_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        square (10);//llamada a funcion, pero sin procesar
        int resu;
        resu = square (3);//llamada funcion, almacenando el resultado
        System.out.println(resu);
        System.out.println(square(5));
    }
        public static int square(int num){
            return num* num;
            
        }
               
    
}
