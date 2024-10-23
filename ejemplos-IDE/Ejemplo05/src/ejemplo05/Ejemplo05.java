/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo05;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----------------");
        System.out.println(10 / 3);
        
        System.out.println("----------------");
        System.out.println(10 / 3.0);
        
        System.out.println("----------------");
        System.out.println(10 / 3.0 + 1);
        System.out.println(10 / (3.0 + 1));
        
        System.out.println("----------------");
        // esta operación es para hacer el cálculo del residuo
        System.out.println(10 % 3 );
        
        System.out.println("----------------");
        // esta operación es para elevar cualquier número que se desee
        System.out.println(Math.pow(10, 2));
        
        System.out.println("----------------");
        // esta operación sirve para sacar la raíz a culquier número 
        System.out.println(Math.sqrt(16));
        
        double m = Math.sqrt(16);
        System.out.println(m);
        
    }

}
