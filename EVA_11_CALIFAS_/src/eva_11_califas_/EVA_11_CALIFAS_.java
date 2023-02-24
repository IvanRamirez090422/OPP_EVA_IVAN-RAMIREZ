/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_11_califas_;

/**
 *
 * @author user
 */
public class EVA_11_CALIFAS_ {

    //metodo que reciba un entero y devuelva una letra
     // DE 91 A 100 A
     //81 A 90 B
     //71 A 80 C
     //MENOR A 70 D
     
    public static void main(String[] args) {
     String resul;
    resul= calificar(80);
    
    
        
        System.out.println(resul);
        System.out.println(calificar(70));
    }
    public static String calificar(int califa){
        String resu="";
        if((califa>= 91) &&(califa <=100)){
           resu="A";
    }
          if((califa>= 81) &&(califa <=90)){
               resu= "B";
    }      
          if((califa>= 71) &&(califa <=80)){
             resu= "C";
    }
        return resu;
        }
    }
        
        