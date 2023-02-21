/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_5_clases_java_;

public class Circulo {

    /*
    construir default
    constructor con argumentos
    
    Implementar los atributos get y set
    para que regresen (return) el valor numerico de area y perimetro
     */
    

    private double radio;
    private double pi;

    public Circulo() {
        radio = 5;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double calcularArea(double radio, double pi) {
        double area = pi*radio*radio;
        return area;
    }
public double calcularperimetro (double radio, double pi){ 
    double perimetro = pi*radio * 2;
    
    return  perimetro;
}
}
