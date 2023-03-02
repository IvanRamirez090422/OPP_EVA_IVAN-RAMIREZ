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
public class ClaseC {

    public int publicC;
    int defaultC;
    private int privateC;

    public void prueba() {
        ClaseB objB = new ClaseB();
//objB.defaultB;
//objB.publicB;
        ClaseE objE = new ClaseE();
        //objB.defaultB;
//objB.publicB;
        // ClaseF objF = new ClaseF();
//CLASE F ESTA EN OTRO PAQUETE Y ES DEFAULT Y PARA NOSOTRO ES INEXISTENTE
    }
}

class ClaseD {

    public int publicD;
    int defaultD;
    private int privateD;
}
