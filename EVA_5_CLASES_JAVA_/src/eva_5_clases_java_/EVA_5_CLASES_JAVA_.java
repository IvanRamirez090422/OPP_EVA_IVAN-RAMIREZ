/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_5_clases_java_;

/**
 *
 * @author user
 */
public class EVA_5_CLASES_JAVA_ {

    public static void main(String[] args) {
        Circulo cir1 = new Circulo();

        Circulo cir2 = new Circulo(100);
        System.out.println("Area: " + cir1.calcularArea(cir1.getRadio(),Math.PI));
        System.out.println("perimetro: " + cir1.calcularperimetro(cir1.getRadio(),Math.PI));
         System.out.println("Area: " + cir2.calcularArea(cir2.getRadio(),Math.PI));
        System.out.println("perimetro: " + cir2.calcularperimetro(cir2.getRadio(),Math.PI));
        
        
    }
    
}
