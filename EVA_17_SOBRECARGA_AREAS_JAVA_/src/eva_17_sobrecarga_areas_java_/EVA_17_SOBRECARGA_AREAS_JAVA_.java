/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_17_sobrecarga_areas_java_;

/**
 *
 * @author user
 */
public class EVA_17_SOBRECARGA_AREAS_JAVA_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//CIRCULO: PI * RADIO*RADIO
//TRIANGULO: BASE *ALTURA / 2
//TRAPECIO: ALTURA (BASE MAYOR + BASE MENOR)/2
//DOUBLE

System.out.println("circulo = " + calcularArea (5.0));

    }
    public static double calcularArea(double radio){
    return Math.PI * radio *radio;
    
}
    
    public static double calcularArea(double base, double altura){
    return (base *altura) /2.0;
}    
    
    public static double calcularArea(double base, double altura){
    return (altura * base mayor * base menor) /2.0;
    
}

    
    
    
  
    
}
