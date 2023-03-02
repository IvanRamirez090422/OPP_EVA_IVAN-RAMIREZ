/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

import Paquete1.ClaseA;

/**
 *
 * @author user
 */
public class ClaseE {

    public int publicE;
    int defaultE;
    private int privateE;

}

class ClaseF {

    public int publicF;
    int defaultF;
    private int privateF;

    public void prueba() {
        ClaseA objA = new ClaseA();
        //objA.publicA;
        //objA.defaultA;
        //ClaseD objD = new ClaseD();
         //La claseD es invisible por que esta en otro paquete.
    }
}
