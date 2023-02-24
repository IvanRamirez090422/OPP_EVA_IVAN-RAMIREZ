/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_14_alcance_3_java_;

/**
 *
 * @author user
 */
public class EVA_14_ALCANCE_3_JAVA_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  x =100;
        System.out.println(x);//visible en el main
        for (int i = 0; i < args.length; i++) {
           // int x = 100;// no se puede por que existe en el main
            System.out.println(x);
            System.out.println(i);
            if (i==5){
                System.out.println(x);
            }
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println(i);
            
        }
    }
    public static void algo(int x){
        
    }
    
    public static void algo2(int x){
        
    }
}
