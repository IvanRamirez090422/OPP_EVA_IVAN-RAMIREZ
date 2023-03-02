/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_16_sobrecarga2_java_;

/**
 *
 * @author user
 */
public class EVA_16_SOBRECARGA2_JAVA_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("suma" + suma(4, 9));
        System.out.println("suma" + suma(4.0, 9.0));
        System.out.println("suma" + suma("hola", " mundo"));

    }

    public static int suma(int val1, int val2) {
        return val1 + val2;
    }

    public static double suma(double val1, double val2) {
        return val1 + val2;
    }
//suma Strin string

    public static String suma(String val1, String val2) {
        return val1 + val2;
    }
    
    public static void suma() {
        System.out.println("suma sin argumentos");
    }
    
}
