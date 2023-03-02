/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author user
 */
public class ClaseA {
//TODAS ESTAAS CLASES ESTAN EN PAQUETE 1.
    //MISMO PAQUETE PUBLIC Y DEFAULT SON VISIBLES.
    //CLASES DE PAQUETE 2

    public int publicA;
    int defaultA;
    private int privateA;

    public void prueba() {
        ClaseC objC = new ClaseC();
        //objC.publicC;
        //objC.defaultC;
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        ClaseD objD = new ClaseD();
        //objD.publicD;
        //objD.defaultD;
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
       // ClaseE objF = new ClaseF();
//ClaseF es DEFAULT Y NO ES VISIBLE EN OTRO PAQUETE.
    }

}

class ClaseB {

    public int publicB;
    int defaultB;
    private int privateB;
}
